package com.sudamericano.bank.infrastructure.persistence.entity.structure.L;

import jakarta.persistence.*;

import java.math.BigDecimal;

@Entity
@Table(name = "NESL08")
public class L08Entity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "CODIGO_LIQUIDEZ")
    private Integer codigoLiquidez;

    @Column(name = "TIPO_IDENTIFICACION_ENTIDAD")
    private Integer tipoIdentificacionEntidad;

    @Column(name = "IDENTIFICACION_ENTIDAD")
    private String identificacionEntidad;

    @Column(name = "TIPO_INSTRUMENTO")
    private Integer tipoInstrumento;

    @Column(name = "CALIFICACION_ENTIDAD")
    private Integer calificacionEntidad;

    @Column(name = "CALIFICADORA_RIESGO")
    private Integer calificadoraRiesgo;

    @Column(name = "LUNES", precision = 16, scale=8)
    private BigDecimal lunes;

    @Column(name = "MARTES", precision = 16, scale=8)
    private BigDecimal martes;

    @Column(name = "MIERCOLES", precision = 16, scale=8)
    private BigDecimal miercoles;

    @Column(name = "JUEVES", precision = 16, scale=8)
    private BigDecimal jueves;

    @Column(name = "VIERNES", precision = 16, scale=8)
    private BigDecimal viernes;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
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
