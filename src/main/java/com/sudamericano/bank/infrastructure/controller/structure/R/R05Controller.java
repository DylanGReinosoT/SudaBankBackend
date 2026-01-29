package com.sudamericano.bank.infrastructure.controller.structure.R;

import com.sudamericano.bank.domain.model.catalog.T208Dto;
import com.sudamericano.bank.domain.model.catalog.T39Dto;
import com.sudamericano.bank.domain.model.structure.R.R05Dto;
import com.sudamericano.bank.domain.ports.inputs.catalog.CatalogT29UseCase;
import com.sudamericano.bank.domain.ports.inputs.catalog.CatalogT4UseCase;
import com.sudamericano.bank.domain.ports.inputs.catalog.T208UseCase;
import com.sudamericano.bank.domain.ports.inputs.catalog.T39UseCase;
import com.sudamericano.bank.domain.ports.inputs.structure.R.R05UseCase;
import com.sudamericano.bank.infrastructure.outputs.ResponseDTO;
import com.sudamericano.bank.infrastructure.outputs.structure.R05ResumeResponse;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Tag(name = "Structure R05", description = "Structure R05 management endpoints")
@RestController
@RequestMapping("/api/structures/R05")
public class R05Controller {

    private final R05UseCase useCase;
    private final CatalogT4UseCase catalogUseCase;
    private final T208UseCase t208UseCase;
    private final T39UseCase t39UseCase;
    private final CatalogT29UseCase catalogT29;

    public R05Controller(R05UseCase useCase, CatalogT4UseCase catalogUseCase, T208UseCase t208UseCase, CatalogT29UseCase catalogT29, T39UseCase t39UseCase) {
        this.useCase = useCase;
        this.catalogUseCase = catalogUseCase;
        this.t208UseCase = t208UseCase;
        this.catalogT29 = catalogT29;
        this.t39UseCase = t39UseCase;
    }

    @GetMapping
    public List<R05Dto> getAll() {
        return useCase.findAll();
    }

    @GetMapping("/resume")
    public List<R05ResumeResponse> getAllResume(){

        List<R05ResumeResponse> resumes =  new java.util.ArrayList<>(List.of());

        for (R05Dto dto : useCase.findAll()) {
            R05ResumeResponse resume = new R05ResumeResponse();
            catalogUseCase.getAllCatalogT4().stream().filter(x -> x.getId() == (dto.getCodigoTipoIdentificacion()))
                    .findFirst()
                    .ifPresent(catalogT4 -> resume.setTipoIdentificacion(
                            new ResponseDTO(catalogT4.getId(), catalogT4.getDescripcion())
                    ));


            T208Dto transaccion = t208UseCase.findById(dto.getCodigoTipoTransaccion());
            if(transaccion != null){
                resume.setCodigoTipoTransaccion(new ResponseDTO(transaccion.getId(), transaccion.getDescripcion()));
            }

            T39Dto cancelacion = t39UseCase.findById(dto.getCodigoFormaCancelacion());
            if(cancelacion != null){
                resume.setCodigoFormaCancelacion(new ResponseDTO(cancelacion.getId(), cancelacion.getDescripcion()));
            }

            catalogT29.getAllCatalogT29().stream().filter(x -> x.getId() == (dto.getCodigoCalificacion()))
                    .findFirst()
                    .ifPresent(catalogT29 -> resume.setCodigoCalificacion(
                            new ResponseDTO(catalogT29.getId(), catalogT29.getDescripcion())
                    ));

            resume.setIdentificacionSujeto(dto.getIdentificacionSujeto());
            resume.setNumeroOperacion(dto.getNumeroOperacion());
            resume.setFechaCancelacion(dto.getFechaCancelacion());
            resumes.add(resume);

        }
        return resumes;
    }

    @GetMapping("/{id}")
    public R05Dto getById(@PathVariable Long id) {
        return useCase.findById(id);
    }

    @PostMapping
    public R05Dto create(@RequestBody R05Dto dto) {
        return useCase.create(dto);
    }

    @PutMapping("/{id}")
    public R05Dto update(Long id, R05Dto dto) {
        return useCase.update(id, dto);
    }

    @DeleteMapping("/{id}")
    public void delete(Long id) {
        useCase.delete(id);
    }

}
