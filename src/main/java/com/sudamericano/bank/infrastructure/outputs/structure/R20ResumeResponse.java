package com.sudamericano.bank.infrastructure.outputs.structure;

import com.sudamericano.bank.infrastructure.outputs.ResponseDTO;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDate;

@Getter
@Setter
public class R20ResumeResponse {
    private ResponseDTO codigoTipoIdentificacion;
    private String identificacionSujeto;
    private String numeroTarjeta;
    private ResponseDTO marcaTarjeta;
    private ResponseDTO claseTarjeta;
    private LocalDate fechaEmision;
    private LocalDate fechaVencimiento;
    private BigDecimal numeroTarjetasAdicionales;
    private ResponseDTO oficina;
    private ResponseDTO tipoCredito;
    private ResponseDTO estadoRegistrado;
    private BigDecimal totalIngresosSujeto;
    private BigDecimal totalEgresosSujeto;
}
