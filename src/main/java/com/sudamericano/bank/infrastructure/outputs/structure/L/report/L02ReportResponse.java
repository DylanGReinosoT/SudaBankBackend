package com.sudamericano.bank.infrastructure.outputs.structure.L.report;

import com.sudamericano.bank.infrastructure.outputs.ReportDto;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
public class L02ReportResponse {
    public ReportDto codigoTipoIdentificacion;
    public ReportDto codigoEmisor;
    public String numeroTitulo;
    public LocalDate fechaEmision;
    public LocalDate fechaCompra;
    public LocalDate fechaVencimiento;
    public ReportDto codigoIdentificadorInstrumento;
    public String identificacionInstrumento;
    public ReportDto codigoCategoriaInstrumento;
    public ReportDto codigoTipoInstrumento;
    public ReportDto codigoOpcionalidad;
    public ReportDto codigoTasaBase;
    public Integer diferencialRevision;
    public ReportDto codigoTipoTasa;
    public ReportDto monedaDenominacion;
    public Integer unidadesAdquiridas;
    public Float valorNominalDenominacion;
    public Float valorNominalDolares;
    public Float precioCompra;
    public Float valorCompraDenominacion;
    public Float valorCompraDolares;
    public Integer frecuenciaRevision;
    public Integer periodicidadPago;
}
