package com.sudamericano.bank.infrastructure.outputs.structure.L.resume;

import com.sudamericano.bank.infrastructure.outputs.ResponseDTO;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class L09ResumeResponse {
    private String codigoProducto;
    private String descripcionProducto;
    private ResponseDTO codigoFondoInversion;
    private ResponseDTO estadoRegistro;
}
