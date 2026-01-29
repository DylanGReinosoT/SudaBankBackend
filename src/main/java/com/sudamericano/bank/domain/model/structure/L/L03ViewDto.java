package com.sudamericano.bank.domain.model.structure.L;

import java.time.LocalDate;

public class L03ViewDto {
	private Long id;
	private String codigoTipoIdentificacionEmisor;
	private String descripcionTipoIdentificacionEmisor;
	private String codigoIdentificacionEmisor;
	private String descripcionIdentificacionEmisor;
	private String numeroTitulo;
	private LocalDate fechaEmision;
	private LocalDate fechaCompra;
	private String codigoEstadoTitulo;
	private String descripcionEstadoTitulo;
	private String codigoCategoriaInversion;
	private String descripcionCategoriaInversion;
	private String codigoRangoVencimiento;
	private String descripcionRangoVencimiento;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCodigoTipoIdentificacionEmisor() {
		return codigoTipoIdentificacionEmisor;
	}

	public void setCodigoTipoIdentificacionEmisor(String codigoTipoIdentificacionEmisor) {
		this.codigoTipoIdentificacionEmisor = codigoTipoIdentificacionEmisor;
	}

	public String getDescripcionTipoIdentificacionEmisor() {
		return descripcionTipoIdentificacionEmisor;
	}

	public void setDescripcionTipoIdentificacionEmisor(String descripcionTipoIdentificacionEmisor) {
		this.descripcionTipoIdentificacionEmisor = descripcionTipoIdentificacionEmisor;
	}

	public String getCodigoIdentificacionEmisor() {
		return codigoIdentificacionEmisor;
	}

	public void setCodigoIdentificacionEmisor(String codigoIdentificacionEmisor) {
		this.codigoIdentificacionEmisor = codigoIdentificacionEmisor;
	}

	public String getDescripcionIdentificacionEmisor() {
		return descripcionIdentificacionEmisor;
	}

	public void setDescripcionIdentificacionEmisor(String descripcionIdentificacionEmisor) {
		this.descripcionIdentificacionEmisor = descripcionIdentificacionEmisor;
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

	public String getCodigoEstadoTitulo() {
		return codigoEstadoTitulo;
	}

	public void setCodigoEstadoTitulo(String codigoEstadoTitulo) {
		this.codigoEstadoTitulo = codigoEstadoTitulo;
	}

	public String getDescripcionEstadoTitulo() {
		return descripcionEstadoTitulo;
	}

	public void setDescripcionEstadoTitulo(String descripcionEstadoTitulo) {
		this.descripcionEstadoTitulo = descripcionEstadoTitulo;
	}

	public String getCodigoCategoriaInversion() {
		return codigoCategoriaInversion;
	}

	public void setCodigoCategoriaInversion(String codigoCategoriaInversion) {
		this.codigoCategoriaInversion = codigoCategoriaInversion;
	}

	public String getDescripcionCategoriaInversion() {
		return descripcionCategoriaInversion;
	}

	public void setDescripcionCategoriaInversion(String descripcionCategoriaInversion) {
		this.descripcionCategoriaInversion = descripcionCategoriaInversion;
	}

	public String getCodigoRangoVencimiento() {
		return codigoRangoVencimiento;
	}

	public void setCodigoRangoVencimiento(String codigoRangoVencimiento) {
		this.codigoRangoVencimiento = codigoRangoVencimiento;
	}

	public String getDescripcionRangoVencimiento() {
		return descripcionRangoVencimiento;
	}

	public void setDescripcionRangoVencimiento(String descripcionRangoVencimiento) {
		this.descripcionRangoVencimiento = descripcionRangoVencimiento;
	}
}

