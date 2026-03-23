package com.sudamericano.bank.infrastructure.controller.structure.L;

import com.sudamericano.bank.domain.model.catalog.*;
import com.sudamericano.bank.domain.model.structure.L.L06Dto;
import com.sudamericano.bank.domain.ports.inputs.catalog.*;
import com.sudamericano.bank.domain.ports.inputs.structure.L.L06UseCase;
import com.sudamericano.bank.infrastructure.outputs.ReportDto;
import com.sudamericano.bank.infrastructure.outputs.ResponseDTO;
import com.sudamericano.bank.infrastructure.outputs.structure.L.report.L06ReportResponse;
import com.sudamericano.bank.infrastructure.outputs.structure.L.resume.L06ResumeResponse;
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
    private final T180UseCase t180UseCase;
    private final T171UseCase t171UseCase;
    private final T33UseCase t33UseCase;
    private final T169UseCase t169UseCase;
    private final T65UseCase t65UseCase;
    private final T66UseCase t66UseCase;

    public L06Controller(L06UseCase useCase,
                         CatalogT4UseCase catalogT4UseCase,
                         T164UseCase t164UseCase,
                         T180UseCase t180UseCase,
                         T171UseCase t171UseCase,
                         T33UseCase t33UseCase,
                         T169UseCase t169UseCase,
                         T65UseCase t65UseCase,
                         T66UseCase t66UseCase
    ) {
        this.useCase = useCase;
        this.catalogT4UseCase = catalogT4UseCase;
        this.t164UseCase = t164UseCase;
        this.t180UseCase = t180UseCase;
        this.t171UseCase = t171UseCase;
        this.t33UseCase = t33UseCase;
        this.t169UseCase = t169UseCase;
        this.t65UseCase = t65UseCase;
        this.t66UseCase = t66UseCase;
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

    @GetMapping("/report")
    public List<L06ReportResponse> getAllReport(){
        List<L06ReportResponse> reports = new java.util.ArrayList<>(List.of());

        for (L06Dto dto : useCase.findAll()) {
            L06ReportResponse report = new L06ReportResponse();

            catalogT4UseCase.getAllCatalogT4().stream().filter(x -> x.getId() == (dto.getCodigoTipoIdentificacionEmisor()))
                    .findFirst()
                    .ifPresent(catalogT4 -> report.setIdentificacionEmisor(
                            new ReportDto(catalogT4.getId(), catalogT4.getCodigo(),  catalogT4.getDescripcion())
                    ));

            T164Dto emisor = t164UseCase.findById(dto.getCodigoIdentificacionEmisor());
            if (emisor != null) {
                report.setEmisor(new ReportDto(emisor.getId(), emisor.getCodigo(), emisor.getDescripcion()));
            }


            report.setNumeroTitulo(dto.getNumeroTitulo());
            report.setNumeroOperacion(dto.getNumeroOperacion());
            report.setFechaEmision(dto.getFechaEmision());
            report.setFechaCompra(dto.getFechaCompra());

            T180Dto operacion = t180UseCase.findById(dto.getNumeroOperacion());
            if (operacion != null) {
                report.setCodigoEstadoOperacion(new ReportDto(operacion.getId(), operacion.getCodigo(),operacion.getDescripcion()));
            }

            report.setCuentaContable(dto.getCuentaContable());

            T171Dto tipoOperacion = t171UseCase.findById(dto.getCodigoTipoOperacion());
            if (tipoOperacion != null) {
                report.setCodigoTipoOperacion(new ReportDto(tipoOperacion.getId(), tipoOperacion.getCodigo(), tipoOperacion.getDescripcion()));
            }

            report.setFechaOperacion(dto.getFechaOperacion());
            report.setFechaVencimientoOperacion(dto.getFechaVencimientoOperacion());

            /*identificacion Contraparte*/
            catalogT4UseCase.getAllCatalogT4().stream().filter(x -> x.getId() == (dto.getCodigoTipoIdentificacionContraparte()))
                    .findFirst()
                    .ifPresent(catalogT4 -> report.setCodigoTipoIdentificacionContraparte(
                            new ReportDto(catalogT4.getId(), catalogT4.getCodigo(), catalogT4.getDescripcion())
                    ));
            T164Dto contraparte = t164UseCase.findById(dto.getCodigoIdentificacionContraparteOperacion());
            if (contraparte != null) {
                report.setCodigoIdentificacionContraparteOperacion(new ReportDto(contraparte.getId(), contraparte.getCodigo(), contraparte.getDescripcion()));
            }

            T33Dto moneda = t33UseCase.findById(dto.getCodigoMonedaDenominacion());
            if (moneda != null) {
                report.setCodigoMonedaDenominacion(new ReportDto(moneda.getId(), moneda.getCodigo(), moneda.getDescripcion()));
            }

            report.setMontoNegociadoDolares(dto.getMontoNegociadoDolares());
            report.setTasaEfectivaAnual(dto.getTasaEfectivaAnual());
            report.setValorNominalTituloDolares(dto.getValorNominalTituloDolares());
            report.setValorMercadoTituloDolar(dto.getValorMercadoTituloDolar());

            /*Calificacion*/
            T169Dto categoriaCalificacion = t169UseCase.findById(dto.getCodigoCategoriaCalificacion());
            if (categoriaCalificacion != null) {
                report.setCodigoCategoriaCalificacion(new ReportDto(categoriaCalificacion.getId(), categoriaCalificacion.getCodigo(), categoriaCalificacion.getDescripcion()));
            }

            T65Dto calificacionRiesgo = t65UseCase.findById(dto.getCodigoCalificacionRiesgo());
            if (calificacionRiesgo != null) {
                report.setCodigoCalificacionRiesgo(new ReportDto(calificacionRiesgo.getId(), calificacionRiesgo.getCodigo(), calificacionRiesgo.getDescripcion()));
            }

            T66Dto calificadoraRiesgo = t66UseCase.findById(dto.getCodigoCalificadoraRiesgo());
            if (calificadoraRiesgo != null) {
                report.setCodigoCalificadoraRiesgo(new ReportDto(calificadoraRiesgo.getId(), calificadoraRiesgo.getCodigo(), calificadoraRiesgo.getDescripcion()));
            }

            /*Identificacion */
            catalogT4UseCase.getAllCatalogT4().stream().filter(x -> x.getId() == (dto.getCodigoTipoIdentificacionCustodio()))
                    .findFirst()
                    .ifPresent(catalogT4 -> report.setCodigoTipoIdentificacionCustodio(
                            new ReportDto(catalogT4.getId(), catalogT4.getCodigo(), catalogT4.getDescripcion())
                    ));

            T164Dto custodio = t164UseCase.findById(dto.getCodigoIdentificacionCustodio());
            if (custodio != null) {
                report.setCodigoIdentificacionCustodio(new ReportDto(custodio.getId(), custodio.getCodigo(), custodio.getDescripcion()));
            }
            reports.add(report);

        }

        return reports;
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


