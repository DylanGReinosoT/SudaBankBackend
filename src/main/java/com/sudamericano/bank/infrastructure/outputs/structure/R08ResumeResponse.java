package com.sudamericano.bank.infrastructure.outputs.structure;

import com.sudamericano.bank.infrastructure.outputs.ResponseDTO;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
public class R08ResumeResponse {

    private ResponseDTO tipoIdentificacion;
    private String identificacionSujeto;
    private String numeroOperacion;
    private String codigoBien;
    private ResponseDTO tipoBien;
    private String descripcionBien;
}
