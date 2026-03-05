package com.sudamericano.bank.domain.model.structure.R21;

import java.time.LocalDate;

public record R22Header(
        String estructura,
        String codigoEntidad,
        LocalDate fechaCorte,
        Integer totalRegistros
) {}

