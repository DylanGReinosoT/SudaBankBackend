package com.sudamericano.bank.infrastructure.outputs.structure.L.resume;

import com.sudamericano.bank.infrastructure.outputs.ResponseDTO;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
public class L04ResumeResponse {
    public ResponseDTO tipoIdentificacion;
    public ResponseDTO emisor;
    public String numeroTitulo;
    public LocalDate fechaEmision;
    public LocalDate fechaCompra;
    public Integer cuentaOrigen;
    public Integer cuentaDestino;
    public Float valorLibrosCuentaOrigen;
    public Float valorLibrosCuentaDestino;
    public LocalDate fechaTransferencia;
    public ResponseDTO motivoTransferencia;
}

