package com.sudamericano.bank.infrastructure.persistence.entity.structure.L;

import jakarta.persistence.*;

import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Table(name = "NESL03")
public class L03Entity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "CODIGO_TIPO_IDENTIFICACION_EMISOR", nullable = false, length = 1)
	private String codigoTipoIdentificacionEmisor;

	@Column(name = "CODIGO_IDENTIFICACION_EMISOR", nullable = false, length = 13)
	private String codigoIdentificacionEmisor;

	@Column(name = "NUMERO_TITULO", nullable = false, length = 20)
	private String numeroTitulo;

	@Column(name = "FECHA_EMISION", nullable = false)
	private LocalDate fechaEmision;

	@Column(name = "FECHA_COMPRA", nullable = false)
	private LocalDate fechaCompra;

	@Column(name = "CODIGO_ESTADO_TITULO", nullable = false, length = 1)
	private String codigoEstadoTitulo;

	@Column(name = "CODIGO_CATEGORIA_INVERSION", nullable = false, length = 2)
	private String codigoCategoriaInversion;

	@Column(name = "CODIGO_RANGO_VENCIMIENTO", nullable = false)
	private Integer codigoRangoVencimiento;

	@Column(name = "TASA_INTERES_NOMINAL", precision = 5, scale = 4)
	private BigDecimal tasaInteresNominal;

	@Column(name = "MONTO_INTERESES_USD", precision = 15, scale = 2)
	private BigDecimal montoInteresesUsd;

	@Column(name = "VALOR_LIBROS_USD", precision = 15, scale = 2)
	private BigDecimal valorLibrosUsd;

	@Column(name = "PRECIO_MERCADO", precision = 5, scale = 4)
	private BigDecimal precioMercado;

	@Column(name = "FECHA_VALOR_MERCADO")
	private LocalDate fechaValorMercado;

	@Column(name = "VALOR_MERCADO_USD", precision = 15, scale = 2)
	private BigDecimal valorMercadoUsd;

	@Column(name = "CODIGO_FUENTE_INFO_MERCADO", length = 1)
	private String codigoFuenteInfoMercado;

	@Column(name = "TASA_RETORNO_TIR", precision = 5, scale = 4)
	private BigDecimal tasaRetornoTir;

	@Column(name = "VALOR_PRESENTE_USD", precision = 15, scale = 2)
	private BigDecimal valorPresenteUsd;

	@Column(name = "PROVISION_REQUERIDA", precision = 15, scale = 2)
	private BigDecimal provisionRequerida;

	@Column(name = "PROVISION_CONSTITUIDA", precision = 15, scale = 2)
	private BigDecimal provisionConstituida;

	@Column(name = "GANANCIAS_PERDIDAS_PERIODO", precision = 15, scale = 2)
	private BigDecimal gananciasPerdidasPeriodo;

	@Column(name = "CODIGO_CALIFICACION_RIESGO")
	private Integer codigoCalificacionRiesgo;

	@Column(name = "CODIGO_CATEGORIA_CALIFICACION")
	private Integer codigoCategoriaCalificacion;

	@Column(name = "CODIGO_CALIFICADORA_RIESGO")
	private Integer codigoCalificadoraRiesgo;

	@Column(name = "FECHA_ULTIMA_CALIFICACION", nullable = false)
	private LocalDate fechaUltimaCalificacion;

	@Column(name = "FECHA_LIQUIDACION_VENTA", nullable = false)
	private LocalDate fechaLiquidacionVenta;

	@Column(name = "PRECIO_LIQUIDACION_VENTA", nullable = false)
	private Integer precioLiquidacionVenta;

	@Column(name = "VALOR_FONDO_INVERSION_USD", nullable = false, precision = 15, scale = 2)
	private BigDecimal valorFondoInversionUsd;

	@Column(name = "CODIGO_FONDO_INVERSION")
	private Integer codigoFondoInversion;

	@Column(name = "CODIGO_TIPO_IDENTIFICACION_CUSTODIO", length = 1)
	private String codigoTipoIdentificacionCustodio;

	@Column(name = "CODIGO_IDENTIFICACION_CUSTODIO", length = 13)
	private String codigoIdentificacionCustodio;

	@Column(name = "CODIGO_CALIFICACION_RIESGO_CUSTODIO")
	private Integer codigoCalificacionRiesgoCustodio;

	@Column(name = "CODIGO_CALIFICADORA_RIESGO_CUSTODIO")
	private Integer codigoCalificadoraRiesgoCustodio;

	@Column(name = "CODIGO_SUBSIDIARIA")
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
