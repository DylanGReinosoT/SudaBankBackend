package com.sudamericano.bank.infrastructure.controller.structure.R;

import com.sudamericano.bank.domain.model.catalog.T41Dto;
import com.sudamericano.bank.domain.model.structure.R.R08Dto;
import com.sudamericano.bank.domain.ports.inputs.catalog.*;
import com.sudamericano.bank.domain.ports.inputs.structure.R.R08UseCase;
import com.sudamericano.bank.infrastructure.outputs.ResponseDTO;
import com.sudamericano.bank.infrastructure.outputs.structure.R.resume.R08ResumeResponse;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Tag(name = "Structure R08", description = "Structure R08 management endpoints")
@RestController
@RequestMapping("/api/structures/R08")
public class R08Controller {

    private final R08UseCase useCase;
    private final CatalogT4UseCase catalogUseCase;
    private final T41UseCase t41UseCase;

    public R08Controller(R08UseCase useCase, CatalogT4UseCase catalogUseCase, T41UseCase t41UseCase) {
        this.useCase = useCase;
        this.catalogUseCase = catalogUseCase;
        this.t41UseCase = t41UseCase;
    }

    @GetMapping
    public List<R08Dto> getAll() {
        return useCase.findAll();
    }

    @GetMapping("/resume")
    public List<R08ResumeResponse> getAllResume(){

        List<R08ResumeResponse> resumes =  new java.util.ArrayList<>(List.of());

        for (R08Dto dto : useCase.findAll()) {
            R08ResumeResponse resume = new R08ResumeResponse();
            catalogUseCase.getAllCatalogT4().stream().filter(x -> x.getId() == (dto.getCodigoTipoIdentificacion()))
                    .findFirst()
                    .ifPresent(catalogT4 -> resume.setTipoIdentificacion(
                            new ResponseDTO(catalogT4.getId(), catalogT4.getDescripcion())
                    ));

            T41Dto tipoBien = t41UseCase.findById(dto.getCodigoTipoBien());
            if(tipoBien != null){
                resume.setTipoBien(new ResponseDTO(tipoBien.getId(), tipoBien.getDescripcion()));
            }

            resume.setIdentificacionSujeto(dto.getIdentificacionSujeto());
            resume.setNumeroOperacion(dto.getNumeroOperacion());
            resume.setCodigoBien(dto.getCodigoBien());
            resume.setDescripcionBien(dto.getDescripcionBien());
            resumes.add(resume);

        }
        return resumes;
    }

    @GetMapping("/{id}")
    public R08Dto getById(@PathVariable Long id) {
        return useCase.findById(id);
    }

    @PostMapping
    public R08Dto create(@RequestBody R08Dto dto) {
        return useCase.create(dto);
    }

    @PutMapping("/{id}")
    public R08Dto update(Long id, R08Dto dto) {
        return useCase.update(id, dto);
    }

    @DeleteMapping("/{id}")
    public void delete(Long id) {
        useCase.delete(id);
    }

}
