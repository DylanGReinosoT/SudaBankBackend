package com.sudamericano.bank.infrastructure.txt;

import java.math.BigDecimal;

public record R22TxtLine(
        String tipoIdentificacion,
        String identificacion,
        String numeroTarjetaHomologado,
        int diasMorosidad,
        String calificacion,
        BigDecimal provisionRequerida
) {
    public String toLine() {
        return String.join("|",
                tipoIdentificacion,
                identificacion,
                numeroTarjetaHomologado,
                String.valueOf(diasMorosidad),
                calificacion,
                provisionRequerida.toPlainString()
        );
    }
}


