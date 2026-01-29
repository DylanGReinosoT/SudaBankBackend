package com.sudamericano.bank.infrastructure.persistence.entity.structure.L;

import jakarta.persistence.*;

import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Table(name = "NESL05")
public class L05Entity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "CODIGO_TIPO_IDENTIFICACION")
    private Integer codigoTipoIdentificacion;

    @Column(name = "CODIGO_DEPOSITARIO")
    private Integer codigoDepositario;

    @Column(name = "CODIGO_TIPO_DEPOSITO")
    private Integer codigoTipoDeposito;

    @Column(name = "NUMERO_IDENTIFICACION_DEPOSITO")
    private String numeroIdentificacionDeposito;

    @Column(name = "CUENTA_CONTABLE")
    private String cuentaContable;

    @Column(name = "CODIGO_MONEDA")
    private Integer codigoMoneda;

    @Column(name = "VALOR_MONEDA_DENOMINACION")
    private BigDecimal valorMonedaDenominacion;

    @Column(name = "VALOR_LIBROS_DOLARES")
    private BigDecimal valorLibrosDolares;

    @Column(name = "CODIGO_CALIFICACION_RIESGO_DEPOSITARIO")
    private Integer codigoCalificacionRiesgoDepositario;

    @Column(name = "CODIGO_CALIFICACION_RIESGO")
    private Integer codigoCalificacionRiesgo;

    @Column(name = "FECHA_ULTIMA_CALIFICACION")
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
