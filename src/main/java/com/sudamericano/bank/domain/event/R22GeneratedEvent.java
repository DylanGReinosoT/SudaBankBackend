package com.sudamericano.bank.domain.event;

import com.sudamericano.bank.domain.model.valueobject.R22Detalle;

import java.util.List;

public record R22GeneratedEvent(
        Long r21CabeceraId,
        List<R22Detalle> detalles
) {}


