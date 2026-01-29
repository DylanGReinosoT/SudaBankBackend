package com.sudamericano.bank.domain.model.structure.R;

import java.math.BigDecimal;
import java.time.LocalDate;

public class R13Dto {
    private Long id;

    private String codigoGrupoEconomico;

    private Integer codigoTipoIdentificacion;

    private String identificacionIntegrante;

    private Integer codigoEstadoIntegrante;

    private LocalDate fechaEstadoIntegrante;

    private Integer factorIntegracion;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCodigoGrupoEconomico() {
        return codigoGrupoEconomico;
    }

    public void setCodigoGrupoEconomico(String codigoGrupoEconomico) {
        this.codigoGrupoEconomico = codigoGrupoEconomico;
    }

    public Integer getCodigoTipoIdentificacion() {
        return codigoTipoIdentificacion;
    }

    public void setCodigoTipoIdentificacion(Integer codigoTipoIdentificacion) {
        this.codigoTipoIdentificacion = codigoTipoIdentificacion;
    }

    public String getIdentificacionIntegrante() {
        return identificacionIntegrante;
    }

    public void setIdentificacionIntegrante(String identificacionIntegrante) {
        this.identificacionIntegrante = identificacionIntegrante;
    }

    public Integer getCodigoEstadoIntegrante() {
        return codigoEstadoIntegrante;
    }

    public void setCodigoEstadoIntegrante(Integer codigoEstadoIntegrante) {
        this.codigoEstadoIntegrante = codigoEstadoIntegrante;
    }

    public LocalDate getFechaEstadoIntegrante() {
        return fechaEstadoIntegrante;
    }

    public void setFechaEstadoIntegrante(LocalDate fechaEstadoIntegrante) {
        this.fechaEstadoIntegrante = fechaEstadoIntegrante;
    }

    public Integer getFactorIntegracion() {
        return factorIntegracion;
    }

    public void setFactorIntegracion(Integer factorIntegracion) {
        this.factorIntegracion = factorIntegracion;
    }
}
