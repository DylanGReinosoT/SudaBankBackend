package com.sudamericano.bank.application.service.structure.R21;

import com.sudamericano.bank.application.usecase.structure.R21.R21CabeceraUseCase;
import com.sudamericano.bank.domain.model.structure.R21.R21Cabecera;
import com.sudamericano.bank.domain.port.structure.R21.R21RepositoryPort;
import com.sudamericano.bank.infrastructure.report.structure.R21.R21PdfReportGenerator;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@Slf4j
@Service
@RequiredArgsConstructor
public class R21CabeceraService implements R21CabeceraUseCase {

    private final R21RepositoryPort repositoryPort;
    private final R21PdfReportGenerator reportGenerator;

    @Override
    @Transactional
    public R21Cabecera create(R21Cabecera r21Cabecera) {
        log.info("Creando nuevo registro R21 con fecha corte: {}", r21Cabecera.getFechaCorte());
        r21Cabecera.setFechaCarga(LocalDateTime.now());
        if (r21Cabecera.getDetalles() != null) {
            r21Cabecera.setTotalRegistros(r21Cabecera.getDetalles().size());
        } else {
            r21Cabecera.setTotalRegistros(0);
        }
        return repositoryPort.save(r21Cabecera);
    }

    @Override
    @Transactional
    public R21Cabecera update(Long id, R21Cabecera r21Cabecera) {
        log.info("Actualizando registro R21 con id: {}", id);
        return repositoryPort.findById(id)
                .map(existing -> {
                    r21Cabecera.setId(id);
                    r21Cabecera.setFechaCarga(existing.getFechaCarga());
                    if (r21Cabecera.getDetalles() != null) {
                        r21Cabecera.setTotalRegistros(r21Cabecera.getDetalles().size());
                    }
                    return repositoryPort.save(r21Cabecera);
                })
                .orElseThrow(() -> new IllegalArgumentException("R21 con id " + id + " no encontrado"));
    }

    @Override
    @Transactional(readOnly = true)
    public Optional<R21Cabecera> getById(Long id) {
        log.debug("Buscando R21 con id: {}", id);
        return repositoryPort.findById(id);
    }

    @Override
    @Transactional(readOnly = true)
    public List<R21Cabecera> getAll() {
        log.debug("Obteniendo todos los registros R21");
        return repositoryPort.findAll();
    }

    @Override
    @Transactional
    public void delete(Long id) {
        log.info("Eliminando registro R21 con id: {}", id);
        repositoryPort.deleteById(id);
    }

    @Override
    @Transactional(readOnly = true)
    public byte[] getReport(Long id) {
        log.info("Generando reporte PDF para R21 con id: {}", id);
        return repositoryPort.findById(id)
                .map(reportGenerator::generateReport)
                .orElseThrow(() -> new IllegalArgumentException("R21 con id " + id + " no encontrado"));
    }
}
