package com.sudamericano.bank.infrastructure.outputs.structure.L.report;

import com.sudamericano.bank.infrastructure.outputs.ReportDto;
import com.sudamericano.bank.infrastructure.outputs.ResponseDTO;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
public class L04ReportResponse {
    public ReportDto tipoIdentificacion;
    public ReportDto emisor;
    public String numeroTitulo;
    public LocalDate fechaEmision;
    public LocalDate fechaCompra;
    public Integer cuentaOrigen;
    public Integer cuentaDestino;
    public Float valorLibrosCuentaOrigen;
    public Float valorLibrosCuentaDestino;
    public LocalDate fechaTransferencia;
    public ReportDto motivoTransferencia;
}
