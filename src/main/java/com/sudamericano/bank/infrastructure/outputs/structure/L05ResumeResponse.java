package com.sudamericano.bank.infrastructure.outputs.structure;

import com.sudamericano.bank.infrastructure.outputs.ResponseDTO;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDate;

@Getter
@Setter
public class L05ResumeResponse {
    public ResponseDTO tipoIdentificacion;
    public ResponseDTO depositario;
    public ResponseDTO tipoDeposito;
    public String numeroIdentificacionDeposito;
    public String cuentaContable;
    public ResponseDTO moneda;
    public BigDecimal valorMonedaDenominacion;
}

