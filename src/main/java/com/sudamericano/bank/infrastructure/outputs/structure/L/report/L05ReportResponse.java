package com.sudamericano.bank.infrastructure.outputs.structure.L.report;

import com.sudamericano.bank.infrastructure.outputs.ReportDto;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
public class L05ReportResponse {

    public ReportDto tipoIdentificacion;
    public ReportDto depositario;
    public ReportDto tipoDeposito;
    public String numeroIdentificacionDeposito;
    public String cuentaContable;
    public ReportDto moneda;
    public BigDecimal valorMonedaDenominacion;
    public BigDecimal valorLibrosDolares;
    public ReportDto codigoCalificacionRiesgoDepositario;
    public ReportDto codigoCalificacionRiesgo;
    public LocalDate fechaUltimaCalificacion;

}
