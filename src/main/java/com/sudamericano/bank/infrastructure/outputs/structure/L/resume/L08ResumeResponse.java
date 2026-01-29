package com.sudamericano.bank.infrastructure.outputs.structure.L.resume;

import com.sudamericano.bank.infrastructure.outputs.ResponseDTO;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class L08ResumeResponse {
    private ResponseDTO codigoLiquidez;
    private ResponseDTO tipoIdentificacionEntidad;
    private String identificacionEntidad;
    private ResponseDTO tipoInstrumento;
    private ResponseDTO calificacionEntidad;
    private ResponseDTO calificadoraRiesgo;
}
