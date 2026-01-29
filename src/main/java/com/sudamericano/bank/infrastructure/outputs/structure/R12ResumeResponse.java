package com.sudamericano.bank.infrastructure.outputs.structure;

import com.sudamericano.bank.infrastructure.outputs.ResponseDTO;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class R12ResumeResponse{
    private ResponseDTO codigoTipoIdentificacion;
    private String nombreGrupoEconomico;
    private String identificacionIntegrante;
}
