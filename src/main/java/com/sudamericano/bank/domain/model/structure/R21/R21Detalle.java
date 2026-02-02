package com.sudamericano.bank.domain.model.structure.R21;

import lombok.*;
import java.math.BigDecimal;
import java.time.LocalDate;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class R21Detalle {
    private Long id;
    private Long idCabecera;
    private String tipoIdentificacion;
    private String identificacion;
    private String numeroTarjetaHomologado;
    
    @Builder.Default
    private BigDecimal cupoTarjeta = BigDecimal.ZERO;
    
    @Builder.Default
    private BigDecimal capitalConsumoMes = BigDecimal.ZERO;
    
    @Builder.Default
    private BigDecimal tea = BigDecimal.ZERO;
    
    private String estadoOperacion;
    private String formaPago;
    
    @Builder.Default
    private BigDecimal capPorVencer1a30 = BigDecimal.ZERO;
    
    @Builder.Default
    private BigDecimal capPorVencer31a90 = BigDecimal.ZERO;
    
    @Builder.Default
    private BigDecimal capPorVencer91a180 = BigDecimal.ZERO;
    
    @Builder.Default
    private BigDecimal capPorVencer181a360 = BigDecimal.ZERO;
    
    @Builder.Default
    private BigDecimal capPorVencerMas360 = BigDecimal.ZERO;
    
    @Builder.Default
    private BigDecimal costosOpPorVencer = BigDecimal.ZERO;
    
    @Builder.Default
    private BigDecimal noDevenga1a30 = BigDecimal.ZERO;
    
    @Builder.Default
    private BigDecimal noDevenga31a90 = BigDecimal.ZERO;
    
    @Builder.Default
    private BigDecimal noDevenga91a180 = BigDecimal.ZERO;
    
    @Builder.Default
    private BigDecimal noDevenga181a360 = BigDecimal.ZERO;
    
    @Builder.Default
    private BigDecimal noDevengaMas360 = BigDecimal.ZERO;
    
    @Builder.Default
    private BigDecimal capVencido1a30 = BigDecimal.ZERO;
    
    @Builder.Default
    private BigDecimal capVencido31a90 = BigDecimal.ZERO;
    
    @Builder.Default
    private BigDecimal capVencido91a180 = BigDecimal.ZERO;
    
    @Builder.Default
    private BigDecimal capVencido181a360 = BigDecimal.ZERO;
    
    @Builder.Default
    private BigDecimal capVencidoMas360 = BigDecimal.ZERO;
    
    @Builder.Default
    private BigDecimal capVencido181a270 = BigDecimal.ZERO;
    
    @Builder.Default
    private BigDecimal capVencidoMas270 = BigDecimal.ZERO;
    
    @Builder.Default
    private BigDecimal intVencido1a30 = BigDecimal.ZERO;
    
    @Builder.Default
    private BigDecimal intVencido31a60 = BigDecimal.ZERO;
    
    @Builder.Default
    private BigDecimal intVencido61a90 = BigDecimal.ZERO;
    
    @Builder.Default
    private BigDecimal intVencido91a180 = BigDecimal.ZERO;
    
    @Builder.Default
    private BigDecimal intVencido181a270 = BigDecimal.ZERO;
    
    @Builder.Default
    private BigDecimal intVencidoMas270 = BigDecimal.ZERO;
    
    @Builder.Default
    private BigDecimal costosOpVencidos = BigDecimal.ZERO;
    
    @Builder.Default
    private BigDecimal interesMora = BigDecimal.ZERO;
    
    @Builder.Default
    private BigDecimal valorDemandaJudicial = BigDecimal.ZERO;
    
    @Builder.Default
    private BigDecimal carteraCastigada = BigDecimal.ZERO;
    
    private String objetoFideicomiso;
    private String situacionOperacion;
    private String tipoOperacion;
    
    @Builder.Default
    private BigDecimal contribucionCancer = BigDecimal.ZERO;
    
    private LocalDate fechaPasoVencido;
    
    @Builder.Default
    private BigDecimal interesesAcumulados = BigDecimal.ZERO;
    
    @Builder.Default
    private BigDecimal interesesReversados = BigDecimal.ZERO;
    
    private LocalDate fechaExigibilidad;
    private String sistemaAmortizacion;
}
