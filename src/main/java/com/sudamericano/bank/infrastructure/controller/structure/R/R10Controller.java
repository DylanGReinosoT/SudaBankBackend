package com.sudamericano.bank.infrastructure.controller.structure.R;

import com.sudamericano.bank.domain.model.catalog.T214Dto;
import com.sudamericano.bank.domain.model.catalog.T41Dto;
import com.sudamericano.bank.domain.model.catalog.T41_ADto;
import com.sudamericano.bank.domain.model.structure.R.R10Dto;
import com.sudamericano.bank.domain.ports.inputs.catalog.CatalogT4UseCase;

import com.sudamericano.bank.domain.ports.inputs.catalog.T214UseCase;
import com.sudamericano.bank.domain.ports.inputs.catalog.T41UseCase;
import com.sudamericano.bank.domain.ports.inputs.catalog.T41_AUseCase;
import com.sudamericano.bank.domain.ports.inputs.structure.R.R10UseCase;
import com.sudamericano.bank.infrastructure.outputs.ResponseDTO;
import com.sudamericano.bank.infrastructure.outputs.structure.R.resume.R10ResumeResponse;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Tag(name = "Structure R10", description = "Structure R10 management endpoints")
@RestController
@RequestMapping("/api/structures/R10")
public class R10Controller {

    private final R10UseCase r10useCase;
    private final CatalogT4UseCase catalogT4UseCase;
    private final T214UseCase t214UseCase;
    private final T41UseCase t41UseCase;
    private final T41_AUseCase t41AUseCase;

    public R10Controller(R10UseCase r10useCase, CatalogT4UseCase catalogT4UseCase, T214UseCase t214UseCase, T41UseCase t41UseCase, T41_AUseCase t41AUseCase) {
        this.r10useCase = r10useCase;
        this.catalogT4UseCase = catalogT4UseCase;
        this.t214UseCase = t214UseCase;
        this.t41UseCase = t41UseCase;
        this.t41AUseCase = t41AUseCase;
    }

    @GetMapping
    public List<R10Dto> getAll() {
        return r10useCase.findAll();
    }

    @GetMapping("/resume")
    public List<R10ResumeResponse> getAllResume(){
        List<R10ResumeResponse> resumes = new java.util.ArrayList<>(List.of());
        for(R10Dto dto : r10useCase.findAll()){
            R10ResumeResponse resume = new R10ResumeResponse();
            catalogT4UseCase.getAllCatalogT4().stream().filter(x -> x.getId() == (dto.getCodigoTipoIdentificacion()))
                    .findFirst()
                    .ifPresent(catalogT4 -> resume.setTipoIdentificacion(
                            new ResponseDTO(catalogT4.getId(), catalogT4.getDescripcion())
                    ));

            T214Dto claseBien = t214UseCase.findById(dto.getCodigoClaseBienTitulo());
            if (claseBien != null) {
                resume.setCodigoClaseBienTitulo(new ResponseDTO(claseBien.getId(), claseBien.getDescripcion()));
            }

            T41Dto bienes = t41UseCase.findById(dto.getTipoBienTitulo());
            if (bienes != null) {
                resume.setTipoBienTitulo(new ResponseDTO(bienes.getId(), bienes.getDescripcion()));
            }

            T41_ADto titulo = t41AUseCase.findById(dto.getTipoTitulo());
            if (titulo != null) {
                resume.setTipoTitulo(new ResponseDTO(titulo.getId(), titulo.getDescripcion()));
            }

            resume.setIdentificacionSujeto(dto.getIdentificacionSujeto());
            resume.setNumeroOperacion(dto.getNumeroOperacion());
            resume.setCodigoBienTitulo(dto.getCodigoBienTitulo());
            resume.setProvisionConstituida(dto.getProvisionConstituida());
            resume.setCostosGenerados(dto.getCostosGenerados());

            resumes.add(resume);
        }
        return resumes;
    }

    @GetMapping("/{id}")
    public R10Dto getById(Long id) {
        return r10useCase.findById(id);
    }

    @PostMapping
    public R10Dto create(@RequestBody R10Dto dto) {
        return r10useCase.create(dto);
    }

    @PutMapping("/{id}")
    public R10Dto update(Long id, R10Dto dto) {
        return r10useCase.update(id, dto);
    }

    @DeleteMapping("/{id}")
    public void delete(Long id) {
        r10useCase.delete(id);
    }


}
