package com.sudamericano.bank.infrastructure.persistence.entity.structure.R;

import jakarta.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Table(name = "NESR04")
public class R04Entity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // Campos básicos (1-4)
    @Column(name = "CODIGO_TIPO_IDENTIFICACION")
    private Integer codigoTipoIdentificacion;

    @Column(name = "IDENTIFICACION_SUJETO")
    private String identificacionSujeto;

    @Column(name = "NUMERO_OPERACION")
    private String numeroOperacion;

    @Column(name = "DIAS_MOROSIDAD")
    private Integer diasMorosidad;
    
    // Campos de calificación (5-7)
    @Column(name = "CODIGO_METODOLOGIA_CALIFICACION")
    private Integer codigoMetodologiaCalificacion;

    @Column(name = "CODIGO_CALIFICACION_PROPIA")
    private Integer codigoCalificacionPropia;

    @Column(name = "CODIGO_CALIFICACION_HOMOLOGADA")
    private Integer codigoCalificacionHomologada;
    
    // Campo de interés (8)
    @Column(name = "TASA_INTERES", precision = 10, scale = 4)
    private BigDecimal tasaInteres;
    
    // Valores por vencer (9-13)
    @Column(name = "VALOR_SALDO_VENCER_1A30D", precision = 15, scale = 2)
    private BigDecimal valorSaldoVencer1a30d;

    @Column(name = "VALOR_SALDO_VENCER_31A90D", precision = 15, scale = 2)
    private BigDecimal valorSaldoVencer31a90d;

    @Column(name = "VALOR_SALDO_VENCER_91A180D", precision = 15, scale = 2)
    private BigDecimal valorSaldoVencer91a180d;

    @Column(name = "VALOR_SALDO_VENCER_181A360D", precision = 15, scale = 2)
    private BigDecimal valorSaldoVencer181a360d;

    @Column(name = "VALOR_SALDO_VENCER_MASDE_360D", precision = 15, scale = 2)
    private BigDecimal valorSaldoVencerMasde360d;
    
    // Valores que no devengan intereses (14-18)
    @Column(name = "VALOR_NO_DEV_INTERES_1A30D", precision = 15, scale = 2)
    private BigDecimal valorNoDevInteres1a30d;

    @Column(name = "VALOR_NO_DEV_INTERES_31A90D", precision = 15, scale = 2)
    private BigDecimal valorNoDevInteres31a90d;

    @Column(name = "VALOR_NO_DEV_INTERES_91A180D", precision = 15, scale = 2)
    private BigDecimal valorNoDevInteres91a180d;

    @Column(name = "VALOR_NO_DEV_INTERES_181A360D", precision = 15, scale = 2)
    private BigDecimal valorNoDevInteres181a360d;

    @Column(name = "VALOR_NO_DEV_INTERES_MASDE_360D", precision = 15, scale = 2)
    private BigDecimal valorNoDevInteresMasde360d;
    
    // Valores vencidos (19-29)
    @Column(name = "VALOR_VENCIDO_1A30D", precision = 15, scale = 2)
    private BigDecimal valorVencido1a30d;

    @Column(name = "VALOR_VENCIDO_31A90D", precision = 15, scale = 2)
    private BigDecimal valorVencido31a90d;

    @Column(name = "VALOR_VENCIDO_91A180D", precision = 15, scale = 2)
    private BigDecimal valorVencido91a180d;

    @Column(name = "VALOR_VENCIDO_181A360D", precision = 15, scale = 2)
    private BigDecimal valorVencido181a360d;

    @Column(name = "VALOR_VENCIDO_MASDE_360D", precision = 15, scale = 2)
    private BigDecimal valorVencidoMasde360d;

    @Column(name = "VALOR_VENCIDO_181A270D", precision = 15, scale = 2)
    private BigDecimal valorVencido181a270d;

    @Column(name = "VALOR_VENCIDO_MASDE_270D", precision = 15, scale = 2)
    private BigDecimal valorVencidoMasde270d;

    @Column(name = "VALOR_VENCIDO_91A270D", precision = 15, scale = 2)
    private BigDecimal valorVencido91a270d;

    @Column(name = "VALOR_VENCIDO_271A360D", precision = 15, scale = 2)
    private BigDecimal valorVencido271a360d;

    @Column(name = "VALOR_VENCIDO_361A720D", precision = 15, scale = 2)
    private BigDecimal valorVencido361a720d;

    @Column(name = "VALOR_VENCIDO_MASDE_720D", precision = 15, scale = 2)
    private BigDecimal valorVencidoMasde720d;
    
    // Campos adicionales (30-37)
    @Column(name = "GASTOS_RECUPERA_CARTERA_VENCIDA", precision = 15, scale = 2)
    private BigDecimal gastosRecuperaCarteraVencida;

    @Column(name = "INTERES_ORDINARIO", precision = 15, scale = 2)
    private BigDecimal interesOrdinario;

    @Column(name = "INTERES_SOBRE_MORA", precision = 15, scale = 2)
    private BigDecimal interesSobreMora;

    @Column(name = "VALOR_DEMANDA_JUDICIAL", precision = 15, scale = 2)
    private BigDecimal valorDemandaJudicial;

    @Column(name = "CARTERA_CASTIGADA", precision = 15, scale = 2)
    private BigDecimal carteraCastigada;

    @Column(name = "PROVISION_REQUERIDA_ORIGINAL", precision = 15, scale = 2)
    private BigDecimal provisionRequeridaOriginal;

    @Column(name = "PROVISION_REQUERIDA_REDUCIDA", precision = 15, scale = 2)
    private BigDecimal provisionRequeridaReducida;

    @Column(name = "PROVISION_CONSTITUIDA", precision = 15, scale = 2)
    private BigDecimal provisionConstituida;
    
    // Campos de operación (38-39)
    @Column(name = "CODIGO_TIPO_OPERACION")
    private Integer codigoTipoOperacion;

    @Column(name = "CODIGO_OBJETO_FIDEICOMISO")
    private Integer codigoObjetoFideicomiso;
    
    // Campos financieros (40-45)
    @Column(name = "PRIMA_DESCUENTO", precision = 15, scale = 2)
    private BigDecimal primaDescuento;

    @Column(name = "CUOTA_CREDITO", precision = 15, scale = 2)
    private BigDecimal cuotaCredito;

    @Column(name = "VALOR_INTERES_CUOTA_CREDITO", precision = 15, scale = 2)
    private BigDecimal valorInteresCuotaCredito;

    @Column(name = "VALOR_SEGURO", precision = 15, scale = 2)
    private BigDecimal valorSeguro;

    @Column(name = "SALDO_CUOTA_CAPITAL_DIFERIDA", precision = 15, scale = 2)
    private BigDecimal saldoCuotaCapitalDiferida;

    @Column(name = "VALOR_INTERES_CAPITAL_DIFERIDO", precision = 15, scale = 2)
    private BigDecimal valorInteresCapitalDiferido;
    
    // Campos de fecha e intereses (46-48)
    @Column(name = "FECHA_TRANSFER_CUENTAS_VENCIDAS")
    private LocalDate fechaTransferCuentasVencidas;

    @Column(name = "INTERESES_ACUMULADOS_COBRAR", precision = 15, scale = 2)
    private BigDecimal interesesAcumuladosCobrar;

    @Column(name = "INTERESES_RESERVADOS", precision = 15, scale = 2)
    private BigDecimal interesesReservados;
    
    // Campos adicionales (49-50)
    @Column(name = "FECHA_EXIGIBILIDAD_CUOTA")
    private LocalDate fechaExigibilidadCuota;

    @Column(name = "CODIGO_TIPO_SISTEMA_AMORTIZACION")
    private Integer codigoTipoSistemaAmortizacion;

    // Getters y Setters para campos básicos (1-4)
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

    // Getters y Setters para campos de calificación (5-7)
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

    // Getters y Setters para campo de interés (8)
    public BigDecimal getTasaInteres() {
        return tasaInteres;
    }

    public void setTasaInteres(BigDecimal tasaInteres) {
        this.tasaInteres = tasaInteres;
    }

    // Getters y Setters para valores por vencer (9-13)
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

    // Getters y Setters para valores que no devengan intereses (14-18)
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

    // Getters y Setters para valores vencidos (19-29)
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

    // Getters y Setters para campos de operación (38-39)
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

    // Getters y Setters para campos financieros (40-45)
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

    // Getters y Setters para campos de fecha e intereses (46-48)
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

    // Getters y Setters para campos adicionales (49-50)
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