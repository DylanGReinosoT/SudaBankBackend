package com.sudamericano.bank.infrastructure.controller.structure.R;

import com.sudamericano.bank.domain.model.structure.R.R04Dto;
import com.sudamericano.bank.domain.ports.inputs.catalog.*;
import com.sudamericano.bank.domain.ports.inputs.structure.R.R04UseCase;
import com.sudamericano.bank.infrastructure.outputs.ResponseDTO;
import com.sudamericano.bank.infrastructure.outputs.structure.R04ResumeResponse;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@Tag(name = "Structure R04", description = "Structure R04 management endpoints")
@RestController
@RequestMapping("/api/structures/R04")
public class R04Controller {
    private final R04UseCase useCase;
    private final CatalogT4UseCase catalogT4UseCase;
    private final CatalogT29UseCase catalogT29UseCase;
    private final CatalogT35UseCase catalogT35UseCase;
    private final CatalogT55UseCase catalogT55UseCase;
    private final CatalogT218UseCase catalogT218UseCase;
    private final CatalogT317UseCase catalogT317UseCase;

    public R04Controller(R04UseCase useCase,
                         CatalogT4UseCase catalogT4UseCase,
                         CatalogT29UseCase catalogT29UseCase,
                         CatalogT35UseCase catalogT35UseCase,
                         CatalogT55UseCase catalogT55UseCase,
                         CatalogT218UseCase catalogT218UseCase,
                         CatalogT317UseCase catalogT317UseCase) {
        this.useCase = useCase;
        this.catalogT4UseCase = catalogT4UseCase;
        this.catalogT29UseCase = catalogT29UseCase;
        this.catalogT35UseCase = catalogT35UseCase;
        this.catalogT55UseCase = catalogT55UseCase;
        this.catalogT218UseCase = catalogT218UseCase;
        this.catalogT317UseCase = catalogT317UseCase;
    }

    @GetMapping
    public List<R04Dto> getAll() {
        return useCase.findAll();
    }

    @GetMapping("/resume")
    public List<R04ResumeResponse> getAllResume() {
        List<R04ResumeResponse> resumes = new java.util.ArrayList<>(List.of());

        for (R04Dto dto : useCase.findAll()) {
            R04ResumeResponse resume = new R04ResumeResponse();
            
            if (dto.getCodigoTipoIdentificacion() != null) {
                var catalogT4 = catalogT4UseCase.findById(dto.getCodigoTipoIdentificacion());
                if (catalogT4 != null) {
                    resume.setTipoIdentificacion(new ResponseDTO(catalogT4.getId(), catalogT4.getDescripcion()));
                }
            }

            resume.setNumeroOperacion(dto.getNumeroOperacion());
            resume.setIdentificacionSujeto(dto.getIdentificacionSujeto());
            resume.setDiasMorosidad(dto.getDiasMorosidad());

            if (dto.getCodigoMetodologiaCalificacion() != null) {
                var catalogT218 = catalogT218UseCase.findById(dto.getCodigoMetodologiaCalificacion());
                if (catalogT218 != null) {
                    resume.setMetodologiaCalificacion(new ResponseDTO(catalogT218.getId(), catalogT218.getDescripcion()));
                }
            }

            if (dto.getCodigoCalificacionPropia() != null) {
                var catalogT29 = catalogT29UseCase.findById(dto.getCodigoCalificacionPropia());
                if (catalogT29 != null) {
                    resume.setCalificacionPropia(new ResponseDTO(catalogT29.getId(), catalogT29.getDescripcion()));
                }
            }

            if (dto.getCodigoCalificacionHomologada() != null) {
                var catalogT29 = catalogT29UseCase.findById(dto.getCodigoCalificacionHomologada());
                if (catalogT29 != null) {
                    resume.setCalificacionHomologada(new ResponseDTO(catalogT29.getId(), catalogT29.getDescripcion()));
                }
            }

            resume.setTasaInteres(dto.getTasaInteres());
            resume.setValorPorVencer1a30(dto.getValorSaldoVencer1a30d());
            resume.setValorPorVencer31a90(dto.getValorSaldoVencer31a90d());
            resume.setValorPorVencer91a180(dto.getValorSaldoVencer91a180d());
            resume.setValorPorVencer181a360(dto.getValorSaldoVencer181a360d());
            resume.setValorPorVencerMas360(dto.getValorSaldoVencerMasde360d());
            resume.setValorNoDevenga1a30(dto.getValorNoDevInteres1a30d());
            resume.setValorNoDevenga31a90(dto.getValorNoDevInteres31a90d());
            resume.setValorNoDevenga91a180(dto.getValorNoDevInteres91a180d());
            resume.setValorNoDevenga181a360(dto.getValorNoDevInteres181a360d());
            resume.setValorNoDevengaMas360(dto.getValorNoDevInteresMasde360d());
            resume.setValorVencido1a30(dto.getValorVencido1a30d());
            resume.setValorVencido31a90(dto.getValorVencido31a90d());
            resume.setValorVencido91a180(dto.getValorVencido91a180d());
            resume.setValorVencido181a360(dto.getValorVencido181a360d());
            resume.setValorVencidoMas360(dto.getValorVencidoMasde360d());
            resume.setValorVencido181a270(dto.getValorVencido181a270d());
            resume.setValorVencidoMas270(dto.getValorVencidoMasde270d());
            resume.setValorVencido91a270(dto.getValorVencido91a270d());
            resume.setValorVencido271a360(dto.getValorVencido271a360d());
            resume.setValorVencido361a720(dto.getValorVencido361a720d());
            resume.setValorVencidoMas720(dto.getValorVencidoMasde720d());
            resume.setGastosRecuperacion(dto.getGastosRecuperaCarteraVencida());
            resume.setInteresOrdinario(dto.getInteresOrdinario());
            resume.setInteresSobreMora(dto.getInteresSobreMora());
            resume.setValorDemandaJudicial(dto.getValorDemandaJudicial());
            resume.setCarteraCastigada(dto.getCarteraCastigada());
            resume.setProvisionRequeridaOriginal(dto.getProvisionRequeridaOriginal());
            resume.setProvisionRequeridaReducida(dto.getProvisionRequeridaReducida());
            resume.setProvisionConstituida(dto.getProvisionConstituida());

            if (dto.getCodigoTipoOperacion() != null) {
                var catalogT35 = catalogT35UseCase.findById(dto.getCodigoTipoOperacion());
                if (catalogT35 != null) {
                    resume.setTipoOperacion(new ResponseDTO(catalogT35.getId(), catalogT35.getDescripcion()));
                }
            }

            if (dto.getCodigoObjetoFideicomiso() != null) {
                var catalogT55 = catalogT55UseCase.findById(dto.getCodigoObjetoFideicomiso());
                if (catalogT55 != null) {
                    resume.setObjetoFideicomiso(new ResponseDTO(catalogT55.getId(), catalogT55.getDescripcion()));
                }
            }

            resume.setPrimaDescuento(dto.getPrimaDescuento());
            resume.setCuotaCredito(dto.getCuotaCredito());
            resume.setValorInteresesCuota(dto.getValorInteresCuotaCredito());
            resume.setValorSeguro(dto.getValorSeguro());
            resume.setSaldoCuotaCapitalDiferida(dto.getSaldoCuotaCapitalDiferida());
            resume.setValorInteresCapitalDiferido(dto.getValorInteresCapitalDiferido());
            resume.setFechaTransferenciaCuentasVencidas(dto.getFechaTransferCuentasVencidas());
            resume.setInteresesAcumuladosPorCobrar(dto.getInteresesAcumuladosCobrar());
            resume.setInteresesReversados(dto.getInteresesReservados());
            resume.setFechaExigibilidadCuota(dto.getFechaExigibilidadCuota());

            if (dto.getCodigoTipoSistemaAmortizacion() != null) {
                var catalogT317 = catalogT317UseCase.findById(dto.getCodigoTipoSistemaAmortizacion());
                if (catalogT317 != null) {
                    resume.setTipoSistemaAmortizacion(new ResponseDTO(catalogT317.getId(), catalogT317.getDescripcion()));
                }
            }

            resumes.add(resume);
        }
        return resumes;
    }

    @GetMapping("/{id}")
    public R04Dto getById(@PathVariable Long id) {
        return useCase.findById(id);
    }

    @PostMapping
    public R04Dto create(@RequestBody R04Dto dto) {
        return useCase.create(dto);
    }

    @PutMapping("/{id}")
    public R04Dto update(@PathVariable Long id, @RequestBody R04Dto dto) {
        return useCase.update(id, dto);
    }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        useCase.delete(id);
    }
}   