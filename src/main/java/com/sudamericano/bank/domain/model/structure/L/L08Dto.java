package com.sudamericano.bank.domain.model.structure.L;

import java.math.BigDecimal;

public class L08Dto {
    private Integer id;
    private Integer codigoLiquidez;
    private Integer tipoIdentificacionEntidad;
    private String identificacionEntidad;
    private Integer tipoInstrumento;
    private Integer calificacionEntidad;
    private Integer calificadoraRiesgo;
    private BigDecimal lunes;
    private BigDecimal martes;
    private BigDecimal miercoles;
    private BigDecimal jueves;
    private BigDecimal viernes;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCodigoLiquidez() {
        return codigoLiquidez;
    }

    public void setCodigoLiquidez(Integer codigoLiquidez) {
        this.codigoLiquidez = codigoLiquidez;
    }

    public Integer getTipoIdentificacionEntidad() {
        return tipoIdentificacionEntidad;
    }

    public void setTipoIdentificacionEntidad(Integer tipoIdentificacionEntidad) {
        this.tipoIdentificacionEntidad = tipoIdentificacionEntidad;
    }

    public String getIdentificacionEntidad() {
        return identificacionEntidad;
    }

    public void setIdentificacionEntidad(String identificacionEntidad) {
        this.identificacionEntidad = identificacionEntidad;
    }

    public Integer getTipoInstrumento() {
        return tipoInstrumento;
    }

    public void setTipoInstrumento(Integer tipoInstrumento) {
        this.tipoInstrumento = tipoInstrumento;
    }

    public Integer getCalificacionEntidad() {
        return calificacionEntidad;
    }

    public void setCalificacionEntidad(Integer calificacionEntidad) {
        this.calificacionEntidad = calificacionEntidad;
    }

    public Integer getCalificadoraRiesgo() {
        return calificadoraRiesgo;
    }

    public void setCalificadoraRiesgo(Integer calificadoraRiesgo) {
        this.calificadoraRiesgo = calificadoraRiesgo;
    }

    public BigDecimal getLunes() {
        return lunes;
    }

    public void setLunes(BigDecimal lunes) {
        this.lunes = lunes;
    }

    public BigDecimal getMartes() {
        return martes;
    }

    public void setMartes(BigDecimal martes) {
        this.martes = martes;
    }

    public BigDecimal getMiercoles() {
        return miercoles;
    }

    public void setMiercoles(BigDecimal miercoles) {
        this.miercoles = miercoles;
    }

    public BigDecimal getJueves() {
        return jueves;
    }

    public void setJueves(BigDecimal jueves) {
        this.jueves = jueves;
    }

    public BigDecimal getViernes() {
        return viernes;
    }

    public void setViernes(BigDecimal viernes) {
        this.viernes = viernes;
    }
}
