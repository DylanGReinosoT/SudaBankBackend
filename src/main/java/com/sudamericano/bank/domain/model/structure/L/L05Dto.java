package com.sudamericano.bank.domain.model.structure.L;


import java.math.BigDecimal;
import java.time.LocalDate;

public class L05Dto {
    private Integer id;
    private Integer codigoTipoIdentificacion;
    private Integer codigoDepositario;
    private Integer codigoTipoDeposito;
    private String numeroIdentificacionDeposito;
    private String cuentaContable;
    private Integer codigoMoneda;
    private BigDecimal valorMonedaDenominacion;
    private BigDecimal valorLibrosDolares;
    private Integer codigoCalificacionRiesgoDepositario;
    private Integer codigoCalificacionRiesgo;
    private LocalDate fechaUltimaCalificacion;
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
	public Integer getCodigoDepositario() {
		return codigoDepositario;
	}
	public void setCodigoDepositario(Integer codigoDepositario) {
		this.codigoDepositario = codigoDepositario;
	}
	public Integer getCodigoTipoDeposito() {
		return codigoTipoDeposito;
	}
	public void setCodigoTipoDeposito(Integer codigoTipoDeposito) {
		this.codigoTipoDeposito = codigoTipoDeposito;
	}
	public String getNumeroIdentificacionDeposito() {
		return numeroIdentificacionDeposito;
	}
	public void setNumeroIdentificacionDeposito(String numeroIdentificacionDeposito) {
		this.numeroIdentificacionDeposito = numeroIdentificacionDeposito;
	}
	public String getCuentaContable() {
		return cuentaContable;
	}
	public void setCuentaContable(String cuentaContable) {
		this.cuentaContable = cuentaContable;
	}
	public Integer getCodigoMoneda() {
		return codigoMoneda;
	}
	public void setCodigoMoneda(Integer codigoMoneda) {
		this.codigoMoneda = codigoMoneda;
	}
	public BigDecimal getValorMonedaDenominacion() {
		return valorMonedaDenominacion;
	}
	public void setValorMonedaDenominacion(BigDecimal valorMonedaDenominacion) {
		this.valorMonedaDenominacion = valorMonedaDenominacion;
	}
	public BigDecimal getValorLibrosDolares() {
		return valorLibrosDolares;
	}
	public void setValorLibrosDolares(BigDecimal valorLibrosDolares) {
		this.valorLibrosDolares = valorLibrosDolares;
	}
	public Integer getCodigoCalificacionRiesgoDepositario() {
		return codigoCalificacionRiesgoDepositario;
	}
	public void setCodigoCalificacionRiesgoDepositario(Integer codigoCalificacionRiesgoDepositario) {
		this.codigoCalificacionRiesgoDepositario = codigoCalificacionRiesgoDepositario;
	}
	public Integer getCodigoCalificacionRiesgo() {
		return codigoCalificacionRiesgo;
	}
	public void setCodigoCalificacionRiesgo(Integer codigoCalificacionRiesgo) {
		this.codigoCalificacionRiesgo = codigoCalificacionRiesgo;
	}
	public LocalDate getFechaUltimaCalificacion() {
		return fechaUltimaCalificacion;
	}
	public void setFechaUltimaCalificacion(LocalDate fechaUltimaCalificacion) {
		this.fechaUltimaCalificacion = fechaUltimaCalificacion;
	}
}
