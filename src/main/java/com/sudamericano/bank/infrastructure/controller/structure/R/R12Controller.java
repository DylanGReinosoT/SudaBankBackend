package com.sudamericano.bank.infrastructure.controller.structure.R;

import com.sudamericano.bank.domain.model.structure.R.R12Dto;
import com.sudamericano.bank.domain.ports.inputs.catalog.CatalogT4UseCase;
import com.sudamericano.bank.domain.ports.inputs.structure.R.R12UseCase;
import com.sudamericano.bank.infrastructure.outputs.ResponseDTO;
import com.sudamericano.bank.infrastructure.outputs.structure.R.resume.R12ResumeResponse;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Tag(name = "Structure R12", description = "Structure R12 management endpoints")
@RestController
@RequestMapping("/api/structures/R12")
public class R12Controller {

    private final R12UseCase r12useCase;
    private final CatalogT4UseCase catalogT4UseCase;


    public R12Controller(R12UseCase r12useCase, CatalogT4UseCase catalogT4UseCase) {
        this.r12useCase = r12useCase;
        this.catalogT4UseCase = catalogT4UseCase;

    }

    @GetMapping
    public List<R12Dto> getAll() {
        return r12useCase.findAll();
    }

    @GetMapping("/resume")
    public List<R12ResumeResponse> getAllResume() {
        List<R12ResumeResponse> resumes = new java.util.ArrayList<>(List.of());
        for (R12Dto dto : r12useCase.findAll()) {
            R12ResumeResponse resume = new R12ResumeResponse();
            catalogT4UseCase.getAllCatalogT4().stream().filter(x -> x.getId() == (dto.getCodigoTipoIdentificacion()))
                    .findFirst()
                    .ifPresent(catalogT4 -> resume.setCodigoTipoIdentificacion(
                            new ResponseDTO(catalogT4.getId(), catalogT4.getDescripcion())
                    ));
            resume.setNombreGrupoEconomico(dto.getNombreGrupoEconomico());
            resume.setIdentificacionIntegrante(dto.getIdentificacionIntegrante());
            resumes.add(resume);
        }
        return resumes;
    }

    @GetMapping("/{id}")
    public R12Dto getById(Long id) {
        return r12useCase.findById(id);
    }

    @PostMapping
    public R12Dto create(@RequestBody R12Dto dto) {
        return r12useCase.create(dto);
    }

    @PutMapping("/{id}")
    public R12Dto update(Long id, R12Dto dto) {
        return r12useCase.update(id, dto);
    }

    @DeleteMapping("/{id}")
    public void delete(Long id) {
        r12useCase.delete(id);
    }
}
