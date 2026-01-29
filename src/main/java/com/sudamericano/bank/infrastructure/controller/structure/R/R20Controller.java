package com.sudamericano.bank.infrastructure.controller.structure.R;

import com.sudamericano.bank.domain.model.catalog.T45Dto;
import com.sudamericano.bank.domain.model.catalog.T46Dto;
import com.sudamericano.bank.domain.model.structure.R.R20Dto;
import com.sudamericano.bank.domain.ports.inputs.catalog.*;
import com.sudamericano.bank.domain.ports.inputs.structure.R.R20UseCase;
import com.sudamericano.bank.infrastructure.outputs.ResponseDTO;
import com.sudamericano.bank.infrastructure.outputs.structure.R20ResumeResponse;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Tag(name = "Structure R20", description = "Structure R20 management endpoints")
@RestController
@RequestMapping("/api/structures/R20")
public class R20Controller {
    private final R20UseCase useCase;
    private final CatalogT4UseCase catalogUseCase;
    private final T45UseCase t45UseCase;
    private final T46UseCase t46UseCase;

    public R20Controller(R20UseCase useCase, 
                         CatalogT4UseCase catalogUseCase, 
                         T45UseCase t45UseCase, 
                         T46UseCase t46UseCase) {
        this.useCase = useCase;
        this.catalogUseCase = catalogUseCase;
        this.t45UseCase = t45UseCase;
        this.t46UseCase = t46UseCase;
    }

    @GetMapping
    public List<R20Dto> getAll() {
        return useCase.findAll();
    }

    @GetMapping("/resume")
    public List<R20ResumeResponse> getAllResume(){
        List<R20ResumeResponse> resumes = new java.util.ArrayList<>(List.of());

        for(R20Dto dto : useCase.findAll()){
            R20ResumeResponse resume = new R20ResumeResponse();
            catalogUseCase.getAllCatalogT4().stream().filter(x -> x.getId() == (dto.getCodigoTipoIdentificacion()))
                    .findFirst()
                    .ifPresent(catalogT4 -> resume.setCodigoTipoIdentificacion(
                            new ResponseDTO(catalogT4.getId(), catalogT4.getDescripcion())
                    ));

            T45Dto marca = t45UseCase.findById(dto.getMarcaTarjeta());
            if(marca != null){
                resume.setMarcaTarjeta(new ResponseDTO(marca.getId(), marca.getDescripcion()));
            }

            T46Dto clase = t46UseCase.findById(dto.getClaseTarjeta());
            if(clase != null){
                resume.setClaseTarjeta(new ResponseDTO(clase.getId(), clase.getDescripcion()));
            }

            resume.setIdentificacionSujeto(dto.getIdentificacionSujeto());
            resume.setNumeroTarjeta(dto.getNumeroTarjeta());
            resume.setFechaEmision(dto.getFechaEmision());
            resume.setFechaVencimiento(dto.getFechaVencimiento());
            resumes.add(resume);


        }
        return resumes;
    }

    @GetMapping("/{id}")
    public R20Dto getById(@PathVariable Long id) {
        return useCase.findById(id);
    }

    @PostMapping
    public R20Dto create(@RequestBody R20Dto dto) {
        return useCase.create(dto);
    }

    @PutMapping("/{id}")
    public R20Dto update(Long id, R20Dto dto) {
        return useCase.update(id, dto);
    }

    @DeleteMapping("/{id}")
    public void delete(Long id) {
        useCase.delete(id);
    }
    
}
