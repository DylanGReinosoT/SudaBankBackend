package com.sudamericano.bank.infrastructure.txt;

import com.sudamericano.bank.domain.model.valueobject.R22Detalle;

public final class R22TxtMapper {

    private R22TxtMapper() {}

    public static R22TxtLine map(R22Detalle detalle) {
        return new R22TxtLine(
                detalle.identification().type(),
                detalle.identification().number(),
                detalle.standardizedCardNumber(),
                detalle.daysPastDue(),
                detalle.internalRating(),
                detalle.provision().required()
        );
    }
}

