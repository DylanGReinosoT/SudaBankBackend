package com.sudamericano.bank.infrastructure.outputs.structure;

import com.sudamericano.bank.infrastructure.outputs.ResponseDTO;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDate;

@Getter
@Setter
public class R04ResumeResponse {
    // Campos básicos (1-4)
    public ResponseDTO tipoIdentificacion;  // 1. Tipo de identificación - Tabla 4
    public String identificacionSujeto;     // 2. Identificación del sujeto
    public String numeroOperacion;          // 3. Número de operación
    public Integer diasMorosidad;           // 4. Días de morosidad
    
    // Campos de calificación (5-7)
    public ResponseDTO metodologiaCalificacion;  // 5. Metodología de calificación - Tabla 218
    public ResponseDTO calificacionPropia;       // 6. Calificación propia - Tabla 29
    public ResponseDTO calificacionHomologada;   // 7. Calificación homologada - Tabla 29
    
    // Campo de interés (8)
    public BigDecimal tasaInteres;          // 8. Tasa de interés
    
    // Valores por vencer (9-13)
    public BigDecimal valorPorVencer1a30;   // 9. Valor por vencer de 1 a 30 días
    public BigDecimal valorPorVencer31a90;  // 10. Valor por vencer de 31 a 90 días
    public BigDecimal valorPorVencer91a180; // 11. Valor por vencer de 91 a 180 días
    public BigDecimal valorPorVencer181a360; // 12. Valor por vencer de 181 a 360 días
    public BigDecimal valorPorVencerMas360; // 13. Valor por vencer de más de 360 días
    
    // Valores que no devengan intereses (14-18)
    public BigDecimal valorNoDevenga1a30;   // 14. Valor que no devenga intereses de 1 a 30 días
    public BigDecimal valorNoDevenga31a90;  // 15. Valor que no devenga intereses de 31 a 90 días
    public BigDecimal valorNoDevenga91a180; // 16. Valor que no devenga intereses de 91 a 180 días
    public BigDecimal valorNoDevenga181a360; // 17. Valor que no devenga intereses de 181 a 360 días
    public BigDecimal valorNoDevengaMas360; // 18. Valor que no devenga intereses de más de 360 días
    
    // Valores vencidos (19-29)
    public BigDecimal valorVencido1a30;     // 19. Valor vencido de 1 a 30 días
    public BigDecimal valorVencido31a90;    // 20. Valor vencido de 31 a 90 días
    public BigDecimal valorVencido91a180;   // 21. Valor vencido de 91 a 180 días
    public BigDecimal valorVencido181a360;  // 22. Valor vencido de 181 a 360 días
    public BigDecimal valorVencidoMas360;   // 23. Valor vencido de más de 360 días
    public BigDecimal valorVencido181a270;  // 24. Valor vencido de 181 a 270 días
    public BigDecimal valorVencidoMas270;   // 25. Valor vencido de más de 270 días
    public BigDecimal valorVencido91a270;   // 26. Valor vencido De 91 a 270 días
    public BigDecimal valorVencido271a360;  // 27. Valor vencido de 271 a 360 días
    public BigDecimal valorVencido361a720;  // 28. Valor vencido de 361 a 720 días
    public BigDecimal valorVencidoMas720;   // 29. Valor vencido de más de 720 días
    
    // Campos adicionales (30-37)
    public BigDecimal gastosRecuperacion;   // 30. Gastos de recuperación de cartera vencida
    public BigDecimal interesOrdinario;     // 31. Interés ordinario
    public BigDecimal interesSobreMora;     // 32. Interés sobre mora
    public BigDecimal valorDemandaJudicial; // 33. Valor en demanda judicial
    public BigDecimal carteraCastigada;     // 34. Cartera castigada
    public BigDecimal provisionRequeridaOriginal; // 35. Provisión requerida original
    public BigDecimal provisionRequeridaReducida; // 36. Provisión requerida reducida
    public BigDecimal provisionConstituida; // 37. Provisión constituida
    
    // Campos de operación (38-39)
    public ResponseDTO tipoOperacion;       // 38. Tipo de operación - Tabla 35
    public ResponseDTO objetoFideicomiso;   // 39. Objeto del fideicomiso - Tabla 55
    
    // Campos financieros (40-45)
    public BigDecimal primaDescuento;       // 40. Prima o descuento
    public BigDecimal cuotaCredito;         // 41. Cuota del crédito
    public BigDecimal valorInteresesCuota; // 42. Valor de Intereses de la Cuota del Crédito
    public BigDecimal valorSeguro;          // 43. Valor del Seguro
    public BigDecimal saldoCuotaCapitalDiferida; // 44. Saldo de la cuota de capital diferida
    public BigDecimal valorInteresCapitalDiferido; // 45. Valor del interés de capital diferido
    
    // Campos de fecha e intereses (46-48)
    public LocalDate fechaTransferenciaCuentasVencidas; // 46. Fecha de transferencia a cuentas vencidas
    public BigDecimal interesesAcumuladosPorCobrar; // 47. Intereses acumulados por cobrar
    public BigDecimal interesesReversados;  // 48. Intereses reversados
    
    // Campos adicionales (49-50)
    public LocalDate fechaExigibilidadCuota; // 49. Fecha de exigibilidad de la cuota
    public ResponseDTO tipoSistemaAmortizacion; // 50. Tipo de sistema de amortización - Tabla 317
}

