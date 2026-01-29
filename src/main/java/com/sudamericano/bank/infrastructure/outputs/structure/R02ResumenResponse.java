package com.sudamericano.bank.infrastructure.outputs.structure;

import com.sudamericano.bank.infrastructure.outputs.ResponseDTO;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDate;

@Getter
@Setter
public class R02ResumenResponse {

    private ResponseDTO tipoIdentificacion;
    private String identificacionSujeto;
    private String numeroOperacion;
    private BigDecimal valorOperacion;
    private BigDecimal tasaInteresNominal;
    private BigDecimal tea;
    private ResponseDTO codigoMoneda;
    private LocalDate fechaConcesion;

}
