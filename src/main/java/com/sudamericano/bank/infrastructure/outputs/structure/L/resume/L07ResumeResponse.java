package com.sudamericano.bank.infrastructure.outputs.structure.L.resume;

import com.sudamericano.bank.infrastructure.outputs.ResponseDTO;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class L07ResumeResponse {
    private ResponseDTO tipoIdentificacionEmisor;
    private String identificacionEmisor;
    private ResponseDTO nacionalidadEmisor;
    private ResponseDTO tipoEmisor;
}
