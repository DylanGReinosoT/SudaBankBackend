package com.sudamericano.bank.infrastructure.outputs.structure.L.report;
import com.sudamericano.bank.infrastructure.outputs.ReportDto;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
@NoArgsConstructor
public class L08ReportResponse {
    private ReportDto codigoLiquidez;
    private ReportDto tipoIdentificacionEntidad;
    private String identificacionEntidad;
    private ReportDto tipoInstrumento;
    private ReportDto calificacionEntidad;
    private ReportDto calificadoraRiesgo;

    private BigDecimal lunes;
    private BigDecimal martes;
    private BigDecimal miercoles;
    private BigDecimal jueves;
    private BigDecimal viernes;

}
