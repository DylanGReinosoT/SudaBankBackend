package com.sudamericano.bank.infrastructure.controller.structure.R;

import com.sudamericano.bank.domain.model.catalog.T2Dto;
import com.sudamericano.bank.domain.model.structure.R.R11Dto;
import com.sudamericano.bank.domain.ports.inputs.catalog.CatalogT4UseCase;
import com.sudamericano.bank.domain.ports.inputs.catalog.T2UseCase;
import com.sudamericano.bank.domain.ports.inputs.structure.R.R11UseCase;
import com.sudamericano.bank.infrastructure.outputs.ResponseDTO;
import com.sudamericano.bank.infrastructure.outputs.structure.R11ResumeResponse;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Tag(name = "Structure R11", description = "Structure R11 management endpoints")
@RestController
@RequestMapping("/api/structures/R11")
public class R11Controller {
    private final R11UseCase useCase;
    private final CatalogT4UseCase catalogUseCase;
    private final T2UseCase t2UseCase;

    public R11Controller(R11UseCase useCase, CatalogT4UseCase catalogUseCase, T2UseCase t2UseCase) {
        this.useCase = useCase;
        this.catalogUseCase = catalogUseCase;
        this.t2UseCase = t2UseCase;
    }

    @GetMapping
    public List<R11Dto> getAll() {
        return useCase.findAll();
    }

    @GetMapping("/resume")
    public List<R11ResumeResponse> getAllResume() {
        List<R11ResumeResponse> resumes = new java.util.ArrayList<>(List.of());

        for(R11Dto dto : useCase.findAll()){
            R11ResumeResponse resume = new R11ResumeResponse();
            catalogUseCase.getAllCatalogT4().stream().filter(x -> x.getId() == (dto.getCodigoTipoIdentificacion()))
                    .findFirst()
                    .ifPresent(catalogT4 -> resume.setTipoIdentificacion(
                            new ResponseDTO(catalogT4.getId(), catalogT4.getDescripcion())
                    ));

            T2Dto entidad = t2UseCase.findById(dto.getCodigoEntidadParticipe());
            if(entidad != null){
                resume.setCodigoEntidadParticipe(new ResponseDTO(entidad.getId(), entidad.getDescripcion()));
            }
            
            resume.setIdentificacionSujeto(dto.getIdentificacionSujeto());
            resume.setNumeroOperacion(dto.getNumeroOperacion());
            resume.setPorcentajeParticipacion(dto.getPorcentajeParticipacion());
            resumes.add(resume);
        }
        return resumes;
    }

    @GetMapping("/{id}")
    public R11Dto getById(@PathVariable Long id) {
        return useCase.findById(id);
    }

    @PostMapping
    public R11Dto create(@RequestBody R11Dto dto) {
        return useCase.create(dto);
    }

    @PutMapping("/{id}")
    public R11Dto update(Long id, R11Dto dto) {
        return useCase.update(id, dto);
    }

    @DeleteMapping("/{id}")
    public void delete(Long id) {
        useCase.delete(id);
    }

}
