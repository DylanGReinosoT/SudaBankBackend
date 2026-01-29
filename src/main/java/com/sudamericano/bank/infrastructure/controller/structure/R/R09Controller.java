package com.sudamericano.bank.infrastructure.controller.structure.R;

import com.sudamericano.bank.domain.model.catalog.T41Dto;
import com.sudamericano.bank.domain.model.catalog.T41_ADto;
import com.sudamericano.bank.domain.model.structure.R.R09Dto;
import com.sudamericano.bank.domain.ports.inputs.catalog.CatalogT4UseCase;
import com.sudamericano.bank.domain.ports.inputs.catalog.T41UseCase;
import com.sudamericano.bank.domain.ports.inputs.catalog.T41_AUseCase;
import com.sudamericano.bank.domain.ports.inputs.structure.R.R09UseCase;
import com.sudamericano.bank.infrastructure.outputs.ResponseDTO;
import com.sudamericano.bank.infrastructure.outputs.structure.R09ResumeResponse;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Tag(name = "Structure R09", description = "Structure R09 management endpoints")
@RestController
@RequestMapping("/api/structures/R09")
public class R09Controller {

    private final R09UseCase useCase;
    private final CatalogT4UseCase catalogUseCase;
    private final T41UseCase t41UseCase;
    private final T41_AUseCase t41_aUseCase;

    public R09Controller(R09UseCase useCase, CatalogT4UseCase catalogUseCase, T41UseCase t41UseCase, T41_AUseCase t41_aUseCase) {
        this.useCase = useCase;
        this.catalogUseCase = catalogUseCase;
        this.t41UseCase = t41UseCase;
        this.t41_aUseCase = t41_aUseCase;
    }

    @GetMapping
    public List<R09Dto> getAll() {
        return useCase.findAll();
    }

    @GetMapping("/resume")
    public List<R09ResumeResponse> getAllResume(){

        List<R09ResumeResponse> resumes =  new java.util.ArrayList<>(List.of());

        for (R09Dto dto : useCase.findAll()) {
            R09ResumeResponse resume = new R09ResumeResponse();
            catalogUseCase.getAllCatalogT4().stream().filter(x -> x.getId() == (dto.getCodigoTipoIdentificacion()))
                    .findFirst()
                    .ifPresent(catalogT4 -> resume.setTipoIdentificacion(
                            new ResponseDTO(catalogT4.getId(), catalogT4.getDescripcion())
                    ));

            T41_ADto tipoTitulo = t41_aUseCase.findById(dto.getCodigoTipoTitulo());
            if(tipoTitulo != null){
                resume.setTipoTitulo(new ResponseDTO(tipoTitulo.getId(), tipoTitulo.getDescripcion()));
            }

            resume.setIdentificacionSujeto(dto.getIdentificacionSujeto());
            resume.setNumeroOperacion(dto.getNumeroOperacion());
            resume.setCodigoTitulo(dto.getCodigoTituloValor());
            resume.setDescripcionTitulo(dto.getDescripcionTituloValor());

            resumes.add(resume);

        }
        return resumes;
    }

    @GetMapping("/{id}")
    public R09Dto getById(@PathVariable Long id) {
        return useCase.findById(id);
    }

    @PostMapping
    public R09Dto create(@RequestBody R09Dto dto) {
        return useCase.create(dto);
    }

    @PutMapping("/{id}")
    public R09Dto update(Long id, R09Dto dto) {
        return useCase.update(id, dto);
    }

    @DeleteMapping("/{id}")
    public void delete(Long id) {
        useCase.delete(id);
    }

}
