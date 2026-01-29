package com.sudamericano.bank.infrastructure.outputs.structure;

import com.sudamericano.bank.infrastructure.outputs.ResponseDTO;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
public class R10ResumeResponse {

    private ResponseDTO tipoIdentificacion;
    private String identificacionSujeto;
    private String numeroOperacion;
    private ResponseDTO codigoClaseBienTitulo;
    private String codigoBienTitulo;
    private ResponseDTO tipoBienTitulo;
    private BigDecimal provisionConstituida;
    private BigDecimal costosGenerados;
    private ResponseDTO tipoTitulo;

}
