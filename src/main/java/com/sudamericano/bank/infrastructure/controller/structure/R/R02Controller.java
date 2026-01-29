package com.sudamericano.bank.infrastructure.controller.structure.R;


import com.sudamericano.bank.domain.model.catalog.T33Dto;
import com.sudamericano.bank.domain.model.structure.R.R02Dto;
import com.sudamericano.bank.domain.ports.inputs.catalog.CatalogT4UseCase;
import com.sudamericano.bank.domain.ports.inputs.catalog.T33UseCase;
import com.sudamericano.bank.domain.ports.inputs.structure.R.R02UseCase;
import com.sudamericano.bank.infrastructure.outputs.ResponseDTO;
import com.sudamericano.bank.infrastructure.outputs.structure.R.resume.R02ResumenResponse;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Tag(name = "Structure R02", description = "Structure R02 management endpoints")
@RestController
@RequestMapping("/api/structures/R02")
public class R02Controller {
    private final R02UseCase r02useCase;
    private final CatalogT4UseCase catalogT4UseCase;
    private final T33UseCase t33UseCase;

    public R02Controller(R02UseCase useCase, CatalogT4UseCase catalogT4UseCase, T33UseCase t33UseCase) {
        this.r02useCase = useCase;
        this.catalogT4UseCase = catalogT4UseCase;
        this.t33UseCase = t33UseCase;
    }

    @GetMapping
    public List<R02Dto> getAll() {
        return r02useCase.findAll();
    }

    @GetMapping("/resume")
    public List<R02ResumenResponse> getAllResume() {
        List<R02ResumenResponse> resumes = new java.util.ArrayList<>(List.of());

        for (R02Dto dto : r02useCase.findAll()) {
            R02ResumenResponse resume = new R02ResumenResponse();
            catalogT4UseCase.getAllCatalogT4().stream().filter(x -> x.getId() == (dto.getCodigoTipoIdentificacion()))
                    .findFirst()
                    .ifPresent(catalogT4 -> resume.setTipoIdentificacion(
                            new ResponseDTO(catalogT4.getId(), catalogT4.getDescripcion())
                    ));

            T33Dto moneda = t33UseCase.findById(dto.getCodigoMoneda());
            if (moneda != null) {
                resume.setCodigoMoneda(new ResponseDTO(moneda.getId(), moneda.getDescripcion()));
            }
            resume.setIdentificacionSujeto(dto.getIdentificacionSujeto());
            resume.setNumeroOperacion(dto.getNumeroOperacion());
            resume.setValorOperacion(dto.getValorOperacion());
            resume.setTasaInteresNominal(dto.getTasaInteresNominal());
            resume.setTea(dto.getTea());
            resume.setFechaConcesion(dto.getFechaConcesion());
            resumes.add(resume);
        }


    return  resumes;

    }

    @GetMapping("/{id}")
    public R02Dto getById(Long id) {
        return r02useCase.findById(id);
    }

    @PostMapping
    public R02Dto create(@RequestBody R02Dto dto) {
        return r02useCase.create(dto);
    }

    @PutMapping("/{id}")
    public R02Dto update(Long id, R02Dto dto) {
        return r02useCase.update(id, dto);
    }

    @DeleteMapping("/{id}")
    public void delete(Long id) {
        r02useCase.delete(id);
    }
}
