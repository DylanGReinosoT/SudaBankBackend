package com.sudamericano.bank.domain.model.structure.L;

import java.time.LocalDate;

public class L04Dto {
    private Integer id;
    private Integer codigoTipoIdentificacion;
    private Integer codigoEmisor;
    private String numeroTitulo;
    private LocalDate fechaEmision;
    private LocalDate fechaCompra;
    private Integer cuentaOrigen;
    private Integer cuentaDestino;
    private Float valorLibrosCuentaOrigen;
    private Float valorLibrosCuentaDestino;
    private LocalDate fechaTransferencia;
    private Integer codigoMotivoTransferencia;

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

    public Integer getCodigoEmisor() {
        return codigoEmisor;
    }

    public void setCodigoEmisor(Integer codigoEmisor) {
        this.codigoEmisor = codigoEmisor;
    }

    public String getNumeroTitulo() {
        return numeroTitulo;
    }

    public void setNumeroTitulo(String numeroTitulo) {
        this.numeroTitulo = numeroTitulo;
    }

    public LocalDate getFechaEmision() {
        return fechaEmision;
    }

    public void setFechaEmision(LocalDate fechaEmision) {
        this.fechaEmision = fechaEmision;
    }

    public LocalDate getFechaCompra() {
        return fechaCompra;
    }

    public void setFechaCompra(LocalDate fechaCompra) {
        this.fechaCompra = fechaCompra;
    }

    public Integer getCuentaOrigen() {
        return cuentaOrigen;
    }

    public void setCuentaOrigen(Integer cuentaOrigen) {
        this.cuentaOrigen = cuentaOrigen;
    }

    public Integer getCuentaDestino() {
        return cuentaDestino;
    }

    public void setCuentaDestino(Integer cuentaDestino) {
        this.cuentaDestino = cuentaDestino;
    }

    public Float getValorLibrosCuentaOrigen() {
        return valorLibrosCuentaOrigen;
    }

    public void setValorLibrosCuentaOrigen(Float valorLibrosCuentaOrigen) {
        this.valorLibrosCuentaOrigen = valorLibrosCuentaOrigen;
    }

    public Float getValorLibrosCuentaDestino() {
        return valorLibrosCuentaDestino;
    }

    public void setValorLibrosCuentaDestino(Float valorLibrosCuentaDestino) {
        this.valorLibrosCuentaDestino = valorLibrosCuentaDestino;
    }

    public LocalDate getFechaTransferencia() {
        return fechaTransferencia;
    }

    public void setFechaTransferencia(LocalDate fechaTransferencia) {
        this.fechaTransferencia = fechaTransferencia;
    }

    public Integer getCodigoMotivoTransferencia() {
        return codigoMotivoTransferencia;
    }

    public void setCodigoMotivoTransferencia(Integer codigoMotivoTransferencia) {
        this.codigoMotivoTransferencia = codigoMotivoTransferencia;
    }
}
