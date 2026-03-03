package com.sudamericano.bank.infrastructure.persistence.entity.structure.R21;

import jakarta.persistence.*;
import lombok.*;
import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Table(name = "R21_DETALLE")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class R21DetalleEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_DETALLE")
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_CABECERA")
    private R21CabeceraEntity cabecera;

    @Column(name = "TIPO_IDENTIFICACION")
    private String tipoIdentificacion;

    @Column(name = "IDENTIFICACION")
    private String identificacion;

    @Column(name = "NUMERO_TARJETA_HOMOLOGADO")
    private String numeroTarjetaHomologado;

    @Column(name = "CUPO_TARJETA")
    private BigDecimal cupoTarjeta;

    @Column(name = "CAPITAL_CONSUMO_MES")
    private BigDecimal capitalConsumoMes;

    @Column(name = "TEA")
    private BigDecimal tea;

    @Column(name = "ESTADO_OPERACION")
    private String estadoOperacion;

    @Column(name = "FORMA_PAGO")
    private String formaPago;

    @Column(name = "CAP_POR_VENCER_1_30")
    private BigDecimal capPorVencer1a30;

    @Column(name = "CAP_POR_VENCER_31_90")
    private BigDecimal capPorVencer31a90;

    @Column(name = "CAP_POR_VENCER_91_180")
    private BigDecimal capPorVencer91a180;

    @Column(name = "CAP_POR_VENCER_181_360")
    private BigDecimal capPorVencer181a360;

    @Column(name = "CAP_POR_VENCER_MAS_360")
    private BigDecimal capPorVencerMas360;

    @Column(name = "COSTOS_OP_POR_VENCER")
    private BigDecimal costosOpPorVencer;

    @Column(name = "NO_DEVENGA_1_30")
    private BigDecimal noDevenga1a30;

    @Column(name = "NO_DEVENGA_31_90")
    private BigDecimal noDevenga31a90;

    @Column(name = "NO_DEVENGA_91_180")
    private BigDecimal noDevenga91a180;

    @Column(name = "NO_DEVENGA_181_360")
    private BigDecimal noDevenga181a360;

    @Column(name = "NO_DEVENGA_MAS_360")
    private BigDecimal noDevengaMas360;

    @Column(name = "CAP_VENCIDO_1_30")
    private BigDecimal capVencido1a30;

    @Column(name = "CAP_VENCIDO_31_90")
    private BigDecimal capVencido31a90;

    @Column(name = "CAP_VENCIDO_91_180")
    private BigDecimal capVencido91a180;

    @Column(name = "CAP_VENCIDO_181_360")
    private BigDecimal capVencido181a360;

    @Column(name = "CAP_VENCIDO_MAS_360")
    private BigDecimal capVencidoMas360;

    @Column(name = "CAP_VENCIDO_181_270")
    private BigDecimal capVencido181a270;

    @Column(name = "CAP_VENCIDO_MAS_270")
    private BigDecimal capVencidoMas270;

    @Column(name = "INT_VENCIDO_1_30")
    private BigDecimal intVencido1a30;

    @Column(name = "INT_VENCIDO_31_60")
    private BigDecimal intVencido31a60;

    @Column(name = "INT_VENCIDO_61_90")
    private BigDecimal intVencido61a90;

    @Column(name = "INT_VENCIDO_91_180")
    private BigDecimal intVencido91a180;

    @Column(name = "INT_VENCIDO_181_270")
    private BigDecimal intVencido181a270;

    @Column(name = "INT_VENCIDO_MAS_270")
    private BigDecimal intVencidoMas270;

    @Column(name = "COSTOS_OP_VENCIDOS")
    private BigDecimal costosOpVencidos;

    @Column(name = "INTERES_MORA")
    private BigDecimal interesMora;

    @Column(name = "VALOR_DEMANDA_JUDICIAL")
    private BigDecimal valorDemandaJudicial;

    @Column(name = "CARTERA_CASTIGADA")
    private BigDecimal carteraCastigada;

    @Column(name = "OBJETO_FIDEICOMISO")
    private String objetoFideicomiso;

    @Column(name = "SITUACION_OPERACION")
    private String situacionOperacion;

    @Column(name = "TIPO_OPERACION")
    private String tipoOperacion;

    @Column(name = "CONTRIBUCION_CANCER")
    private BigDecimal contribucionCancer;

    @Column(name = "FECHA_PASO_VENCIDO")
    private LocalDate fechaPasoVencido;

    @Column(name = "INTERESES_ACUMULADOS")
    private BigDecimal interesesAcumulados;

    @Column(name = "INTERESES_REVERSADOS")
    private BigDecimal interesesReversados;

    @Column(name = "FECHA_EXIGIBILIDAD")
    private LocalDate fechaExigibilidad;

    @Column(name = "SISTEMA_AMORTIZACION")
    private String sistemaAmortizacion;
}
