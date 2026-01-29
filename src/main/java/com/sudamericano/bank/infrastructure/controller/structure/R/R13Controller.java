package com.sudamericano.bank.infrastructure.controller.structure.R;

import com.sudamericano.bank.domain.model.catalog.T43Dto;
import com.sudamericano.bank.domain.model.catalog.T44Dto;
import com.sudamericano.bank.domain.model.structure.R.R13Dto;
import com.sudamericano.bank.domain.ports.inputs.catalog.CatalogT4UseCase;
import com.sudamericano.bank.domain.ports.inputs.catalog.T43UseCase;
import com.sudamericano.bank.domain.ports.inputs.catalog.T44UseCase;
import com.sudamericano.bank.domain.ports.inputs.structure.R.R13UseCase;
import com.sudamericano.bank.infrastructure.outputs.ResponseDTO;
import com.sudamericano.bank.infrastructure.outputs.structure.R.resume.R13ResumeResponse;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Tag(name = "Structure R13", description = "Structure R13 management endpoints")
@RestController
@RequestMapping("/api/structures/R13")
public class R13Controller {
    private final R13UseCase useCase;
    private final CatalogT4UseCase catalogUseCase;
    private final T44UseCase t44UseCase;
    private final T43UseCase t43UseCase;

    public R13Controller(R13UseCase useCase, CatalogT4UseCase catalogUseCase, T44UseCase t44UseCase,T43UseCase t43UseCase) {
        this.useCase = useCase;
        this.catalogUseCase = catalogUseCase;
        this.t44UseCase = t44UseCase;
        this.t43UseCase = t43UseCase;
    }

    @GetMapping
    public List<R13Dto> getAll() {
        return useCase.findAll();
    }

    @GetMapping("/resume")
    public List<R13ResumeResponse> getAllResume() {
        List<R13ResumeResponse> resumes = new java.util.ArrayList<>(List.of());

        for(R13Dto dto : useCase.findAll()){
            R13ResumeResponse resume = new R13ResumeResponse();
            catalogUseCase.getAllCatalogT4().stream().filter(x -> x.getId() == (dto.getCodigoTipoIdentificacion()))
                    .findFirst()
                    .ifPresent(catalogT4 -> resume.setTipoIdentificacion(
                            new ResponseDTO(catalogT4.getId(), catalogT4.getDescripcion())
                    ));

            T44Dto entidad = t44UseCase.findById(dto.getCodigoEstadoIntegrante());
            if(entidad != null){
                resume.setCodigoEstadoIntegrante(new ResponseDTO(entidad.getId(), entidad.getDescripcion()));
            }

            T43Dto factor = t43UseCase.findById(dto.getFactorIntegracion());
            if(factor != null){
                resume.setFactorIntegracion(new ResponseDTO(factor.getId(), factor.getDescripcion()));
            }

            resume.setCodigoGrupoEconomico(dto.getCodigoGrupoEconomico());
            resume.setIdentificacionIntegrante(dto.getIdentificacionIntegrante());
            resume.setFechaEstadoIntegrante(dto.getFechaEstadoIntegrante());
            resumes.add(resume);
        }
        return resumes;
    }

    @GetMapping("/{id}")
    public R13Dto getById(@PathVariable Long id) {
        return useCase.findById(id);
    }

    @PostMapping
    public R13Dto create(@RequestBody R13Dto dto) {
        return useCase.create(dto);
    }

    @PutMapping("/{id}")
    public R13Dto update(Long id, R13Dto dto) {
        return useCase.update(id, dto);
    }

    @DeleteMapping("/{id}")
    public void delete(Long id) {
        useCase.delete(id);
    }

}
