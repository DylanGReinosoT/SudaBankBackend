package com.sudamericano.bank.infrastructure.controller.structure.L;

import com.sudamericano.bank.domain.model.catalog.*;
import com.sudamericano.bank.domain.model.structure.L.L05Dto;
import com.sudamericano.bank.domain.ports.inputs.catalog.*;
import com.sudamericano.bank.domain.ports.inputs.structure.L.L05UseCase;
import com.sudamericano.bank.infrastructure.outputs.ReportDto;
import com.sudamericano.bank.infrastructure.outputs.ResponseDTO;
import com.sudamericano.bank.infrastructure.outputs.structure.L.report.L05ReportResponse;
import com.sudamericano.bank.infrastructure.outputs.structure.L.resume.L05ResumeResponse;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Tag(name = "Structure L05", description = "Structure L05 management endpoints")
@RestController
@RequestMapping("/api/structures/l05")
public class L05Controller {
    private final L05UseCase useCase;
    private final CatalogT4UseCase catalogT4UseCase;
    private final T164UseCase t164UseCase;
    private final T172UseCase t172UseCase;
    private final T33UseCase t33UseCase;
    private final T65UseCase t65UseCase;
    private final T66UseCase t66UseCase;

    public L05Controller(L05UseCase useCase,
                         CatalogT4UseCase catalogT4UseCase,
                         T164UseCase t164UseCase,
                         T172UseCase t172UseCase,
                         T33UseCase t33UseCase,
                         T65UseCase t65UseCase,
                         T66UseCase t66UseCase
                         ) {
        this.useCase = useCase;
        this.catalogT4UseCase = catalogT4UseCase;
        this.t164UseCase = t164UseCase;
        this.t172UseCase = t172UseCase;
        this.t33UseCase = t33UseCase;
        this.t65UseCase = t65UseCase;
        this.t66UseCase = t66UseCase;
    }

    @GetMapping
    public List<L05Dto> getAll() {
        return useCase.findAll();
    }

    @GetMapping("/resume")
    public List<L05ResumeResponse> getAllResume() {
        List<L05ResumeResponse> resumes = new java.util.ArrayList<>(List.of());

        for (L05Dto dto : useCase.findAll()) {
            L05ResumeResponse resume = new L05ResumeResponse();

            catalogT4UseCase.getAllCatalogT4().stream().filter(x -> x.getId() == (dto.getCodigoTipoIdentificacion()))
                    .findFirst()
                    .ifPresent(catalogT4 -> resume.setTipoIdentificacion(
                            new ResponseDTO(catalogT4.getId(), catalogT4.getDescripcion())
                    ));

            T164Dto emisor = t164UseCase.findById(dto.getCodigoDepositario());
            if (emisor != null) {
                resume.setDepositario(new ResponseDTO(emisor.getId(), emisor.getDescripcion()));
            }

            T172Dto tipoDeposito = t172UseCase.findById (dto.getCodigoTipoDeposito());
            if (tipoDeposito != null) {
                resume.setTipoDeposito(new ResponseDTO(tipoDeposito.getId(), tipoDeposito.getDescripcion()));
            }

            T33Dto moneda = t33UseCase.findById(dto.getCodigoMoneda());
            if (moneda != null) {
                resume.setMoneda(new ResponseDTO(moneda.getId(), moneda.getDescripcion()));
            }

            resume.setCuentaContable(dto.getCuentaContable());
            resume.setNumeroIdentificacionDeposito(dto.getNumeroIdentificacionDeposito());
            resume.setValorMonedaDenominacion(dto.getValorMonedaDenominacion());
            resumes.add(resume);
        }

        return resumes;
    }

    @GetMapping("/report")
    public List<L05ReportResponse> getAllReport(){
        List<L05ReportResponse> reports = new java.util.ArrayList<>(List.of());

        for (L05Dto dto : useCase.findAll()) {
            L05ReportResponse report = new L05ReportResponse();

            catalogT4UseCase.getAllCatalogT4().stream().filter(x -> x.getId() == (dto.getCodigoTipoIdentificacion()))
                    .findFirst()
                    .ifPresent(catalogT4 -> report.setTipoIdentificacion(
                            new ReportDto(catalogT4.getId(), catalogT4.getCodigo(),catalogT4.getDescripcion())
                    ));

            T164Dto emisor = t164UseCase.findById(dto.getCodigoDepositario());
            if (emisor != null) {
                report.setDepositario(new ReportDto(emisor.getId(), emisor.getCodigo(), emisor.getDescripcion()));
            }

            T172Dto tipoDeposito = t172UseCase.findById (dto.getCodigoTipoDeposito());
            if (tipoDeposito != null) {
                report.setTipoDeposito(new ReportDto(tipoDeposito.getId(), tipoDeposito.getCodigo(),tipoDeposito.getDescripcion()));
            }

            T33Dto moneda = t33UseCase.findById(dto.getCodigoMoneda());
            if (moneda != null) {
                report.setMoneda(new ReportDto(moneda.getId(), moneda.getCodigo(),moneda.getDescripcion()));
            }

            T65Dto codigoCalificacionRiesgoDepositario = t65UseCase.findById(dto.getCodigoCalificacionRiesgoDepositario());
            if (codigoCalificacionRiesgoDepositario != null) {
                report.setCodigoCalificacionRiesgoDepositario(new ReportDto(codigoCalificacionRiesgoDepositario.getId(),
                        codigoCalificacionRiesgoDepositario.getCodigo(),
                        codigoCalificacionRiesgoDepositario.getDescripcion()));
            }

            T66Dto codigoCalificacionRiesgo = t66UseCase.findById(dto.getCodigoCalificacionRiesgo());
            if (codigoCalificacionRiesgo != null) {
                report.setCodigoCalificacionRiesgo(new ReportDto(codigoCalificacionRiesgo.getId(),
                        codigoCalificacionRiesgo.getCodigo(),
                        codigoCalificacionRiesgo.getDescripcion()));
            }

            report.setCuentaContable(dto.getCuentaContable());
            report.setNumeroIdentificacionDeposito(dto.getNumeroIdentificacionDeposito());
            report.setValorMonedaDenominacion(dto.getValorMonedaDenominacion());
            report.setValorLibrosDolares(dto.getValorLibrosDolares());
            report.setFechaUltimaCalificacion(dto.getFechaUltimaCalificacion());
            reports.add(report);

        }

        return reports;
    }

    @GetMapping("/{id}")
    public L05Dto getById(@PathVariable Integer id) {
        return useCase.findById(id);
    }

    @PostMapping
    public L05Dto create(@RequestBody L05Dto dto) {
        return useCase.create(dto);
    }

    @PutMapping("/{id}")
    public L05Dto update(@PathVariable Integer id, @RequestBody L05Dto dto) {
        return useCase.update(id, dto);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id) {
        useCase.delete(id);
    }
}
