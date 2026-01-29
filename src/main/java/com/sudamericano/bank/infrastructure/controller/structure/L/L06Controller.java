package com.sudamericano.bank.infrastructure.controller.structure.L;

import com.sudamericano.bank.domain.model.catalog.T164Dto;
import com.sudamericano.bank.domain.model.structure.L.L06Dto;
import com.sudamericano.bank.domain.ports.inputs.catalog.*;
import com.sudamericano.bank.domain.ports.inputs.structure.L.L06UseCase;
import com.sudamericano.bank.infrastructure.outputs.ResponseDTO;
import com.sudamericano.bank.infrastructure.outputs.structure.L06ResumeResponse;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Tag(name ="Structure L06", description = "Structure L06 management endpoints")
@RestController
@RequestMapping("/api/structures/l06")
public class L06Controller {

    private final L06UseCase useCase;
    private final CatalogT4UseCase catalogT4UseCase;
    private final T164UseCase t164UseCase;
    private final T172UseCase t171UseCase;
    private final T33UseCase t33UseCase;
    private final T169UseCase t169UseCase;

    public L06Controller(L06UseCase useCase,
                         CatalogT4UseCase catalogT4UseCase,
                         T164UseCase t164UseCase,
                         T172UseCase t171UseCase,
                         T33UseCase t33UseCase,
                         T169UseCase t169UseCase
    ) {
        this.useCase = useCase;
        this.catalogT4UseCase = catalogT4UseCase;
        this.t164UseCase = t164UseCase;
        this.t171UseCase = t171UseCase;
        this.t33UseCase = t33UseCase;
        this.t169UseCase = t169UseCase;
    }

    @GetMapping
    public List<L06Dto> getAll() {
        return useCase.findAll();
    }


    @GetMapping("/resume")
    public List<L06ResumeResponse> getAllResume() {
        List<L06ResumeResponse> resumes = new java.util.ArrayList<>(List.of());

        for (L06Dto dto : useCase.findAll()) {
            L06ResumeResponse resume = new L06ResumeResponse();

            catalogT4UseCase.getAllCatalogT4().stream().filter(x -> x.getId() == (dto.getCodigoTipoIdentificacionEmisor()))
                    .findFirst()
                    .ifPresent(catalogT4 -> resume.setTipoIdentificacion(
                            new ResponseDTO(catalogT4.getId(), catalogT4.getDescripcion())
                    ));

            T164Dto emisor = t164UseCase.findById(dto.getCodigoIdentificacionEmisor());
            if (emisor != null) {
                resume.setEmisor(new ResponseDTO(emisor.getId(), emisor.getDescripcion()));
            }
            resume.setNumeroTitulo(dto.getNumeroTitulo());
            resume.setNumeroOperacion(dto.getNumeroOperacion());
            resume.setFechaEmision(dto.getFechaEmision());
            resumes.add(resume);

        }

        return resumes;
    }

    @GetMapping("/{id}")
    public L06Dto getById(Integer id) {
        return useCase.findById(id);
    }
    @PostMapping("/{id}")
    public L06Dto create(@RequestBody L06Dto dto) {
        return useCase.create(dto);
    }
    @PutMapping("/{id}")
    public L06Dto update(@PathVariable Integer id, @RequestBody L06Dto dto) {
        return useCase.update(id, dto);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id) {
        useCase.delete(id);
    }
}


