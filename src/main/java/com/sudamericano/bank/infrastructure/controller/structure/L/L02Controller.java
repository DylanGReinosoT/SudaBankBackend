package com.sudamericano.bank.infrastructure.controller.structure.L;

import com.sudamericano.bank.domain.model.catalog.*;
import com.sudamericano.bank.domain.model.structure.L.L02Dto;
import com.sudamericano.bank.domain.ports.inputs.catalog.*;
import com.sudamericano.bank.domain.ports.inputs.structure.L.L02UseCase;
import com.sudamericano.bank.infrastructure.outputs.ReportDto;
import com.sudamericano.bank.infrastructure.outputs.ResponseDTO;
import com.sudamericano.bank.infrastructure.outputs.structure.L.report.L02ReportResponse;
import com.sudamericano.bank.infrastructure.outputs.structure.L.resume.L02ResumeResponse;
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
    private final T167UseCase t167UseCase;
    private final T64UseCase t64UseCase;
    private final T168UseCase t168UseCase;
    private final T33UseCase t33UseCase;


    public L02Controller(L02UseCase useCase,
                         CatalogT4UseCase catalogT4UseCase,
                         T164UseCase t164UseCase,
                         T165UseCase t165UseCase,
                         T166UseCase t166UseCase,
                         T62AUseCase t62AUseCase,
                         T167UseCase t167UseCase,
                         T64UseCase t64UseCase,
                         T168UseCase t168UseCase,
                         T33UseCase t33UseCase) {
        this.useCase = useCase;
        this.catalogT4UseCase = catalogT4UseCase;
        this.t164UseCase = t164UseCase;
        this.t165UseCase = t165UseCase;
        this.t166UseCase = t166UseCase;
        this.t62AUseCase = t62AUseCase;
        this.t167UseCase = t167UseCase;
        this.t64UseCase = t64UseCase;
        this.t168UseCase = t168UseCase;
        this.t33UseCase = t33UseCase;
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

    @GetMapping("/report")
    public List<L02ReportResponse> getAllReport() {
        List<L02ReportResponse> reports = new java.util.ArrayList<>(List.of());

        for (L02Dto dto: useCase.findAll()){
            L02ReportResponse report = new L02ReportResponse();
            catalogT4UseCase.getAllCatalogT4().stream().filter(x -> x.getId() == (dto.getCodigoTipoIdentificacion()))
                    .findFirst()
                    .ifPresent(catalogT4 -> report.setCodigoTipoIdentificacion(
                            new ReportDto(catalogT4.getId(), catalogT4.getCodigo(),catalogT4.getDescripcion())
                    ));

            T164Dto emisor = t164UseCase.findById(dto.getCodigoEmisor());
            if (emisor != null) {
                report.setCodigoEmisor(new ReportDto(emisor.getId(), emisor.getCodigo(), emisor.getDescripcion()));
            }

            report.setNumeroTitulo(dto.getNumeroTitulo());
            report.setFechaEmision(dto.getFechaEmision());
            report.setFechaVencimiento(dto.getFechaVencimiento());
            report.setIdentificacionInstrumento(dto.getIdentificacionInstrumento());

            T166Dto categoriaInstrumento = t166UseCase.findById(dto.getCodigoTipoInstrumento());
            if (categoriaInstrumento != null) {
                report.setCodigoCategoriaInstrumento(new ReportDto(categoriaInstrumento.getId(), categoriaInstrumento.getCodigo(), categoriaInstrumento.getDescripcion()));
            }

            T62ADto tipoInstrumento = t62AUseCase.findById(dto.getCodigoTipoInstrumento());
            if (tipoInstrumento != null) {
                report.setCodigoTipoInstrumento(new ReportDto(tipoInstrumento.getId(), tipoInstrumento.getCodigo(), tipoInstrumento.getDescripcion()));
            }

            T167Dto opcionalidad = t167UseCase.findById(dto.getCodigoOpcionalidad());
            if (opcionalidad != null) {
                report.setCodigoOpcionalidad(new ReportDto(opcionalidad.getId(), opcionalidad.getCodigo(), opcionalidad.getDescripcion()));
            }

            T64Dto tasaBase = t64UseCase.findById(dto.getCodigoTasaBase());
            if (tasaBase != null) {
                report.setCodigoTasaBase(new ReportDto(tasaBase.getId(), tasaBase.getCodigo(), tasaBase.getDescripcion()));
            }

            report.setDiferencialRevision(dto.getDiferencialRevision());

            T168Dto tipoTasa = t168UseCase.findById(dto.getCodigoTipoTasa());
            if (tipoTasa != null) {
                report.setCodigoTipoTasa(new ReportDto(tipoTasa.getId(), tipoTasa.getCodigo(), tipoTasa.getDescripcion()));
            }

            T33Dto modenaDenominacion = t33UseCase.findById(dto.getCodigoMonedaDenominacion());
            if (modenaDenominacion != null) {
                report.setMonedaDenominacion(new ReportDto(modenaDenominacion.getId(), modenaDenominacion.getCodigo(), modenaDenominacion.getDescripcion()));
            }

            report.setUnidadesAdquiridas(dto.getUnidadesAdquiridas());
            report.setValorNominalDenominacion(dto.getValorNominalDenominacion());
            report.setValorNominalDolares(dto.getValorNominalDolares());
            report.setPrecioCompra(dto.getPrecioCompra());
            report.setValorCompraDenominacion(dto.getValorCompraDenominacion());
            report.setValorCompraDolares(dto.getValorCompraDolares());
            report.setFrecuenciaRevision(dto.getFrecuenciaRevision());
            report.setPeriodicidadPago(dto.getPeriodicidadPago());

            reports.add(report);
        }
        return reports;
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
