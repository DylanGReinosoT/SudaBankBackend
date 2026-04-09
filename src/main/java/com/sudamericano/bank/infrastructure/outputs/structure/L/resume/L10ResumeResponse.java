package com.sudamericano.bank.infrastructure.outputs.structure.L.resume;

import com.sudamericano.bank.infrastructure.outputs.ResponseDTO;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
public class L10ResumeResponse {
    private String codigoProducto;
    private ResponseDTO codigoBanda;
    private BigDecimal valorProductoBanda;
}
