package com.sudamericano.bank.domain.model.structure.R;

import java.math.BigDecimal;
import java.time.LocalDate;

public class R04Dto {
    
    private Long id;
    private Integer codigoTipoIdentificacion;
    private String identificacionSujeto;
    private String numeroOperacion;
    private Integer diasMorosidad;
    private Integer codigoMetodologiaCalificacion;
    private Integer codigoCalificacionPropia;
    private Integer codigoCalificacionHomologada;
    private BigDecimal tasaInteres;
    private BigDecimal valorSaldoVencer1a30d;
    private BigDecimal valorSaldoVencer31a90d;
    private BigDecimal valorSaldoVencer91a180d;
    private BigDecimal valorSaldoVencer181a360d;
    private BigDecimal valorSaldoVencerMasde360d;
    private BigDecimal valorNoDevInteres1a30d;
    private BigDecimal valorNoDevInteres31a90d;
    private BigDecimal valorNoDevInteres91a180d;
    private BigDecimal valorNoDevInteres181a360d;
    private BigDecimal valorNoDevInteresMasde360d;
    private BigDecimal valorVencido1a30d;
    private BigDecimal valorVencido31a90d;
    private BigDecimal valorVencido91a180d;
    private BigDecimal valorVencido181a360d;
    private BigDecimal valorVencidoMasde360d;
    private BigDecimal valorVencido181a270d;
    private BigDecimal valorVencidoMasde270d;
    private BigDecimal valorVencido91a270d;
    private BigDecimal valorVencido271a360d;
    private BigDecimal valorVencido361a720d;
    private BigDecimal valorVencidoMasde720d;
    private BigDecimal gastosRecuperaCarteraVencida;
    private BigDecimal interesOrdinario;
    private BigDecimal interesSobreMora;
    private BigDecimal valorDemandaJudicial;
    private BigDecimal carteraCastigada;
    private BigDecimal provisionRequeridaOriginal;
    private BigDecimal provisionRequeridaReducida;
    private BigDecimal provisionConstituida;
    private Integer codigoTipoOperacion;
    private Integer codigoObjetoFideicomiso;
    private BigDecimal primaDescuento;
    private BigDecimal cuotaCredito;
    private BigDecimal valorInteresCuotaCredito;
    private BigDecimal valorSeguro;
    private BigDecimal saldoCuotaCapitalDiferida;
    private BigDecimal valorInteresCapitalDiferido;
    private LocalDate fechaTransferCuentasVencidas;
    private BigDecimal interesesAcumuladosCobrar;
    private BigDecimal interesesReservados;
    private LocalDate fechaExigibilidadCuota;
    private Integer codigoTipoSistemaAmortizacion;

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
    
    public String getNumeroOperacion() {
        return numeroOperacion;
    }

    public void setNumeroOperacion(String numeroOperacion) {
        this.numeroOperacion = numeroOperacion;
    }
    
    public Integer getDiasMorosidad() {
        return diasMorosidad;
    }

    public void setDiasMorosidad(Integer diasMorosidad) {
        this.diasMorosidad = diasMorosidad;
    }

    public Integer getCodigoMetodologiaCalificacion() {
        return codigoMetodologiaCalificacion;
    }

    public void setCodigoMetodologiaCalificacion(Integer codigoMetodologiaCalificacion) {
        this.codigoMetodologiaCalificacion = codigoMetodologiaCalificacion;
    }

    public Integer getCodigoCalificacionPropia() {
        return codigoCalificacionPropia;
    }

    public void setCodigoCalificacionPropia(Integer codigoCalificacionPropia) {
        this.codigoCalificacionPropia = codigoCalificacionPropia;
    }

    public Integer getCodigoCalificacionHomologada() {
        return codigoCalificacionHomologada;
    }

    public void setCodigoCalificacionHomologada(Integer codigoCalificacionHomologada) {
        this.codigoCalificacionHomologada = codigoCalificacionHomologada;
    }

    public BigDecimal getTasaInteres() {
        return tasaInteres;
    }

    public void setTasaInteres(BigDecimal tasaInteres) {
        this.tasaInteres = tasaInteres;
    }

    public BigDecimal getValorSaldoVencer1a30d() {
        return valorSaldoVencer1a30d;
    }

    public void setValorSaldoVencer1a30d(BigDecimal valorSaldoVencer1a30d) {
        this.valorSaldoVencer1a30d = valorSaldoVencer1a30d;
    }

    public BigDecimal getValorSaldoVencer31a90d() {
        return valorSaldoVencer31a90d;
    }

    public void setValorSaldoVencer31a90d(BigDecimal valorSaldoVencer31a90d) {
        this.valorSaldoVencer31a90d = valorSaldoVencer31a90d;
    }

    public BigDecimal getValorSaldoVencer91a180d() {
        return valorSaldoVencer91a180d;
    }

    public void setValorSaldoVencer91a180d(BigDecimal valorSaldoVencer91a180d) {
        this.valorSaldoVencer91a180d = valorSaldoVencer91a180d;
    }

    public BigDecimal getValorSaldoVencer181a360d() {
        return valorSaldoVencer181a360d;
    }

    public void setValorSaldoVencer181a360d(BigDecimal valorSaldoVencer181a360d) {
        this.valorSaldoVencer181a360d = valorSaldoVencer181a360d;
    }

    public BigDecimal getValorSaldoVencerMasde360d() {
        return valorSaldoVencerMasde360d;
    }

    public void setValorSaldoVencerMasde360d(BigDecimal valorSaldoVencerMasde360d) {
        this.valorSaldoVencerMasde360d = valorSaldoVencerMasde360d;
    }

    public BigDecimal getValorNoDevInteres1a30d() {
        return valorNoDevInteres1a30d;
    }

    public void setValorNoDevInteres1a30d(BigDecimal valorNoDevInteres1a30d) {
        this.valorNoDevInteres1a30d = valorNoDevInteres1a30d;
    }

    public BigDecimal getValorNoDevInteres31a90d() {
        return valorNoDevInteres31a90d;
    }

    public void setValorNoDevInteres31a90d(BigDecimal valorNoDevInteres31a90d) {
        this.valorNoDevInteres31a90d = valorNoDevInteres31a90d;
    }

    public BigDecimal getValorNoDevInteres91a180d() {
        return valorNoDevInteres91a180d;
    }

    public void setValorNoDevInteres91a180d(BigDecimal valorNoDevInteres91a180d) {
        this.valorNoDevInteres91a180d = valorNoDevInteres91a180d;
    }

    public BigDecimal getValorNoDevInteres181a360d() {
        return valorNoDevInteres181a360d;
    }

    public void setValorNoDevInteres181a360d(BigDecimal valorNoDevInteres181a360d) {
        this.valorNoDevInteres181a360d = valorNoDevInteres181a360d;
    }

    public BigDecimal getValorNoDevInteresMasde360d() {
        return valorNoDevInteresMasde360d;
    }

    public void setValorNoDevInteresMasde360d(BigDecimal valorNoDevInteresMasde360d) {
        this.valorNoDevInteresMasde360d = valorNoDevInteresMasde360d;
    }

    public BigDecimal getValorVencido1a30d() {
        return valorVencido1a30d;
    }

    public void setValorVencido1a30d(BigDecimal valorVencido1a30d) {
        this.valorVencido1a30d = valorVencido1a30d;
    }

    public BigDecimal getValorVencido31a90d() {
        return valorVencido31a90d;
    }

    public void setValorVencido31a90d(BigDecimal valorVencido31a90d) {
        this.valorVencido31a90d = valorVencido31a90d;
    }

    public BigDecimal getValorVencido91a180d() {
        return valorVencido91a180d;
    }

    public void setValorVencido91a180d(BigDecimal valorVencido91a180d) {
        this.valorVencido91a180d = valorVencido91a180d;
    }

    public BigDecimal getValorVencido181a360d() {
        return valorVencido181a360d;
    }

    public void setValorVencido181a360d(BigDecimal valorVencido181a360d) {
        this.valorVencido181a360d = valorVencido181a360d;
    }

    public BigDecimal getValorVencidoMasde360d() {
        return valorVencidoMasde360d;
    }

    public void setValorVencidoMasde360d(BigDecimal valorVencidoMasde360d) {
        this.valorVencidoMasde360d = valorVencidoMasde360d;
    }

    public BigDecimal getValorVencido181a270d() {
        return valorVencido181a270d;
    }

    public void setValorVencido181a270d(BigDecimal valorVencido181a270d) {
        this.valorVencido181a270d = valorVencido181a270d;
    }

    public BigDecimal getValorVencidoMasde270d() {
        return valorVencidoMasde270d;
    }

    public void setValorVencidoMasde270d(BigDecimal valorVencidoMasde270d) {
        this.valorVencidoMasde270d = valorVencidoMasde270d;
    }

    public BigDecimal getValorVencido91a270d() {
        return valorVencido91a270d;
    }

    public void setValorVencido91a270d(BigDecimal valorVencido91a270d) {
        this.valorVencido91a270d = valorVencido91a270d;
    }

    public BigDecimal getValorVencido271a360d() {
        return valorVencido271a360d;
    }

    public void setValorVencido271a360d(BigDecimal valorVencido271a360d) {
        this.valorVencido271a360d = valorVencido271a360d;
    }

    public BigDecimal getValorVencido361a720d() {
        return valorVencido361a720d;
    }

    public void setValorVencido361a720d(BigDecimal valorVencido361a720d) {
        this.valorVencido361a720d = valorVencido361a720d;
    }

    public BigDecimal getValorVencidoMasde720d() {
        return valorVencidoMasde720d;
    }

    public void setValorVencidoMasde720d(BigDecimal valorVencidoMasde720d) {
        this.valorVencidoMasde720d = valorVencidoMasde720d;
    }

    // Getters y Setters para campos adicionales (30-37)
    public BigDecimal getGastosRecuperaCarteraVencida() {
        return gastosRecuperaCarteraVencida;
    }

    public void setGastosRecuperaCarteraVencida(BigDecimal gastosRecuperaCarteraVencida) {
        this.gastosRecuperaCarteraVencida = gastosRecuperaCarteraVencida;
    }

    public BigDecimal getInteresOrdinario() {
        return interesOrdinario;
    }

    public void setInteresOrdinario(BigDecimal interesOrdinario) {
        this.interesOrdinario = interesOrdinario;
    }

    public BigDecimal getInteresSobreMora() {
        return interesSobreMora;
    }

    public void setInteresSobreMora(BigDecimal interesSobreMora) {
        this.interesSobreMora = interesSobreMora;
    }

    public BigDecimal getValorDemandaJudicial() {
        return valorDemandaJudicial;
    }

    public void setValorDemandaJudicial(BigDecimal valorDemandaJudicial) {
        this.valorDemandaJudicial = valorDemandaJudicial;
    }

    public BigDecimal getCarteraCastigada() {
        return carteraCastigada;
    }

    public void setCarteraCastigada(BigDecimal carteraCastigada) {
        this.carteraCastigada = carteraCastigada;
    }

    public BigDecimal getProvisionRequeridaOriginal() {
        return provisionRequeridaOriginal;
    }

    public void setProvisionRequeridaOriginal(BigDecimal provisionRequeridaOriginal) {
        this.provisionRequeridaOriginal = provisionRequeridaOriginal;
    }

    public BigDecimal getProvisionRequeridaReducida() {
        return provisionRequeridaReducida;
    }

    public void setProvisionRequeridaReducida(BigDecimal provisionRequeridaReducida) {
        this.provisionRequeridaReducida = provisionRequeridaReducida;
    }

    public BigDecimal getProvisionConstituida() {
        return provisionConstituida;
    }

    public void setProvisionConstituida(BigDecimal provisionConstituida) {
        this.provisionConstituida = provisionConstituida;
    }

    public Integer getCodigoTipoOperacion() {
        return codigoTipoOperacion;
    }

    public void setCodigoTipoOperacion(Integer codigoTipoOperacion) {
        this.codigoTipoOperacion = codigoTipoOperacion;
    }

    public Integer getCodigoObjetoFideicomiso() {
        return codigoObjetoFideicomiso;
    }

    public void setCodigoObjetoFideicomiso(Integer codigoObjetoFideicomiso) {
        this.codigoObjetoFideicomiso = codigoObjetoFideicomiso;
    }

    public BigDecimal getPrimaDescuento() {
        return primaDescuento;
    }

    public void setPrimaDescuento(BigDecimal primaDescuento) {
        this.primaDescuento = primaDescuento;
    }

    public BigDecimal getCuotaCredito() {
        return cuotaCredito;
    }

    public void setCuotaCredito(BigDecimal cuotaCredito) {
        this.cuotaCredito = cuotaCredito;
    }

    public BigDecimal getValorInteresCuotaCredito() {
        return valorInteresCuotaCredito;
    }

    public void setValorInteresCuotaCredito(BigDecimal valorInteresCuotaCredito) {
        this.valorInteresCuotaCredito = valorInteresCuotaCredito;
    }

    public BigDecimal getValorSeguro() {
        return valorSeguro;
    }

    public void setValorSeguro(BigDecimal valorSeguro) {
        this.valorSeguro = valorSeguro;
    }

    public BigDecimal getSaldoCuotaCapitalDiferida() {
        return saldoCuotaCapitalDiferida;
    }

    public void setSaldoCuotaCapitalDiferida(BigDecimal saldoCuotaCapitalDiferida) {
        this.saldoCuotaCapitalDiferida = saldoCuotaCapitalDiferida;
    }

    public BigDecimal getValorInteresCapitalDiferido() {
        return valorInteresCapitalDiferido;
    }

    public void setValorInteresCapitalDiferido(BigDecimal valorInteresCapitalDiferido) {
        this.valorInteresCapitalDiferido = valorInteresCapitalDiferido;
    }

    public LocalDate getFechaTransferCuentasVencidas() {
        return fechaTransferCuentasVencidas;
    }

    public void setFechaTransferCuentasVencidas(LocalDate fechaTransferCuentasVencidas) {
        this.fechaTransferCuentasVencidas = fechaTransferCuentasVencidas;
    }

    public BigDecimal getInteresesAcumuladosCobrar() {
        return interesesAcumuladosCobrar;
    }

    public void setInteresesAcumuladosCobrar(BigDecimal interesesAcumuladosCobrar) {
        this.interesesAcumuladosCobrar = interesesAcumuladosCobrar;
    }

    public BigDecimal getInteresesReservados() {
        return interesesReservados;
    }

    public void setInteresesReservados(BigDecimal interesesReservados) {
        this.interesesReservados = interesesReservados;
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
}
