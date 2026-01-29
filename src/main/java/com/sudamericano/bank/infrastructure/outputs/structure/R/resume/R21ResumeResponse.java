package com.sudamericano.bank.infrastructure.outputs.structure.R.resume;

import com.sudamericano.bank.infrastructure.outputs.ResponseDTO;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class R21ResumeResponse {
    public ResponseDTO tipoIdentificacion;
    public String identificacionSujeto;
    public String numeroTarjeta;
    public java.math.BigDecimal cupoTarjeta;
    public java.math.BigDecimal capitalConsumo;
    public java.math.BigDecimal tea;
    public ResponseDTO estadoOperacion;
    public ResponseDTO formaPago;
}
