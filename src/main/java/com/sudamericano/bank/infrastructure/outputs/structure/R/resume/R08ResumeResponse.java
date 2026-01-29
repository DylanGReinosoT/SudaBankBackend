package com.sudamericano.bank.infrastructure.outputs.structure.R.resume;

import com.sudamericano.bank.infrastructure.outputs.ResponseDTO;
import lombok.Getter;
import lombok.Setter;

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
