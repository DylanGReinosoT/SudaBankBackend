package com.sudamericano.bank.infrastructure.controller.structure.L;

import com.sudamericano.bank.domain.model.catalog.*;
import com.sudamericano.bank.domain.model.structure.L.L04Dto;
import com.sudamericano.bank.domain.ports.inputs.catalog.*;
import com.sudamericano.bank.domain.ports.inputs.structure.L.L04UseCase;
import com.sudamericano.bank.infrastructure.outputs.ResponseDTO;
import com.sudamericano.bank.infrastructure.outputs.structure.L.resume.L04ResumeResponse;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Tag(name = "Structure L04", description = "Structure L04 management endpoints")
@RestController
@RequestMapping("/api/structures/L04")
public class L04Controller {
    private final L04UseCase useCase;
    private final CatalogT4UseCase catalogT4UseCase;
    private final T164UseCase t164UseCase;
    private final T170UseCase t170UseCase;

    public L04Controller(L04UseCase useCase,
                         CatalogT4UseCase catalogT4UseCase,
                         T164UseCase t164UseCase,
                         T170UseCase t170UseCase) {
        this.useCase = useCase;
        this.catalogT4UseCase = catalogT4UseCase;
        this.t164UseCase = t164UseCase;
        this.t170UseCase = t170UseCase;
    }

    @GetMapping
    public List<L04Dto> getAll() {
        return useCase.findAll();
    }

    @GetMapping("/resume")
    public List<L04ResumeResponse> getAllResume() {
        List<L04ResumeResponse> resumes = new java.util.ArrayList<>(List.of());

        for (L04Dto dto : useCase.findAll()) {
            L04ResumeResponse resume = new L04ResumeResponse();
            catalogT4UseCase.getAllCatalogT4().stream().filter(x -> x.getId() == (dto.getCodigoTipoIdentificacion()))
                    .findFirst()
                    .ifPresent(catalogT4 -> resume.setTipoIdentificacion(
                            new ResponseDTO(catalogT4.getId(), catalogT4.getDescripcion())
                    ));

            T164Dto emisor = t164UseCase.findById(dto.getCodigoEmisor());
            if (emisor != null) {
                resume.setEmisor(new ResponseDTO(emisor.getId(), emisor.getDescripcion()));
            }

            T170Dto motivoTransferencia =t170UseCase.findById(dto.getCodigoMotivoTransferencia());
            if (motivoTransferencia != null) {
                resume.setMotivoTransferencia(new ResponseDTO(motivoTransferencia.getId(), motivoTransferencia.getDescripcion()));
            }


            resume.setNumeroTitulo(dto.getNumeroTitulo());
            resume.setFechaEmision(dto.getFechaEmision());
            resume.setFechaCompra(dto.getFechaCompra());
            resume.setFechaTransferencia(dto.getFechaTransferencia());

            resume.setCuentaDestino(dto.getCuentaDestino());
            resume.setCuentaOrigen(dto.getCuentaOrigen());
            resume.setValorLibrosCuentaDestino(dto.getValorLibrosCuentaOrigen());
            resume.setValorLibrosCuentaOrigen(dto.getValorLibrosCuentaOrigen());

            resumes.add(resume);
        }
        return  resumes;
    }

    @GetMapping("/report")
    public List<L04ResumeResponse> getAllReport() {
        List<L04ResumeResponse> reports = new java.util.ArrayList<>(List.of());

        for (L04Dto dto : useCase.findAll()) {
            L04ResumeResponse report = new L04ResumeResponse();
            catalogT4UseCase.getAllCatalogT4().stream().filter(x -> x.getId() == (dto.getCodigoTipoIdentificacion()))
                    .findFirst()
                    .ifPresent(catalogT4 -> report.setTipoIdentificacion(
                            new ResponseDTO(catalogT4.getId(), catalogT4.getDescripcion())
                    ));

            T164Dto emisor = t164UseCase.findById(dto.getCodigoEmisor());
            if (emisor != null) {
                report.setEmisor(new ResponseDTO(emisor.getId(), emisor.getDescripcion()));
            }

            report.setNumeroTitulo(dto.getNumeroTitulo());
            report.setFechaEmision(dto.getFechaEmision());
            report.setFechaCompra(dto.getFechaCompra());
            report.setCuentaOrigen(dto.getCuentaOrigen());
            report.setValorLibrosCuentaOrigen(dto.getValorLibrosCuentaOrigen());
            report.setValorLibrosCuentaDestino(dto.getValorLibrosCuentaDestino());
            report.setFechaTransferencia(dto.getFechaTransferencia());

            T170Dto motivoTransferencia = t170UseCase.findById(dto.getCodigoMotivoTransferencia());
            if (motivoTransferencia != null) {
                report.setMotivoTransferencia(new ResponseDTO(motivoTransferencia.getId(), motivoTransferencia.getDescripcion()));
            }

            reports.add(report);
        }
        return reports;
    }


    @GetMapping("/{id}")
    public L04Dto getById(@PathVariable Long id) {
        return useCase.findById(id);
    }


    @PostMapping
    public L04Dto create(@RequestBody L04Dto dto) {
        return useCase.create(dto);
    }

    @PutMapping("/{id}")
    public L04Dto update(@PathVariable Long id, @RequestBody L04Dto dto) {
        return useCase.update(id, dto);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        useCase.delete(id);
    }
}
