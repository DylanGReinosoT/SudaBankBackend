package com.sudamericano.bank.infrastructure.outputs.structure.L.report;

import com.sudamericano.bank.infrastructure.outputs.ReportDto;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class L09ReportResponse {
    private String codigoProducto;
    private String descripcionProducto;
    private ReportDto codigoFondoInversion;
    private ReportDto estadoRegistro;
}
