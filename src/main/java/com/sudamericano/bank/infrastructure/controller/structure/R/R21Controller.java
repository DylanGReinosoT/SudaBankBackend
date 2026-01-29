package com.sudamericano.bank.infrastructure.controller.structure.R;

import com.sudamericano.bank.domain.model.catalog.T32Dto;
import com.sudamericano.bank.domain.model.catalog.T48Dto;
import com.sudamericano.bank.domain.model.structure.R.R21Dto;
import com.sudamericano.bank.domain.ports.inputs.catalog.CatalogT4UseCase;
import com.sudamericano.bank.domain.ports.inputs.catalog.T32UseCase;
import com.sudamericano.bank.domain.ports.inputs.catalog.T48UseCase;
import com.sudamericano.bank.domain.ports.inputs.structure.R.R21UseCase;
import com.sudamericano.bank.infrastructure.outputs.ResponseDTO;
import com.sudamericano.bank.infrastructure.outputs.structure.R21ResumeResponse;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Tag(name = "Structure R21", description = "Structure R21 (Consumos de tarjetas de crédito) management endpoints")
@RestController
@RequestMapping("/api/structures/R21")
public class R21Controller {
    private final R21UseCase useCase;
    private final CatalogT4UseCase catalogT4UseCase;
    private final T32UseCase t32UseCase;
    private final T48UseCase t48UseCase;

    public R21Controller(R21UseCase useCase,
                         CatalogT4UseCase catalogT4UseCase,
                         T32UseCase t32UseCase,
                         T48UseCase t48UseCase) {
        this.useCase = useCase;
        this.catalogT4UseCase = catalogT4UseCase;
        this.t32UseCase = t32UseCase;
        this.t48UseCase = t48UseCase;
    }

    @GetMapping
    public List<R21Dto> getAll() {
        return useCase.findAll();
    }

    @GetMapping("/resume")
    public List<R21ResumeResponse> getAllResume() {
        List<R21ResumeResponse> resumes = new java.util.ArrayList<>(List.of());

        for (R21Dto dto : useCase.findAll()) {
            R21ResumeResponse resume = new R21ResumeResponse();
            catalogT4UseCase.getAllCatalogT4().stream().filter(x -> x.getId() == (dto.getCodigoTipoIdentificacion()))
                    .findFirst()
                    .ifPresent(catalogT4 -> resume.setTipoIdentificacion(
                            new ResponseDTO(catalogT4.getId(), catalogT4.getDescripcion())
                    ));

            resume.setIdentificacionSujeto(dto.getIdentificacionSujeto());
            resume.setNumeroTarjeta(dto.getNumeroTarjeta());
            resume.setCupoTarjeta(dto.getCupoTarjeta());
            resume.setCapitalConsumo(dto.getCapitalConsumo());
            resume.setTea(dto.getTea());

            T32Dto estadoOperacion = t32UseCase.findById(dto.getCodigoEstadoOperacion());
            if (estadoOperacion != null) {
                resume.setEstadoOperacion(new ResponseDTO(estadoOperacion.getId(), estadoOperacion.getDescripcion()));
            }

            T48Dto formaPago = t48UseCase.findById(dto.getCodigoFormaPago());
            if (formaPago != null) {
                resume.setFormaPago(new ResponseDTO(formaPago.getId(), formaPago.getDescripcion()));
            }

            resumes.add(resume);
        }
        return resumes;
    }

    @GetMapping("/{id}")
    public R21Dto getById(@PathVariable Long id) {
        return useCase.findById(id);
    }

    @PostMapping
    public R21Dto create(@RequestBody R21Dto dto) {
        return useCase.create(dto);
    }

    @PutMapping("/{id}")
    public R21Dto update(@PathVariable Long id, @RequestBody R21Dto dto) {
        return useCase.update(id, dto);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        useCase.delete(id);
    }
}
