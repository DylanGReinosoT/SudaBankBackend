package com.sudamericano.bank.infrastructure.outputs.structure.L.report;

import com.sudamericano.bank.infrastructure.outputs.ReportDto;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
@NoArgsConstructor
public class L10ReportResponse {
    private String codigoProducto;
    private ReportDto codigoBanda;
    private BigDecimal valorProductoBanda;
}
