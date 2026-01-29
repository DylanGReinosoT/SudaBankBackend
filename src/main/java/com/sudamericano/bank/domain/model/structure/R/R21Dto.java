package com.sudamericano.bank.domain.model.structure.R;

import lombok.*;

import java.math.BigDecimal;
import java.time.LocalDate;

public class R21Dto {

	private Long id;
	private Integer codigoTipoIdentificacion;
    private String identificacionSujeto;
    private String numeroTarjeta;
    private BigDecimal cupoTarjeta;
    private BigDecimal capitalConsumo;
    private BigDecimal tea;
    private Integer codigoEstadoOperacion;
    private Integer codigoFormaPago;
    private BigDecimal capitalPorVencer1a30Dias;
    private BigDecimal capitalPorVencer31a90Dias;
    private BigDecimal capitalPorVencer91a180Dias;
    private BigDecimal capitalPorVencer181a360Dias;
    private BigDecimal capitalPorVencerMas360Dias;
    private BigDecimal costosOperativosPorVencer;
    private BigDecimal valorNoDevenganIntereses1a30Dias;
    private BigDecimal valorNoDevenganIntereses31a90Dias;
    private BigDecimal valorNoDevenganIntereses91a180Dias;
    private BigDecimal valorNoDevenganIntereses181a360Dias;
    private BigDecimal valorNoDevenganInteresesMas360Dias;
    private BigDecimal capitalVencido1a30Dias;
    private BigDecimal capitalVencido31a90Dias;
    private BigDecimal capitalVencido91a180Dias;
    private BigDecimal capitalVencido181a360Dias;
    private BigDecimal capitalVencidoMas360Dias;
    private BigDecimal capitalVencido181a270Dias;
    private BigDecimal capitalVencidoMas270Dias;
    private BigDecimal interesVencido1a30Dias;
    private BigDecimal interesVencido31a60Dias;
    private BigDecimal interesVencido61a90Dias;
    private BigDecimal interesVencido91a180Dias;
    private BigDecimal interesVencido181a270Dias;
    private BigDecimal interesVencidoMas270Dias;
    private BigDecimal totalCostosOperativosVencidos;
    private BigDecimal interesSobreMora;
    private BigDecimal valorEnDemandaJudicial;
    private BigDecimal carteraCastigada;
    private Integer codigoObjetoFideicomiso;
    private Integer codigoSituacionOperacion;
    private Integer codigoTipoOperacion;
    private BigDecimal contribucionAtencionCancer;
    private LocalDate fechaTransferenciaCuentasVencidas;
    private BigDecimal interesesAcumuladosPorCobrar;
    private BigDecimal interesesReversados;
    private LocalDate fechaExigibilidadCuota;
    private Integer codigoTipoSistemaAmortizacion;
    private LocalDate fechaActualizacion;
    private String usuarioActualizacion;

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

    public BigDecimal getCupoTarjeta() {
        return cupoTarjeta;
    }

    public void setCupoTarjeta(BigDecimal cupoTarjeta) {
        this.cupoTarjeta = cupoTarjeta;
    }

    public BigDecimal getCapitalConsumo() {
        return capitalConsumo;
    }

    public void setCapitalConsumo(BigDecimal capitalConsumo) {
        this.capitalConsumo = capitalConsumo;
    }

    public BigDecimal getTea() {
        return tea;
    }

    public void setTea(BigDecimal tea) {
        this.tea = tea;
    }

    public Integer getCodigoEstadoOperacion() {
        return codigoEstadoOperacion;
    }

    public void setCodigoEstadoOperacion(Integer codigoEstadoOperacion) {
        this.codigoEstadoOperacion = codigoEstadoOperacion;
    }

    public Integer getCodigoFormaPago() {
        return codigoFormaPago;
    }

    public void setCodigoFormaPago(Integer codigoFormaPago) {
        this.codigoFormaPago = codigoFormaPago;
    }

    public BigDecimal getCapitalPorVencer1a30Dias() {
        return capitalPorVencer1a30Dias;
    }

    public void setCapitalPorVencer1a30Dias(BigDecimal capitalPorVencer1a30Dias) {
        this.capitalPorVencer1a30Dias = capitalPorVencer1a30Dias;
    }

    public BigDecimal getCapitalPorVencer31a90Dias() {
        return capitalPorVencer31a90Dias;
    }

    public void setCapitalPorVencer31a90Dias(BigDecimal capitalPorVencer31a90Dias) {
        this.capitalPorVencer31a90Dias = capitalPorVencer31a90Dias;
    }

    public BigDecimal getCapitalPorVencer91a180Dias() {
        return capitalPorVencer91a180Dias;
    }

    public void setCapitalPorVencer91a180Dias(BigDecimal capitalPorVencer91a180Dias) {
        this.capitalPorVencer91a180Dias = capitalPorVencer91a180Dias;
    }

    public BigDecimal getCapitalPorVencer181a360Dias() {
        return capitalPorVencer181a360Dias;
    }

    public void setCapitalPorVencer181a360Dias(BigDecimal capitalPorVencer181a360Dias) {
        this.capitalPorVencer181a360Dias = capitalPorVencer181a360Dias;
    }

    public BigDecimal getCapitalPorVencerMas360Dias() {
        return capitalPorVencerMas360Dias;
    }

    public void setCapitalPorVencerMas360Dias(BigDecimal capitalPorVencerMas360Dias) {
        this.capitalPorVencerMas360Dias = capitalPorVencerMas360Dias;
    }

    public BigDecimal getCostosOperativosPorVencer() {
        return costosOperativosPorVencer;
    }

    public void setCostosOperativosPorVencer(BigDecimal costosOperativosPorVencer) {
        this.costosOperativosPorVencer = costosOperativosPorVencer;
    }

    public BigDecimal getValorNoDevenganIntereses1a30Dias() {
        return valorNoDevenganIntereses1a30Dias;
    }

    public void setValorNoDevenganIntereses1a30Dias(BigDecimal valorNoDevenganIntereses1a30Dias) {
        this.valorNoDevenganIntereses1a30Dias = valorNoDevenganIntereses1a30Dias;
    }

    public BigDecimal getValorNoDevenganIntereses31a90Dias() {
        return valorNoDevenganIntereses31a90Dias;
    }

    public void setValorNoDevenganIntereses31a90Dias(BigDecimal valorNoDevenganIntereses31a90Dias) {
        this.valorNoDevenganIntereses31a90Dias = valorNoDevenganIntereses31a90Dias;
    }

    public BigDecimal getValorNoDevenganIntereses91a180Dias() {
        return valorNoDevenganIntereses91a180Dias;
    }

    public void setValorNoDevenganIntereses91a180Dias(BigDecimal valorNoDevenganIntereses91a180Dias) {
        this.valorNoDevenganIntereses91a180Dias = valorNoDevenganIntereses91a180Dias;
    }

    public BigDecimal getValorNoDevenganIntereses181a360Dias() {
        return valorNoDevenganIntereses181a360Dias;
    }

    public void setValorNoDevenganIntereses181a360Dias(BigDecimal valorNoDevenganIntereses181a360Dias) {
        this.valorNoDevenganIntereses181a360Dias = valorNoDevenganIntereses181a360Dias;
    }

    public BigDecimal getValorNoDevenganInteresesMas360Dias() {
        return valorNoDevenganInteresesMas360Dias;
    }

    public void setValorNoDevenganInteresesMas360Dias(BigDecimal valorNoDevenganInteresesMas360Dias) {
        this.valorNoDevenganInteresesMas360Dias = valorNoDevenganInteresesMas360Dias;
    }

    public BigDecimal getCapitalVencido1a30Dias() {
        return capitalVencido1a30Dias;
    }

    public void setCapitalVencido1a30Dias(BigDecimal capitalVencido1a30Dias) {
        this.capitalVencido1a30Dias = capitalVencido1a30Dias;
    }

    public BigDecimal getCapitalVencido31a90Dias() {
        return capitalVencido31a90Dias;
    }

    public void setCapitalVencido31a90Dias(BigDecimal capitalVencido31a90Dias) {
        this.capitalVencido31a90Dias = capitalVencido31a90Dias;
    }

    public BigDecimal getCapitalVencido91a180Dias() {
        return capitalVencido91a180Dias;
    }

    public void setCapitalVencido91a180Dias(BigDecimal capitalVencido91a180Dias) {
        this.capitalVencido91a180Dias = capitalVencido91a180Dias;
    }

    public BigDecimal getCapitalVencido181a360Dias() {
        return capitalVencido181a360Dias;
    }

    public void setCapitalVencido181a360Dias(BigDecimal capitalVencido181a360Dias) {
        this.capitalVencido181a360Dias = capitalVencido181a360Dias;
    }

    public BigDecimal getCapitalVencidoMas360Dias() {
        return capitalVencidoMas360Dias;
    }

    public void setCapitalVencidoMas360Dias(BigDecimal capitalVencidoMas360Dias) {
        this.capitalVencidoMas360Dias = capitalVencidoMas360Dias;
    }

    public BigDecimal getCapitalVencido181a270Dias() {
        return capitalVencido181a270Dias;
    }

    public void setCapitalVencido181a270Dias(BigDecimal capitalVencido181a270Dias) {
        this.capitalVencido181a270Dias = capitalVencido181a270Dias;
    }

    public BigDecimal getCapitalVencidoMas270Dias() {
        return capitalVencidoMas270Dias;
    }

    public void setCapitalVencidoMas270Dias(BigDecimal capitalVencidoMas270Dias) {
        this.capitalVencidoMas270Dias = capitalVencidoMas270Dias;
    }

    public BigDecimal getInteresVencido1a30Dias() {
        return interesVencido1a30Dias;
    }

    public void setInteresVencido1a30Dias(BigDecimal interesVencido1a30Dias) {
        this.interesVencido1a30Dias = interesVencido1a30Dias;
    }

    public BigDecimal getInteresVencido31a60Dias() {
        return interesVencido31a60Dias;
    }

    public void setInteresVencido31a60Dias(BigDecimal interesVencido31a60Dias) {
        this.interesVencido31a60Dias = interesVencido31a60Dias;
    }

    public BigDecimal getInteresVencido61a90Dias() {
        return interesVencido61a90Dias;
    }

    public void setInteresVencido61a90Dias(BigDecimal interesVencido61a90Dias) {
        this.interesVencido61a90Dias = interesVencido61a90Dias;
    }

    public BigDecimal getInteresVencido91a180Dias() {
        return interesVencido91a180Dias;
    }

    public void setInteresVencido91a180Dias(BigDecimal interesVencido91a180Dias) {
        this.interesVencido91a180Dias = interesVencido91a180Dias;
    }

    public BigDecimal getInteresVencido181a270Dias() {
        return interesVencido181a270Dias;
    }

    public void setInteresVencido181a270Dias(BigDecimal interesVencido181a270Dias) {
        this.interesVencido181a270Dias = interesVencido181a270Dias;
    }

    public BigDecimal getInteresVencidoMas270Dias() {
        return interesVencidoMas270Dias;
    }

    public void setInteresVencidoMas270Dias(BigDecimal interesVencidoMas270Dias) {
        this.interesVencidoMas270Dias = interesVencidoMas270Dias;
    }

    public BigDecimal getTotalCostosOperativosVencidos() {
        return totalCostosOperativosVencidos;
    }

    public void setTotalCostosOperativosVencidos(BigDecimal totalCostosOperativosVencidos) {
        this.totalCostosOperativosVencidos = totalCostosOperativosVencidos;
    }

    public BigDecimal getInteresSobreMora() {
        return interesSobreMora;
    }

    public void setInteresSobreMora(BigDecimal interesSobreMora) {
        this.interesSobreMora = interesSobreMora;
    }

    public BigDecimal getValorEnDemandaJudicial() {
        return valorEnDemandaJudicial;
    }

    public void setValorEnDemandaJudicial(BigDecimal valorEnDemandaJudicial) {
        this.valorEnDemandaJudicial = valorEnDemandaJudicial;
    }

    public BigDecimal getCarteraCastigada() {
        return carteraCastigada;
    }

    public void setCarteraCastigada(BigDecimal carteraCastigada) {
        this.carteraCastigada = carteraCastigada;
    }

    public Integer getCodigoObjetoFideicomiso() {
        return codigoObjetoFideicomiso;
    }

    public void setCodigoObjetoFideicomiso(Integer codigoObjetoFideicomiso) {
        this.codigoObjetoFideicomiso = codigoObjetoFideicomiso;
    }

    public Integer getCodigoSituacionOperacion() {
        return codigoSituacionOperacion;
    }

    public void setCodigoSituacionOperacion(Integer codigoSituacionOperacion) {
        this.codigoSituacionOperacion = codigoSituacionOperacion;
    }

    public Integer getCodigoTipoOperacion() {
        return codigoTipoOperacion;
    }

    public void setCodigoTipoOperacion(Integer codigoTipoOperacion) {
        this.codigoTipoOperacion = codigoTipoOperacion;
    }

    public BigDecimal getContribucionAtencionCancer() {
        return contribucionAtencionCancer;
    }

    public void setContribucionAtencionCancer(BigDecimal contribucionAtencionCancer) {
        this.contribucionAtencionCancer = contribucionAtencionCancer;
    }

    public LocalDate getFechaTransferenciaCuentasVencidas() {
        return fechaTransferenciaCuentasVencidas;
    }

    public void setFechaTransferenciaCuentasVencidas(LocalDate fechaTransferenciaCuentasVencidas) {
        this.fechaTransferenciaCuentasVencidas = fechaTransferenciaCuentasVencidas;
    }

    public BigDecimal getInteresesAcumuladosPorCobrar() {
        return interesesAcumuladosPorCobrar;
    }

    public void setInteresesAcumuladosPorCobrar(BigDecimal interesesAcumuladosPorCobrar) {
        this.interesesAcumuladosPorCobrar = interesesAcumuladosPorCobrar;
    }

    public BigDecimal getInteresesReversados() {
        return interesesReversados;
    }

    public void setInteresesReversados(BigDecimal interesesReversados) {
        this.interesesReversados = interesesReversados;
    }

    public LocalDate getFechaExigibilidadCuota() {
        return fechaExigibilidadCuota;
    }

    public void setFechaExigibilidadCuota(LocalDate fechaExigibilidadCuota) {
        this.fechaExigibilidadCuota = fechaExigibilidadCuota;
    }

    public Integer getCodigoTipoSistemaAmortizacion() {
        return codigoTipoSistemaAmortizacion;
    }

    public void setCodigoTipoSistemaAmortizacion(Integer codigoTipoSistemaAmortizacion) {
        this.codigoTipoSistemaAmortizacion = codigoTipoSistemaAmortizacion;
    }

    public LocalDate getFechaActualizacion() {
        return fechaActualizacion;
    }

    public void setFechaActualizacion(LocalDate fechaActualizacion) {
        this.fechaActualizacion = fechaActualizacion;
    }

    public String getUsuarioActualizacion() {
        return usuarioActualizacion;
    }

    public void setUsuarioActualizacion(String usuarioActualizacion) {
        this.usuarioActualizacion = usuarioActualizacion;
    }
}