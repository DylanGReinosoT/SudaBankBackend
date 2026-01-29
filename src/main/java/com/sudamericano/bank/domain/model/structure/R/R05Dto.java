package com.sudamericano.bank.domain.model.structure.R;

import java.time.LocalDate;

public class R05Dto {
    private Integer id;
    private Integer codigoTipoIdentificacion;
    private String identificacionSujeto;
    private String numeroOperacion;
    private Integer codigoTipoTransaccion;
    private LocalDate fechaCancelacion;
    private Integer codigoFormaCancelacion;
    private Integer codigoCalificacion;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
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

    public String getNumeroOperacion() {
        return numeroOperacion;
    }

    public void setNumeroOperacion(String numeroOperacion) {
        this.numeroOperacion = numeroOperacion;
    }

    public Integer getCodigoTipoTransaccion() {
        return codigoTipoTransaccion;
    }

    public void setCodigoTipoTransaccion(Integer codigoTipoTransaccion) {
        this.codigoTipoTransaccion = codigoTipoTransaccion;
    }

    public LocalDate getFechaCancelacion() {
        return fechaCancelacion;
    }

    public void setFechaCancelacion(LocalDate fechaCancelacion) {
        this.fechaCancelacion = fechaCancelacion;
    }

    public Integer getCodigoFormaCancelacion() {
        return codigoFormaCancelacion;
    }

    public void setCodigoFormaCancelacion(Integer codigoFormaCancelacion) {
        this.codigoFormaCancelacion = codigoFormaCancelacion;
    }

    public Integer getCodigoCalificacion() {
        return codigoCalificacion;
    }

    public void setCodigoCalificacion(Integer codigoCalificacion) {
        this.codigoCalificacion = codigoCalificacion;
    }
}
