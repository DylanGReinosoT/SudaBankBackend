package com.sudamericano.bank.infrastructure.outputs.structure.R.resume;

import com.sudamericano.bank.infrastructure.outputs.ResponseDTO;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
public class R13ResumeResponse {
    private ResponseDTO tipoIdentificacion;
    private String codigoGrupoEconomico;
    private String identificacionIntegrante;
    private ResponseDTO codigoEstadoIntegrante;
    private LocalDate fechaEstadoIntegrante;
    private ResponseDTO factorIntegracion;
}
