package com.sudamericano.bank.infrastructure.controller.structure.L;

import com.sudamericano.bank.domain.model.catalog.T9Dto;
import com.sudamericano.bank.domain.model.structure.L.L07Dto;
import com.sudamericano.bank.domain.ports.inputs.catalog.CatalogT4UseCase;
import com.sudamericano.bank.domain.ports.inputs.catalog.CatalogT73UseCase;
import com.sudamericano.bank.domain.ports.inputs.catalog.T9UseCase;
import com.sudamericano.bank.domain.ports.inputs.structure.L.L07UseCase;
import com.sudamericano.bank.infrastructure.outputs.ReportDto;
import com.sudamericano.bank.infrastructure.outputs.ResponseDTO;
import com.sudamericano.bank.infrastructure.outputs.structure.L.report.L07ReportResponse;
import com.sudamericano.bank.infrastructure.outputs.structure.L.resume.L07ResumeResponse;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Tag(name = "L07Controller", description = "Controller for L07 operations")
@RestController
@RequestMapping("/api/structures/L07")
public class L07Controller {
    private final L07UseCase useCase;
    private final CatalogT4UseCase catalogT4UseCase;
    private final T9UseCase t9UseCase;
    private final CatalogT73UseCase catalogT73;

    public L07Controller(L07UseCase useCase, CatalogT4UseCase catalogT4UseCase, T9UseCase t9UseCase, CatalogT73UseCase catalogT73) {
        this.useCase = useCase;
        this.catalogT4UseCase = catalogT4UseCase;
        this.t9UseCase = t9UseCase;
        this.catalogT73 = catalogT73;
    }

    @GetMapping
    public List<L07Dto> getAll() {
        return useCase.findAll();
    }

    @GetMapping("/resume")
    public List<L07ResumeResponse> getAllResume(){
        List<L07ResumeResponse> resumes = new java.util.ArrayList<>(List.of());

        for(L07Dto dto : useCase.findAll()){
            L07ResumeResponse resume = new L07ResumeResponse();

            catalogT4UseCase.getAllCatalogT4().stream().filter( x -> x.getId() == (dto.getTipoIdentificacionEmisor()))
                    .findFirst()
                    .ifPresent(catalogT4 -> resume.setTipoIdentificacionEmisor(
                            new ResponseDTO(catalogT4.getId(), catalogT4.getDescripcion())
                    ));

            T9Dto nacionalidad = t9UseCase.findById(dto.getNacionalidadEmisor());
            if(nacionalidad != null){
                resume.setNacionalidadEmisor(new ResponseDTO(nacionalidad.getId(), nacionalidad.getDescripcion()));
            }

            catalogT73.getAllCatalogT73().stream().filter(x -> x.getId() == (dto.getTipoEmisor()))
                    .findFirst()
                    .ifPresent(catalogT73 -> resume.setTipoEmisor(
                            new ResponseDTO(catalogT73.getId(), catalogT73.getDescripcion())
                    ));
            resume.setIdentificacionEmisor(dto.getIdentificacionEmisor());
            resumes.add(resume);
        }

        return resumes;
    }

    @GetMapping("/report")
    public List<L07ReportResponse> getReport(){
        List<L07ReportResponse> reports = new java.util.ArrayList<>(List.of());

        for (L07Dto dto : useCase.findAll()){
            L07ReportResponse report = new L07ReportResponse();

            catalogT4UseCase.getAllCatalogT4().stream()
                    .filter(x -> x.getId() == (dto.getTipoIdentificacionEmisor()))
                    .findFirst()
                    .ifPresent(catalogT4 ->
                            report.setTipoIdentificacionEmisor(new ReportDto(catalogT4.getId(), catalogT4.getCodigo(), catalogT4.getDescripcion()))
                    );

            report.setIdentificacionEmisor(dto.getIdentificacionEmisor());

            T9Dto nacionalidad = t9UseCase.findById(dto.getNacionalidadEmisor());
            if(nacionalidad != null){
                report.setNacionalidadEmisor(new ReportDto(nacionalidad.getId(), nacionalidad.getCodigo(), nacionalidad.getDescripcion()));
            }

            catalogT73.getAllCatalogT73().stream()
                    .filter(x -> x.getId() == (dto.getTipoEmisor()))
                    .findFirst()
                            .ifPresent(catalogT73 ->
                                    report.setNacionalidadEmisor(new ReportDto(catalogT73.getId(), catalogT73.getCodigo(), catalogT73.getDescripcion())));

            reports.add(report);
        }

        return reports;
    }

    @GetMapping("/{id}")
    public L07Dto getById(@PathVariable Long id){ return useCase.findById(id); }

    @PostMapping
    public L07Dto create(@RequestBody L07Dto dto){ return useCase.create(dto); }

    @PutMapping("/{id}")
    public L07Dto update(@PathVariable Long id, @RequestBody L07Dto dto){ return useCase.update(id, dto); }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id){ useCase.delete(id); }
}
