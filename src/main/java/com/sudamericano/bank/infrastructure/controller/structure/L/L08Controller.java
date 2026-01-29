package com.sudamericano.bank.infrastructure.controller.structure.L;

import com.sudamericano.bank.domain.model.catalog.T59Dto;
import com.sudamericano.bank.domain.model.catalog.T62Dto;
import com.sudamericano.bank.domain.model.structure.L.L08Dto;
import com.sudamericano.bank.domain.ports.inputs.catalog.*;
import com.sudamericano.bank.domain.ports.inputs.structure.L.L08UseCase;
import com.sudamericano.bank.infrastructure.outputs.ReportDto;
import com.sudamericano.bank.infrastructure.outputs.ResponseDTO;
import com.sudamericano.bank.infrastructure.outputs.structure.L.report.L08ReportResponse;
import com.sudamericano.bank.infrastructure.outputs.structure.L.resume.L08ResumeResponse;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Tag(name = "Structure L08", description = "Structure L08 management endpoints")
@RestController
@RequestMapping("/api/structures/L08")
public class L08Controller {
    private final L08UseCase useCase;
    private final T59UseCase t59UseCase;
    private final CatalogT4UseCase catalogT4UseCase;
    private final T62UseCase t62UseCase;
    private final T65UseCase t65UseCase;
    private final T66UseCase t66UseCase;

    public L08Controller(L08UseCase useCase, T59UseCase t59UseCase, CatalogT4UseCase catalogT4UseCase, T62UseCase t62UseCase, T65UseCase t65UseCase, T66UseCase t66UseCase) {
        this.useCase = useCase;
        this.t59UseCase = t59UseCase;
        this.catalogT4UseCase = catalogT4UseCase;
        this.t62UseCase = t62UseCase;
        this.t65UseCase = t65UseCase;
        this.t66UseCase = t66UseCase;
    }

    @GetMapping
    public List<L08Dto> getAll() {
        return useCase.findAll();
    }

    @GetMapping("/resume")
    public List<L08ResumeResponse> getAllResume(){
        List<L08ResumeResponse> resumes = new java.util.ArrayList<>(List.of());

        for (L08Dto dto : useCase.findAll()){
            L08ResumeResponse resume = new L08ResumeResponse();

            T59Dto liquidez = t59UseCase.findById(dto.getCodigoLiquidez());
            if(liquidez != null){
                resume.setCodigoLiquidez(new ResponseDTO(liquidez.getId(), liquidez.getDescripcion()));
            }

            catalogT4UseCase.getAllCatalogT4().stream().filter(x -> x.getId() == (dto.getTipoIdentificacionEntidad()))
                    .findFirst()
                    .ifPresent(catalogT4 -> resume.setTipoIdentificacionEntidad(
                            new ResponseDTO(catalogT4.getId(), catalogT4.getDescripcion())
                    ));

            T62Dto instrumento = t62UseCase.findById(dto.getTipoInstrumento());
            if (instrumento != null){
                resume.setTipoInstrumento(new ResponseDTO(instrumento.getId(), instrumento.getDescripcion()));
            }

            t65UseCase.findAll().stream().filter(x -> x.getId()  == (dto.getCalificacionEntidad()))
                    .findFirst()
                    .ifPresent(t65 -> resume.setCalificacionEntidad(
                            new ResponseDTO(t65.getId(), t65.getDescripcion())
                    ));

            t66UseCase.findAll().stream().filter(x -> x.getId() == (dto.getCalificadoraRiesgo()))
                    .findFirst()
                    .ifPresent(t66 -> resume.setCalificadoraRiesgo(
                            new ResponseDTO(t66.getId(), t66.getDescripcion())
                    ));


            resume.setIdentificacionEntidad(dto.getIdentificacionEntidad());
            resumes.add(resume);

        }
        return resumes;
    }

    @GetMapping("/report")
    public List<L08ReportResponse> getReport(){
        List<L08ReportResponse> reports = new java.util.ArrayList<>(List.of());

        for (L08Dto dto : useCase.findAll()) {
            L08ReportResponse report = new L08ReportResponse();

            // Código de Liquidez
            T59Dto liquidez = t59UseCase.findById(dto.getCodigoLiquidez());
            if (liquidez != null) {
                report.setCodigoLiquidez(new ReportDto(liquidez.getId(), liquidez.getCodigo(), liquidez.getDescripcion()));
            }

            // Tipo de Identificación Entidad
            catalogT4UseCase.getAllCatalogT4().stream()
                    .filter(x -> x.getId() == (dto.getTipoIdentificacionEntidad()))
                    .findFirst()
                    .ifPresent(catalogT4 ->
                            report.setTipoIdentificacionEntidad(new ReportDto(catalogT4.getId(), catalogT4.getCodigo(), catalogT4.getDescripcion()))
                    );

            // Identificación de la Entidad
            report.setIdentificacionEntidad(dto.getIdentificacionEntidad());

            // Tipo de Instrumento
            T62Dto instrumento = t62UseCase.findById(dto.getTipoInstrumento());
            if (instrumento != null) {
                report.setTipoInstrumento(new ReportDto(instrumento.getId(), instrumento.getCodigo(), instrumento.getDescripcion()));
            }

            // Calificación de la Entidad
            t65UseCase.findAll().stream()
                    .filter(x -> x.getId() == (dto.getCalificacionEntidad()))
                    .findFirst()
                    .ifPresent(t65 ->
                            report.setCalificacionEntidad(new ReportDto(t65.getId(), t65.getCodigo(), t65.getDescripcion()))
                    );

            // Calificadora de Riesgo
            t66UseCase.findAll().stream()
                    .filter(x -> x.getId() == (dto.getCalificadoraRiesgo()))
                    .findFirst()
                    .ifPresent(t66 ->
                            report.setCalificadoraRiesgo(new ReportDto(t66.getId(), t66.getCodigo(), t66.getDescripcion()))
                    );

            // Valores de lunes a viernes
            report.setLunes(dto.getLunes());
            report.setMartes(dto.getMartes());
            report.setMiercoles(dto.getMiercoles());
            report.setJueves(dto.getJueves());
            report.setViernes(dto.getViernes());

            reports.add(report);
        }

        return reports;
    }



    @GetMapping("/{id}")
    public L08Dto getById(@PathVariable Long id) {
        return useCase.findById(id);
    }

    @PostMapping
    public L08Dto create(@RequestBody L08Dto dto) {
        return useCase.create(dto);
    }

    @PutMapping("/{id}")
    public L08Dto update(@PathVariable Long id, @RequestBody L08Dto dto) {
        return useCase.update(id, dto);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        useCase.delete(id);
    }
}
