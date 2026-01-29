package com.sudamericano.bank.domain.model.structure.R;

import java.math.BigDecimal;
import java.time.LocalDate;

public class R20Dto {
    private Long id;
    private Integer codigoTipoIdentificacion;
    private String identificacionSujeto;
    private String numeroTarjeta;
    private Integer marcaTarjeta;
    private Integer claseTarjeta;
    private LocalDate fechaEmision;
    private LocalDate fechaVencimiento;
    private BigDecimal numeroTarjetasAdicionales;
    private Integer oficina;
    private Integer tipoCredito;
    private Integer estadoRegistro;
    private BigDecimal totalIngresosSujeto;
    private BigDecimal totalEgresosSujeto;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getCodigoTipoIdentificacion() {
        return codigoTipoIdentificacion;
    }

    public void setCodigoTipoIdentificacion(Integer codigoTipoIdentificacion) {
        this.codigoTipoIdentificacion = codigoTipoIdentificacion;
    }

    public String getIdentificacionSujeto() {
        return identificacionSujeto;
    }

    public void setIdentificacionSujeto(String identificacionSujeto) {
        this.identificacionSujeto = identificacionSujeto;
    }

    public String getNumeroTarjeta() {
        return numeroTarjeta;
    }

    public void setNumeroTarjeta(String numeroTarjeta) {
        this.numeroTarjeta = numeroTarjeta;
    }

    public Integer getMarcaTarjeta() {
        return marcaTarjeta;
    }

    public void setMarcaTarjeta(Integer marcaTarjeta) {
        this.marcaTarjeta = marcaTarjeta;
    }

    public Integer getClaseTarjeta() {
        return claseTarjeta;
    }

    public void setClaseTarjeta(Integer claseTarjeta) {
        this.claseTarjeta = claseTarjeta;
    }

    public LocalDate getFechaEmision() {
        return fechaEmision;
    }

    public void setFechaEmision(LocalDate fechaEmision) {
        this.fechaEmision = fechaEmision;
    }

    public LocalDate getFechaVencimiento() {
        return fechaVencimiento;
    }

    public void setFechaVencimiento(LocalDate fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }

    public BigDecimal getNumeroTarjetasAdicionales() {
        return numeroTarjetasAdicionales;
    }

    public void setNumeroTarjetasAdicionales(BigDecimal numeroTarjetasAdicionales) {
        this.numeroTarjetasAdicionales = numeroTarjetasAdicionales;
    }

    public Integer getOficina() {
        return oficina;
    }

    public void setOficina(Integer oficina) {
        this.oficina = oficina;
    }

    public Integer getTipoCredito() {
        return tipoCredito;
    }

    public void setTipoCredito(Integer tipoCredito) {
        this.tipoCredito = tipoCredito;
    }

    public Integer getEstadoRegistro() {
        return estadoRegistro;
    }

    public void setEstadoRegistro(Integer estadoRegistro) {
        this.estadoRegistro = estadoRegistro;
    }

    public BigDecimal getTotalIngresosSujeto() {
        return totalIngresosSujeto;
    }

    public void setTotalIngresosSujeto(BigDecimal totalIngresosSujeto) {
        this.totalIngresosSujeto = totalIngresosSujeto;
    }

    public BigDecimal getTotalEgresosSujeto() {
        return totalEgresosSujeto;
    }

    public void setTotalEgresosSujeto(BigDecimal totalEgresosSujeto) {
        this.totalEgresosSujeto = totalEgresosSujeto;
    }
}
