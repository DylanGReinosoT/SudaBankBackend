package com.sudamericano.bank.infrastructure.outputs.structure.L.report;

import com.sudamericano.bank.infrastructure.outputs.ReportDto;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class L07ReportResponse {
    private ReportDto tipoIdentificacionEmisor;
    private String identificacionEmisor;
    private ReportDto nacionalidadEmisor;
    private ReportDto tipoEmisor;
}
