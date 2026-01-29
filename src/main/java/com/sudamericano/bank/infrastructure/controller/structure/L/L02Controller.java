package com.sudamericano.bank.infrastructure.controller.structure.L;

import com.sudamericano.bank.domain.model.catalog.T164Dto;
import com.sudamericano.bank.domain.model.catalog.T165Dto;
import com.sudamericano.bank.domain.model.catalog.T166Dto;
import com.sudamericano.bank.domain.model.catalog.T62ADto;
import com.sudamericano.bank.domain.model.structure.L.L02Dto;
import com.sudamericano.bank.domain.ports.inputs.catalog.*;
import com.sudamericano.bank.domain.ports.inputs.structure.L.L02UseCase;
import com.sudamericano.bank.infrastructure.outputs.ResponseDTO;
import com.sudamericano.bank.infrastructure.outputs.structure.L02ResumeResponse;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Tag(name = "Structure L02", description = "Structure L02 management endpoints")
@RestController
@RequestMapping("/api/structures/L02")
public class L02Controller {
    private final L02UseCase useCase;
    private final CatalogT4UseCase catalogT4UseCase;
    private final T164UseCase t164UseCase;
    private final T165UseCase t165UseCase;
    private final T166UseCase t166UseCase;
    private final T62AUseCase t62AUseCase;

    public L02Controller(L02UseCase useCase,
                         CatalogT4UseCase catalogT4UseCase,
                         T164UseCase t164UseCase,
                         T165UseCase t165UseCase,
                         T166UseCase t166UseCase,
                         T62AUseCase t62AUseCase) {
        this.useCase = useCase;
        this.catalogT4UseCase = catalogT4UseCase;
        this.t164UseCase = t164UseCase;
        this.t165UseCase = t165UseCase;
        this.t166UseCase = t166UseCase;
        this.t62AUseCase = t62AUseCase;
    }

    @GetMapping
    public List<L02Dto> getAll() {
        return useCase.findAll();
    }

    @GetMapping("/resume")
    public List<L02ResumeResponse> getAllResume() {
        List<L02ResumeResponse> resumes = new java.util.ArrayList<>(List.of());

        for (L02Dto dto : useCase.findAll()) {
            L02ResumeResponse resume = new L02ResumeResponse();
            catalogT4UseCase.getAllCatalogT4().stream().filter(x -> x.getId() == (dto.getCodigoTipoIdentificacion()))
                    .findFirst()
                    .ifPresent(catalogT4 -> resume.setTipoIdentificacion(
                            new ResponseDTO(catalogT4.getId(), catalogT4.getDescripcion())
                    ));

            T164Dto emisor = t164UseCase.findById(dto.getCodigoEmisor());
            if (emisor != null) {
                resume.setEmisor(new ResponseDTO(emisor.getId(), emisor.getDescripcion()));
            }
            resume.setNumeroTitulo(dto.getNumeroTitulo());
            resume.setFechaEmision(dto.getFechaEmision());
            resume.setFechaVencimiento(dto.getFechaVencimiento());
            resume.setIdentificacionInstrumento(dto.getIdentificacionInstrumento());

            T165Dto instrumento = t165UseCase.findById(dto.getCodigoIdentificadorInstrumento());
            if (instrumento != null) {
                resume.setInstrumento(new ResponseDTO(instrumento.getId(), instrumento.getDescripcion()));
            }

            T166Dto categoriaInstrumento = t166UseCase.findById(dto.getCodigoCategoriaInstrumento());
            if (categoriaInstrumento != null) {
                resume.setCategoriaInstrumento(new ResponseDTO(categoriaInstrumento.getId(), categoriaInstrumento.getDescripcion()));
            }

            T62ADto tipoInstrumento = t62AUseCase.findById(dto.getCodigoTipoInstrumento());
            if (tipoInstrumento != null) {
                resume.setTipoInstrumento(new ResponseDTO(tipoInstrumento.getId(), tipoInstrumento.getDescripcion()));
            }

            resumes.add(resume);
        }
        return  resumes;
    }

    @GetMapping("/{id}")
    public L02Dto getById(@PathVariable Long id) {
        return useCase.findById(id);
    }

    @PostMapping
    public L02Dto create(@RequestBody L02Dto dto) {
        return useCase.create(dto);
    }

    @PutMapping("/{id}")
    public L02Dto update(@PathVariable Long id, @RequestBody L02Dto dto) {
        return useCase.update(id, dto);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        useCase.delete(id);
    }
}
