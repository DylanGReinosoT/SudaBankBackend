package com.sudamericano.bank.infrastructure.controller.structure.R;

import com.sudamericano.bank.domain.model.catalog.T42Dto;
import com.sudamericano.bank.domain.model.catalog.T47Dto;
import com.sudamericano.bank.domain.model.catalog.T5Dto;
import com.sudamericano.bank.domain.model.catalog.T6Dto;
import com.sudamericano.bank.domain.model.catalog.T7Dto;
import com.sudamericano.bank.domain.model.structure.R.R07Dto;
import com.sudamericano.bank.domain.ports.inputs.catalog.CatalogT4UseCase;
import com.sudamericano.bank.domain.ports.inputs.catalog.T5UseCase;
import com.sudamericano.bank.domain.ports.inputs.catalog.T6UseCase;
import com.sudamericano.bank.domain.ports.inputs.catalog.T7UseCase;
import com.sudamericano.bank.domain.ports.inputs.catalog.T42UseCase;
import com.sudamericano.bank.domain.ports.inputs.catalog.T47UseCase;
import com.sudamericano.bank.domain.ports.inputs.structure.R.R07UseCase;
import com.sudamericano.bank.infrastructure.outputs.ResponseDTO;
import com.sudamericano.bank.infrastructure.outputs.structure.R.resume.R07ResumeResponse;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Tag(name = "Structure R07", description = "Structure R07 management endpoints")
@RestController
@RequestMapping("/api/structures/R07")
public class R07Controller {
    private final R07UseCase useCase;
    private final CatalogT4UseCase catalogT4UseCase;
    private final T5UseCase t5UseCase;
    private final T6UseCase t6UseCase;
    private final T7UseCase t7UseCase;
    private final T42UseCase t42UseCase;
    private final T47UseCase t47UseCase;

    public R07Controller(R07UseCase useCase,
                         CatalogT4UseCase catalogT4UseCase,
                         T5UseCase t5UseCase,
                         T6UseCase t6UseCase,
                         T7UseCase t7UseCase,
                         T42UseCase t42UseCase,
                         T47UseCase t47UseCase) {
        this.useCase = useCase;
        this.catalogT4UseCase = catalogT4UseCase;
        this.t5UseCase = t5UseCase;
        this.t6UseCase = t6UseCase;
        this.t7UseCase = t7UseCase;
        this.t42UseCase = t42UseCase;
        this.t47UseCase = t47UseCase;
    }

    @GetMapping
    public List<R07Dto> getAll() {
        return useCase.findAll();
    }

    @GetMapping("/resume")
    public List<R07ResumeResponse> getAllResume() {
        List<R07ResumeResponse> resumes = new java.util.ArrayList<>(List.of());

        for (R07Dto dto : useCase.findAll()) {
            R07ResumeResponse resume = new R07ResumeResponse();
            catalogT4UseCase.getAllCatalogT4().stream().filter(x -> x.getId() == (dto.getCodigoTipoIdentificacion()))
                    .findFirst()
                    .ifPresent(catalogT4 -> resume.setTipoIdentificacion(
                            new ResponseDTO(catalogT4.getId(), catalogT4.getDescripcion())
                    ));

            resume.setIdentificacionSujeto(dto.getIdentificacionSujeto());
            resume.setNumeroOperacion(dto.getNumeroOperacion());
            resume.setNumeroGarantia(dto.getNumeroGarantia());

            T42Dto tipoGarantia = t42UseCase.findById(dto.getCodigoTipoGarantia());
            if (tipoGarantia != null) {
                resume.setCodigoTipoGarantia(new ResponseDTO(tipoGarantia.getId(), tipoGarantia.getDescripcion()));
            }
            
            resume.setDescripcionGarantia(dto.getDescripcionGarantia());

            T5Dto pais = t5UseCase.findById(dto.getCodigoPais());
            if (pais != null) {
                resume.setCodigoPais(new ResponseDTO(pais.getId(), pais.getDescripcion()));
            }

            T6Dto provincia = t6UseCase.findById(dto.getCodigoProvincia());
            if (provincia != null) {
                resume.setCodigoProvincia(new ResponseDTO(provincia.getId(), provincia.getDescripcion()));
            }

            T7Dto canton = t7UseCase.findById(dto.getCodigoCanton());
            if (canton != null) {
                resume.setCodigoCanton(new ResponseDTO(canton.getId(), canton.getDescripcion()));
            }

            resume.setValorAvaluo(dto.getValorAvaluo());
            resume.setFechaAvaluo(dto.getFechaAvaluo());
            resume.setNumeroRegistroGarantia(dto.getNumeroRegistroGarantia());
            resume.setFechaContabilizacionGarantia(dto.getFechaContabilizacionGarantia());
            resume.setPorcentajeGarantia(dto.getPorcentajeGarantia());

            T47Dto estadoRegistro = t47UseCase.findById(dto.getEstadoRegistro());
            if (estadoRegistro != null) {
                resume.setEstadoRegistro(new ResponseDTO(estadoRegistro.getId(), estadoRegistro.getDescripcion()));
            }

            resumes.add(resume);
        }
        return resumes;
    }

    @GetMapping("/{id}")
    public R07Dto getById(@PathVariable Long id) {
        return useCase.findById(id);
    }

    @PostMapping
    public R07Dto create(@RequestBody R07Dto dto) {
        return useCase.create(dto);
    }

    @PutMapping("/{id}")
    public R07Dto update(@PathVariable Long id, @RequestBody R07Dto dto) {
        return useCase.update(id, dto);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        useCase.delete(id);
    }
}