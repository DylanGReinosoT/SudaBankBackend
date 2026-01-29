package com.sudamericano.bank.infrastructure.outputs.structure;

import com.sudamericano.bank.infrastructure.outputs.ResponseDTO;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDate;

@Getter
@Setter
public class R07ResumeResponse {
    private ResponseDTO tipoIdentificacion;
    private String identificacionSujeto;
    private String numeroOperacion;
    private String numeroGarantia;
    private ResponseDTO codigoTipoGarantia;
    private String descripcionGarantia;
    private ResponseDTO codigoPais;
    private ResponseDTO codigoProvincia;
    private ResponseDTO codigoCanton;
    private BigDecimal valorAvaluo;
    private String fechaAvaluo;
    private String numeroRegistroGarantia;
    private String fechaContabilizacionGarantia;
    private BigDecimal porcentajeGarantia;
    private ResponseDTO estadoRegistro;

}
