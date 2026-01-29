package com.sudamericano.bank.infrastructure.outputs.structure;

import com.sudamericano.bank.infrastructure.outputs.ResponseDTO;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class R09ResumeResponse {

    private ResponseDTO tipoIdentificacion;
    private String identificacionSujeto;
    private String numeroOperacion;
    private String codigoTitulo;
    private ResponseDTO tipoTitulo;
    private String descripcionTitulo;
}
