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
public class L06ReportResponse {

    public ReportDto tipoIdentificacion;
    public ReportDto identificacionEmisor;
    public ReportDto emisor;
    public Integer numeroTitulo;
    public Integer numeroOperacion;
    public LocalDate fechaEmision;
    public LocalDate fechaCompra;
    public ReportDto codigoEstadoOperacion;
    public String cuentaContable;
    public ReportDto codigoTipoOperacion;
    public LocalDate fechaOperacion;
    public LocalDate fechaVencimientoOperacion;
    public ReportDto codigoTipoIdentificacionContraparte;
    public ReportDto codigoIdentificacionContraparteOperacion;
    public ReportDto codigoMonedaDenominacion;
    public BigDecimal montoNegociadoDolares;
    public BigDecimal tasaEfectivaAnual;
    public Float valorNominalTituloDolares;
    public Float valorMercadoTituloDolar;
    public ReportDto codigoCategoriaCalificacion;
    public ReportDto codigoCalificacionRiesgo;
    public ReportDto codigoCalificadoraRiesgo;
    public ReportDto codigoTipoIdentificacionCustodio;
    public ReportDto codigoIdentificacionCustodio;

}
