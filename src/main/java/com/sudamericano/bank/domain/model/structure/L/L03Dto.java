package com.sudamericano.bank.domain.model.structure.L;

import java.math.BigDecimal;
import java.time.LocalDate;

public class L03Dto {

	private Long id;
	private String codigoTipoIdentificacionEmisor;
	private String codigoIdentificacionEmisor;
	private String numeroTitulo;
	private LocalDate fechaEmision;
	private LocalDate fechaCompra;
	private String codigoEstadoTitulo;
	private String codigoCategoriaInversion;
	private Integer codigoRangoVencimiento;
	private BigDecimal tasaInteresNominal;
	private BigDecimal montoInteresesUsd;
	private BigDecimal valorLibrosUsd;
	private BigDecimal precioMercado;
	private LocalDate fechaValorMercado;
	private BigDecimal valorMercadoUsd;
	private String codigoFuenteInfoMercado;
	private BigDecimal tasaRetornoTir;
	private BigDecimal valorPresenteUsd;
	private BigDecimal provisionRequerida;
	private BigDecimal provisionConstituida;
	private BigDecimal gananciasPerdidasPeriodo;
	private Integer codigoCalificacionRiesgo;
	private Integer codigoCategoriaCalificacion;
	private Integer codigoCalificadoraRiesgo;
	private LocalDate fechaUltimaCalificacion;
	private LocalDate fechaLiquidacionVenta;
	private Integer precioLiquidacionVenta;
	private BigDecimal valorFondoInversionUsd;
	private Integer codigoFondoInversion;
	private String codigoTipoIdentificacionCustodio;
	private String codigoIdentificacionCustodio;
	private Integer codigoCalificacionRiesgoCustodio;
	private Integer codigoCalificadoraRiesgoCustodio;
	private Integer codigoSubsidiaria;

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

	public String getCodigoIdentificacionEmisor() {
		return codigoIdentificacionEmisor;
	}

	public void setCodigoIdentificacionEmisor(String codigoIdentificacionEmisor) {
		this.codigoIdentificacionEmisor = codigoIdentificacionEmisor;
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

	public String getCodigoCategoriaInversion() {
		return codigoCategoriaInversion;
	}

	public void setCodigoCategoriaInversion(String codigoCategoriaInversion) {
		this.codigoCategoriaInversion = codigoCategoriaInversion;
	}

	public Integer getCodigoRangoVencimiento() {
		return codigoRangoVencimiento;
	}

	public void setCodigoRangoVencimiento(Integer codigoRangoVencimiento) {
		this.codigoRangoVencimiento = codigoRangoVencimiento;
	}

	public BigDecimal getTasaInteresNominal() {
		return tasaInteresNominal;
	}

	public void setTasaInteresNominal(BigDecimal tasaInteresNominal) {
		this.tasaInteresNominal = tasaInteresNominal;
	}

	public BigDecimal getMontoInteresesUsd() {
		return montoInteresesUsd;
	}

	public void setMontoInteresesUsd(BigDecimal montoInteresesUsd) {
		this.montoInteresesUsd = montoInteresesUsd;
	}

	public BigDecimal getValorLibrosUsd() {
		return valorLibrosUsd;
	}

	public void setValorLibrosUsd(BigDecimal valorLibrosUsd) {
		this.valorLibrosUsd = valorLibrosUsd;
	}

	public BigDecimal getPrecioMercado() {
		return precioMercado;
	}

	public void setPrecioMercado(BigDecimal precioMercado) {
		this.precioMercado = precioMercado;
	}

	public LocalDate getFechaValorMercado() {
		return fechaValorMercado;
	}

	public void setFechaValorMercado(LocalDate fechaValorMercado) {
		this.fechaValorMercado = fechaValorMercado;
	}

	public BigDecimal getValorMercadoUsd() {
		return valorMercadoUsd;
	}

	public void setValorMercadoUsd(BigDecimal valorMercadoUsd) {
		this.valorMercadoUsd = valorMercadoUsd;
	}

	public String getCodigoFuenteInfoMercado() {
		return codigoFuenteInfoMercado;
	}

	public void setCodigoFuenteInfoMercado(String codigoFuenteInfoMercado) {
		this.codigoFuenteInfoMercado = codigoFuenteInfoMercado;
	}

	public BigDecimal getTasaRetornoTir() {
		return tasaRetornoTir;
	}

	public void setTasaRetornoTir(BigDecimal tasaRetornoTir) {
		this.tasaRetornoTir = tasaRetornoTir;
	}

	public BigDecimal getValorPresenteUsd() {
		return valorPresenteUsd;
	}

	public void setValorPresenteUsd(BigDecimal valorPresenteUsd) {
		this.valorPresenteUsd = valorPresenteUsd;
	}

	public BigDecimal getProvisionRequerida() {
		return provisionRequerida;
	}

	public void setProvisionRequerida(BigDecimal provisionRequerida) {
		this.provisionRequerida = provisionRequerida;
	}

	public BigDecimal getProvisionConstituida() {
		return provisionConstituida;
	}

	public void setProvisionConstituida(BigDecimal provisionConstituida) {
		this.provisionConstituida = provisionConstituida;
	}

	public BigDecimal getGananciasPerdidasPeriodo() {
		return gananciasPerdidasPeriodo;
	}

	public void setGananciasPerdidasPeriodo(BigDecimal gananciasPerdidasPeriodo) {
		this.gananciasPerdidasPeriodo = gananciasPerdidasPeriodo;
	}

	public Integer getCodigoCalificacionRiesgo() {
		return codigoCalificacionRiesgo;
	}

	public void setCodigoCalificacionRiesgo(Integer codigoCalificacionRiesgo) {
		this.codigoCalificacionRiesgo = codigoCalificacionRiesgo;
	}

	public Integer getCodigoCategoriaCalificacion() {
		return codigoCategoriaCalificacion;
	}

	public void setCodigoCategoriaCalificacion(Integer codigoCategoriaCalificacion) {
		this.codigoCategoriaCalificacion = codigoCategoriaCalificacion;
	}

	public Integer getCodigoCalificadoraRiesgo() {
		return codigoCalificadoraRiesgo;
	}

	public void setCodigoCalificadoraRiesgo(Integer codigoCalificadoraRiesgo) {
		this.codigoCalificadoraRiesgo = codigoCalificadoraRiesgo;
	}

	public LocalDate getFechaUltimaCalificacion() {
		return fechaUltimaCalificacion;
	}

	public void setFechaUltimaCalificacion(LocalDate fechaUltimaCalificacion) {
		this.fechaUltimaCalificacion = fechaUltimaCalificacion;
	}

	public LocalDate getFechaLiquidacionVenta() {
		return fechaLiquidacionVenta;
	}

	public void setFechaLiquidacionVenta(LocalDate fechaLiquidacionVenta) {
		this.fechaLiquidacionVenta = fechaLiquidacionVenta;
	}

	public Integer getPrecioLiquidacionVenta() {
		return precioLiquidacionVenta;
	}

	public void setPrecioLiquidacionVenta(Integer precioLiquidacionVenta) {
		this.precioLiquidacionVenta = precioLiquidacionVenta;
	}

	public BigDecimal getValorFondoInversionUsd() {
		return valorFondoInversionUsd;
	}

	public void setValorFondoInversionUsd(BigDecimal valorFondoInversionUsd) {
		this.valorFondoInversionUsd = valorFondoInversionUsd;
	}

	public Integer getCodigoFondoInversion() {
		return codigoFondoInversion;
	}

	public void setCodigoFondoInversion(Integer codigoFondoInversion) {
		this.codigoFondoInversion = codigoFondoInversion;
	}

	public String getCodigoTipoIdentificacionCustodio() {
		return codigoTipoIdentificacionCustodio;
	}

	public void setCodigoTipoIdentificacionCustodio(String codigoTipoIdentificacionCustodio) {
		this.codigoTipoIdentificacionCustodio = codigoTipoIdentificacionCustodio;
	}

	public String getCodigoIdentificacionCustodio() {
		return codigoIdentificacionCustodio;
	}

	public void setCodigoIdentificacionCustodio(String codigoIdentificacionCustodio) {
		this.codigoIdentificacionCustodio = codigoIdentificacionCustodio;
	}

	public Integer getCodigoCalificacionRiesgoCustodio() {
		return codigoCalificacionRiesgoCustodio;
	}

	public void setCodigoCalificacionRiesgoCustodio(Integer codigoCalificacionRiesgoCustodio) {
		this.codigoCalificacionRiesgoCustodio = codigoCalificacionRiesgoCustodio;
	}

	public Integer getCodigoCalificadoraRiesgoCustodio() {
		return codigoCalificadoraRiesgoCustodio;
	}

	public void setCodigoCalificadoraRiesgoCustodio(Integer codigoCalificadoraRiesgoCustodio) {
		this.codigoCalificadoraRiesgoCustodio = codigoCalificadoraRiesgoCustodio;
	}

	public Integer getCodigoSubsidiaria() {
		return codigoSubsidiaria;
	}

	public void setCodigoSubsidiaria(Integer codigoSubsidiaria) {
		this.codigoSubsidiaria = codigoSubsidiaria;
	}
}
