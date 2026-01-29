package com.sudamericano.bank.infrastructure.outputs.structure;

import com.sudamericano.bank.infrastructure.outputs.ResponseDTO;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
public class L06ResumeResponse {
    public ResponseDTO tipoIdentificacion;
    public ResponseDTO identificacionEmisor;
    private ResponseDTO emisor;
    public Integer numeroTitulo;
    public Integer numeroOperacion;
    public LocalDate fechaEmision;

}
