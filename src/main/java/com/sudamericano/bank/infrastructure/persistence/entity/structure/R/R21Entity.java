package com.sudamericano.bank.infrastructure.persistence.entity.structure.R;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Table(name = "NESR21")
public class R21Entity {

    @Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "CODIGO_TIPO_IDENTIFICACION")
	private Integer codigoTipoIdentificacion;

    @Column(name = "IDENTIFICACION_SUJETO", length = 13)
    private String identificacionSujeto;

    @Column(name = "NUMERO_TARJETA", length = 22)
    private String numeroTarjeta;

	@Column(name = "CUPO_TARJETA")
    private BigDecimal cupoTarjeta;

	@Column(name = "CAPITAL_CONSUMO")
    private BigDecimal capitalConsumo;

	@Column(name = "TEA")
    private BigDecimal tea;

	@Column(name = "CODIGO_ESTADO_OPERACION")
	private Integer codigoEstadoOperacion;

	@Column(name = "CODIGO_FORMA_PAGO")
	private Integer codigoFormaPago;

	@Column(name = "CAPITAL_POR_VENCER_1_30_DIAS")
    private BigDecimal capitalPorVencer1a30Dias;

	@Column(name = "CAPITAL_POR_VENCER_31_90_DIAS")
    private BigDecimal capitalPorVencer31a90Dias;

	@Column(name = "CAPITAL_POR_VENCER_91_180_DIAS")
    private BigDecimal capitalPorVencer91a180Dias;

	@Column(name = "CAPITAL_POR_VENCER_181_360_DIAS")
    private BigDecimal capitalPorVencer181a360Dias;

	@Column(name = "CAPITAL_POR_VENCER_MAS_360_DIAS")
    private BigDecimal capitalPorVencerMas360Dias;

	@Column(name = "COSTOS_OPERATIVOS_POR_VENCER")
    private BigDecimal costosOperativosPorVencer;

	@Column(name = "VALOR_NO_DEVENGAN_INTERESES_1_30_DIAS")
    private BigDecimal valorNoDevenganIntereses1a30Dias;

	@Column(name = "VALOR_NO_DEVENGAN_INTERESES_31_90_DIAS")
    private BigDecimal valorNoDevenganIntereses31a90Dias;

	@Column(name = "VALOR_NO_DEVENGAN_INTERESES_91_180_DIAS")
    private BigDecimal valorNoDevenganIntereses91a180Dias;

	@Column(name = "VALOR_NO_DEVENGAN_INTERESES_181_360_DIAS")
    private BigDecimal valorNoDevenganIntereses181a360Dias;

	@Column(name = "VALOR_NO_DEVENGAN_INTERESES_MAS_360_DIAS")
    private BigDecimal valorNoDevenganInteresesMas360Dias;

	@Column(name = "CAPITAL_VENCIDO_1_30_DIAS")
    private BigDecimal capitalVencido1a30Dias;

	@Column(name = "CAPITAL_VENCIDO_31_90_DIAS")
    private BigDecimal capitalVencido31a90Dias;

	@Column(name = "CAPITAL_VENCIDO_91_180_DIAS")
    private BigDecimal capitalVencido91a180Dias;

	@Column(name = "CAPITAL_VENCIDO_181_360_DIAS")
    private BigDecimal capitalVencido181a360Dias;

	@Column(name = "CAPITAL_VENCIDO_MAS_360_DIAS")
    private BigDecimal capitalVencidoMas360Dias;

	@Column(name = "CAPITAL_VENCIDO_181_270_DIAS")
    private BigDecimal capitalVencido181a270Dias;

	@Column(name = "CAPITAL_VENCIDO_MAS_270_DIAS")
    private BigDecimal capitalVencidoMas270Dias;

	@Column(name = "INTERES_VENCIDO_1_30_DIAS")
    private BigDecimal interesVencido1a30Dias;

	@Column(name = "INTERES_VENCIDO_31_60_DIAS")
    private BigDecimal interesVencido31a60Dias;

	@Column(name = "INTERES_VENCIDO_61_90_DIAS")
    private BigDecimal interesVencido61a90Dias;

	@Column(name = "INTERES_VENCIDO_91_180_DIAS")
    private BigDecimal interesVencido91a180Dias;

	@Column(name = "INTERES_VENCIDO_181_270_DIAS")
    private BigDecimal interesVencido181a270Dias;

	@Column(name = "INTERES_VENCIDO_MAS_270_DIAS")
    private BigDecimal interesVencidoMas270Dias;

	@Column(name = "TOTAL_COSTOS_OPERATIVOS_VENCIDOS")
    private BigDecimal totalCostosOperativosVencidos;

	@Column(name = "INTERES_SOBRE_MORA")
    private BigDecimal interesSobreMora;

	@Column(name = "VALOR_EN_DEMANDA_JUDICIAL")
    private BigDecimal valorEnDemandaJudicial;

	@Column(name = "CARTERA_CASTIGADA")
    private BigDecimal carteraCastigada;

	@Column(name = "CODIGO_OBJETO_FIDEICOMISO")
	private Integer codigoObjetoFideicomiso;

	@Column(name = "CODIGO_SITUACION_OPERACION")
	private Integer codigoSituacionOperacion;

	@Column(name = "CODIGO_TIPO_OPERACION")
	private Integer codigoTipoOperacion;

	@Column(name = "CONTRIBUCION_ATENCION_CANCER")
    private BigDecimal contribucionAtencionCancer;

    @Column(name = "FECHA_TRANSFERENCIA_CUENTAS_VENCIDAS")
    private LocalDate fechaTransferenciaCuentasVencidas;

	@Column(name = "INTERESES_ACUMULADOS_POR_COBRAR")
    private BigDecimal interesesAcumuladosPorCobrar;

	@Column(name = "INTERESES_REVERSADOS")
    private BigDecimal interesesReversados;

    @Column(name = "FECHA_EXIGIBILIDAD_CUOTA")
    private LocalDate fechaExigibilidadCuota;

	@Column(name = "CODIGO_TIPO_SISTEMA_AMORTIZACION")
	private Integer codigoTipoSistemaAmortizacion;

    @Column(name = "FECHA_ACTUALIZACION")
    private LocalDate fechaActualizacion;

    @Column(name = "USUARIO_ACTUALIZACION", length = 50)
    private String usuarioActualizacion;

    public void setId(Long id) {
        this.id = id;
    }

    public void setCodigoTipoIdentificacion(Integer codigoTipoIdentificacion) {
        this.codigoTipoIdentificacion = codigoTipoIdentificacion;
    }

    public void setIdentificacionSujeto(String identificacionSujeto) {
        this.identificacionSujeto = identificacionSujeto;
    }

    public void setNumeroTarjeta(String numeroTarjeta) {
        this.numeroTarjeta = numeroTarjeta;
    }

    public void setCupoTarjeta(BigDecimal cupoTarjeta) {
        this.cupoTarjeta = cupoTarjeta;
    }

    public void setCapitalConsumo(BigDecimal capitalConsumo) {
        this.capitalConsumo = capitalConsumo;
    }

    public void setTea(BigDecimal tea) {
        this.tea = tea;
    }

    public void setCodigoEstadoOperacion(Integer codigoEstadoOperacion) {
        this.codigoEstadoOperacion = codigoEstadoOperacion;
    }

    public void setCodigoFormaPago(Integer codigoFormaPago) {
        this.codigoFormaPago = codigoFormaPago;
    }

    public void setCapitalPorVencer1a30Dias(BigDecimal capitalPorVencer1a30Dias) {
        this.capitalPorVencer1a30Dias = capitalPorVencer1a30Dias;
    }

    public void setCapitalPorVencer31a90Dias(BigDecimal capitalPorVencer31a90Dias) {
        this.capitalPorVencer31a90Dias = capitalPorVencer31a90Dias;
    }

    public void setCapitalPorVencer91a180Dias(BigDecimal capitalPorVencer91a180Dias) {
        this.capitalPorVencer91a180Dias = capitalPorVencer91a180Dias;
    }

    public void setCapitalPorVencer181a360Dias(BigDecimal capitalPorVencer181a360Dias) {
        this.capitalPorVencer181a360Dias = capitalPorVencer181a360Dias;
    }

    public void setCapitalPorVencerMas360Dias(BigDecimal capitalPorVencerMas360Dias) {
        this.capitalPorVencerMas360Dias = capitalPorVencerMas360Dias;
    }

    public void setCostosOperativosPorVencer(BigDecimal costosOperativosPorVencer) {
        this.costosOperativosPorVencer = costosOperativosPorVencer;
    }

    public void setValorNoDevenganIntereses1a30Dias(BigDecimal valorNoDevenganIntereses1a30Dias) {
        this.valorNoDevenganIntereses1a30Dias = valorNoDevenganIntereses1a30Dias;
    }

    public void setValorNoDevenganIntereses31a90Dias(BigDecimal valorNoDevenganIntereses31a90Dias) {
        this.valorNoDevenganIntereses31a90Dias = valorNoDevenganIntereses31a90Dias;
    }

    public void setValorNoDevenganIntereses91a180Dias(BigDecimal valorNoDevenganIntereses91a180Dias) {
        this.valorNoDevenganIntereses91a180Dias = valorNoDevenganIntereses91a180Dias;
    }

    public void setValorNoDevenganIntereses181a360Dias(BigDecimal valorNoDevenganIntereses181a360Dias) {
        this.valorNoDevenganIntereses181a360Dias = valorNoDevenganIntereses181a360Dias;
    }

    public void setValorNoDevenganInteresesMas360Dias(BigDecimal valorNoDevenganInteresesMas360Dias) {
        this.valorNoDevenganInteresesMas360Dias = valorNoDevenganInteresesMas360Dias;
    }

    public void setCapitalVencido1a30Dias(BigDecimal capitalVencido1a30Dias) {
        this.capitalVencido1a30Dias = capitalVencido1a30Dias;
    }

    public void setCapitalVencido31a90Dias(BigDecimal capitalVencido31a90Dias) {
        this.capitalVencido31a90Dias = capitalVencido31a90Dias;
    }

    public void setCapitalVencido91a180Dias(BigDecimal capitalVencido91a180Dias) {
        this.capitalVencido91a180Dias = capitalVencido91a180Dias;
    }

    public void setCapitalVencido181a360Dias(BigDecimal capitalVencido181a360Dias) {
        this.capitalVencido181a360Dias = capitalVencido181a360Dias;
    }

    public void setCapitalVencidoMas360Dias(BigDecimal capitalVencidoMas360Dias) {
        this.capitalVencidoMas360Dias = capitalVencidoMas360Dias;
    }

    public void setCapitalVencido181a270Dias(BigDecimal capitalVencido181a270Dias) {
        this.capitalVencido181a270Dias = capitalVencido181a270Dias;
    }

    public void setCapitalVencidoMas270Dias(BigDecimal capitalVencidoMas270Dias) {
        this.capitalVencidoMas270Dias = capitalVencidoMas270Dias;
    }

    public void setInteresVencido1a30Dias(BigDecimal interesVencido1a30Dias) {
        this.interesVencido1a30Dias = interesVencido1a30Dias;
    }

    public void setInteresVencido31a60Dias(BigDecimal interesVencido31a60Dias) {
        this.interesVencido31a60Dias = interesVencido31a60Dias;
    }

    public void setInteresVencido61a90Dias(BigDecimal interesVencido61a90Dias) {
        this.interesVencido61a90Dias = interesVencido61a90Dias;
    }

    public void setInteresVencido91a180Dias(BigDecimal interesVencido91a180Dias) {
        this.interesVencido91a180Dias = interesVencido91a180Dias;
    }

    public void setInteresVencido181a270Dias(BigDecimal interesVencido181a270Dias) {
        this.interesVencido181a270Dias = interesVencido181a270Dias;
    }

    public void setInteresVencidoMas270Dias(BigDecimal interesVencidoMas270Dias) {
        this.interesVencidoMas270Dias = interesVencidoMas270Dias;
    }

    public void setTotalCostosOperativosVencidos(BigDecimal totalCostosOperativosVencidos) {
        this.totalCostosOperativosVencidos = totalCostosOperativosVencidos;
    }

    public void setInteresSobreMora(BigDecimal interesSobreMora) {
        this.interesSobreMora = interesSobreMora;
    }

    public void setValorEnDemandaJudicial(BigDecimal valorEnDemandaJudicial) {
        this.valorEnDemandaJudicial = valorEnDemandaJudicial;
    }

    public void setCarteraCastigada(BigDecimal carteraCastigada) {
        this.carteraCastigada = carteraCastigada;
    }

    public void setCodigoObjetoFideicomiso(Integer codigoObjetoFideicomiso) {
        this.codigoObjetoFideicomiso = codigoObjetoFideicomiso;
    }

    public void setCodigoSituacionOperacion(Integer codigoSituacionOperacion) {
        this.codigoSituacionOperacion = codigoSituacionOperacion;
    }

    public void setCodigoTipoOperacion(Integer codigoTipoOperacion) {
        this.codigoTipoOperacion = codigoTipoOperacion;
    }

    public void setContribucionAtencionCancer(BigDecimal contribucionAtencionCancer) {
        this.contribucionAtencionCancer = contribucionAtencionCancer;
    }

    public void setFechaTransferenciaCuentasVencidas(LocalDate fechaTransferenciaCuentasVencidas) {
        this.fechaTransferenciaCuentasVencidas = fechaTransferenciaCuentasVencidas;
    }

    public void setInteresesAcumuladosPorCobrar(BigDecimal interesesAcumuladosPorCobrar) {
        this.interesesAcumuladosPorCobrar = interesesAcumuladosPorCobrar;
    }

    public void setInteresesReversados(BigDecimal interesesReversados) {
        this.interesesReversados = interesesReversados;
    }

    public void setFechaExigibilidadCuota(LocalDate fechaExigibilidadCuota) {
        this.fechaExigibilidadCuota = fechaExigibilidadCuota;
    }

    public void setCodigoTipoSistemaAmortizacion(Integer codigoTipoSistemaAmortizacion) {
        this.codigoTipoSistemaAmortizacion = codigoTipoSistemaAmortizacion;
    }

    public void setFechaActualizacion(LocalDate fechaActualizacion) {
        this.fechaActualizacion = fechaActualizacion;
    }

    public void setUsuarioActualizacion(String usuarioActualizacion) {
        this.usuarioActualizacion = usuarioActualizacion;
    }

    public Long getId() {
        return id;
    }

    public Integer getCodigoTipoIdentificacion() {
        return codigoTipoIdentificacion;
    }

    public String getIdentificacionSujeto() {
        return identificacionSujeto;
    }

    public String getNumeroTarjeta() {
        return numeroTarjeta;
    }

    public BigDecimal getCupoTarjeta() {
        return cupoTarjeta;
    }

    public BigDecimal getCapitalConsumo() {
        return capitalConsumo;
    }

    public BigDecimal getTea() {
        return tea;
    }

    public Integer getCodigoEstadoOperacion() {
        return codigoEstadoOperacion;
    }

    public Integer getCodigoFormaPago() {
        return codigoFormaPago;
    }

    public BigDecimal getCapitalPorVencer1a30Dias() {
        return capitalPorVencer1a30Dias;
    }

    public BigDecimal getCapitalPorVencer31a90Dias() {
        return capitalPorVencer31a90Dias;
    }

    public BigDecimal getCapitalPorVencer91a180Dias() {
        return capitalPorVencer91a180Dias;
    }

    public BigDecimal getCapitalPorVencer181a360Dias() {
        return capitalPorVencer181a360Dias;
    }

    public BigDecimal getCapitalPorVencerMas360Dias() {
        return capitalPorVencerMas360Dias;
    }

    public BigDecimal getCostosOperativosPorVencer() {
        return costosOperativosPorVencer;
    }

    public BigDecimal getValorNoDevenganIntereses1a30Dias() {
        return valorNoDevenganIntereses1a30Dias;
    }

    public BigDecimal getValorNoDevenganIntereses31a90Dias() {
        return valorNoDevenganIntereses31a90Dias;
    }

    public BigDecimal getValorNoDevenganIntereses91a180Dias() {
        return valorNoDevenganIntereses91a180Dias;
    }

    public BigDecimal getValorNoDevenganIntereses181a360Dias() {
        return valorNoDevenganIntereses181a360Dias;
    }

    public BigDecimal getValorNoDevenganInteresesMas360Dias() {
        return valorNoDevenganInteresesMas360Dias;
    }

    public BigDecimal getCapitalVencido1a30Dias() {
        return capitalVencido1a30Dias;
    }

    public BigDecimal getCapitalVencido31a90Dias() {
        return capitalVencido31a90Dias;
    }

    public BigDecimal getCapitalVencido91a180Dias() {
        return capitalVencido91a180Dias;
    }

    public BigDecimal getCapitalVencido181a360Dias() {
        return capitalVencido181a360Dias;
    }

    public BigDecimal getCapitalVencidoMas360Dias() {
        return capitalVencidoMas360Dias;
    }

    public BigDecimal getCapitalVencido181a270Dias() {
        return capitalVencido181a270Dias;
    }

    public BigDecimal getCapitalVencidoMas270Dias() {
        return capitalVencidoMas270Dias;
    }

    public BigDecimal getInteresVencido1a30Dias() {
        return interesVencido1a30Dias;
    }

    public BigDecimal getInteresVencido31a60Dias() {
        return interesVencido31a60Dias;
    }

    public BigDecimal getInteresVencido61a90Dias() {
        return interesVencido61a90Dias;
    }

    public BigDecimal getInteresVencido91a180Dias() {
        return interesVencido91a180Dias;
    }

    public BigDecimal getInteresVencido181a270Dias() {
        return interesVencido181a270Dias;
    }

    public BigDecimal getInteresVencidoMas270Dias() {
        return interesVencidoMas270Dias;
    }

    public BigDecimal getTotalCostosOperativosVencidos() {
        return totalCostosOperativosVencidos;
    }

    public BigDecimal getInteresSobreMora() {
        return interesSobreMora;
    }

    public BigDecimal getValorEnDemandaJudicial() {
        return valorEnDemandaJudicial;
    }

    public BigDecimal getCarteraCastigada() {
        return carteraCastigada;
    }

    public Integer getCodigoObjetoFideicomiso() {
        return codigoObjetoFideicomiso;
    }

    public Integer getCodigoSituacionOperacion() {
        return codigoSituacionOperacion;
    }

    public Integer getCodigoTipoOperacion() {
        return codigoTipoOperacion;
    }

    public BigDecimal getContribucionAtencionCancer() {
        return contribucionAtencionCancer;
    }

    public LocalDate getFechaTransferenciaCuentasVencidas() {
        return fechaTransferenciaCuentasVencidas;
    }

    public BigDecimal getInteresesAcumuladosPorCobrar() {
        return interesesAcumuladosPorCobrar;
    }

    public BigDecimal getInteresesReversados() {
        return interesesReversados;
    }

    public LocalDate getFechaExigibilidadCuota() {
        return fechaExigibilidadCuota;
    }

    public Integer getCodigoTipoSistemaAmortizacion() {
        return codigoTipoSistemaAmortizacion;
    }

    public LocalDate getFechaActualizacion() {
        return fechaActualizacion;
    }

    public String getUsuarioActualizacion() {
        return usuarioActualizacion;
    }
}
