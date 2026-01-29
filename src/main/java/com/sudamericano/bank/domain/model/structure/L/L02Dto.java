package com.sudamericano.bank.domain.model.structure.L;

import lombok.*;

import java.math.BigDecimal;
import java.time.LocalDate;

public class L02Dto {

	private Long id;
	private Integer codigoTipoIdentificacion;
    private Integer codigoEmisor;
    private String numeroTitulo;
    private LocalDate fechaEmision;
    private LocalDate fechaCompra;
    private LocalDate fechaVencimiento;
    private Integer codigoIdentificadorInstrumento;
    private String identificacionInstrumento;
    private Integer codigoCategoriaInstrumento;
    private Integer codigoTipoInstrumento;
    private Integer codigoOpcionalidad;
    private Integer codigoTasaBase;
    private Integer diferencialRevision;
    private Integer codigoTipoTasa;
    private Integer codigoMonedaDenominacion;
    private Integer unidadesAdquiridas;
    private Float valorNominalDenominacion;
    private Float valorNominalDolares;
    private Float precioCompra;
    private Float valorCompraDenominacion;
    private Float valorCompraDolares;
    private Integer frecuenciaRevision;
    private Integer periodicidadPago;

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

    public LocalDate getFechaVencimiento() {
        return fechaVencimiento;
    }

    public void setFechaVencimiento(LocalDate fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }

    public Integer getCodigoIdentificadorInstrumento() {
        return codigoIdentificadorInstrumento;
    }

    public void setCodigoIdentificadorInstrumento(Integer codigoIdentificadorInstrumento) {
        this.codigoIdentificadorInstrumento = codigoIdentificadorInstrumento;
    }

    public String getIdentificacionInstrumento() {
        return identificacionInstrumento;
    }

    public void setIdentificacionInstrumento(String identificacionInstrumento) {
        this.identificacionInstrumento = identificacionInstrumento;
    }

    public Integer getCodigoCategoriaInstrumento() {
        return codigoCategoriaInstrumento;
    }

    public void setCodigoCategoriaInstrumento(Integer codigoCategoriaInstrumento) {
        this.codigoCategoriaInstrumento = codigoCategoriaInstrumento;
    }

    public Integer getCodigoTipoInstrumento() {
        return codigoTipoInstrumento;
    }

    public void setCodigoTipoInstrumento(Integer codigoTipoInstrumento) {
        this.codigoTipoInstrumento = codigoTipoInstrumento;
    }

    public Integer getCodigoOpcionalidad() {
        return codigoOpcionalidad;
    }

    public void setCodigoOpcionalidad(Integer codigoOpcionalidad) {
        this.codigoOpcionalidad = codigoOpcionalidad;
    }

    public Integer getCodigoTasaBase() {
        return codigoTasaBase;
    }

    public void setCodigoTasaBase(Integer codigoTasaBase) {
        this.codigoTasaBase = codigoTasaBase;
    }

    public Integer getDiferencialRevision() {
        return diferencialRevision;
    }

    public void setDiferencialRevision(Integer diferencialRevision) {
        this.diferencialRevision = diferencialRevision;
    }

    public Integer getCodigoTipoTasa() {
        return codigoTipoTasa;
    }

    public void setCodigoTipoTasa(Integer codigoTipoTasa) {
        this.codigoTipoTasa = codigoTipoTasa;
    }

    public Integer getCodigoMonedaDenominacion() {
        return codigoMonedaDenominacion;
    }

    public void setCodigoMonedaDenominacion(Integer codigoMonedaDenominacion) {
        this.codigoMonedaDenominacion = codigoMonedaDenominacion;
    }

    public Integer getUnidadesAdquiridas() {
        return unidadesAdquiridas;
    }

    public void setUnidadesAdquiridas(Integer unidadesAdquiridas) {
        this.unidadesAdquiridas = unidadesAdquiridas;
    }

    public Float getValorNominalDenominacion() {
        return valorNominalDenominacion;
    }

    public void setValorNominalDenominacion(Float valorNominalDenominacion) {
        this.valorNominalDenominacion = valorNominalDenominacion;
    }

    public Float getValorNominalDolares() {
        return valorNominalDolares;
    }

    public void setValorNominalDolares(Float valorNominalDolares) {
        this.valorNominalDolares = valorNominalDolares;
    }

    public Float getPrecioCompra() {
        return precioCompra;
    }

    public void setPrecioCompra(Float precioCompra) {
        this.precioCompra = precioCompra;
    }

    public Float getValorCompraDenominacion() {
        return valorCompraDenominacion;
    }

    public void setValorCompraDenominacion(Float valorCompraDenominacion) {
        this.valorCompraDenominacion = valorCompraDenominacion;
    }

    public Float getValorCompraDolares() {
        return valorCompraDolares;
    }

    public void setValorCompraDolares(Float valorCompraDolares) {
        this.valorCompraDolares = valorCompraDolares;
    }

    public Integer getFrecuenciaRevision() {
        return frecuenciaRevision;
    }

    public void setFrecuenciaRevision(Integer frecuenciaRevision) {
        this.frecuenciaRevision = frecuenciaRevision;
    }

    public Integer getPeriodicidadPago() {
        return periodicidadPago;
    }

    public void setPeriodicidadPago(Integer periodicidadPago) {
        this.periodicidadPago = periodicidadPago;
    }
}
