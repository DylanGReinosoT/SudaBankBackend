package com.sudamericano.bank.domain.event;


import com.sudamericano.bank.domain.model.valueobject.R22Detalle;

import java.time.Instant;
import java.util.List;

public record R22CalculatedEvent(
        Long r21CabeceraId,
        List<R22Detalle> details,
        Instant occurredAt
) {
    public R22CalculatedEvent(Long r21CabeceraId, List<R22Detalle> details) {
        this(r21CabeceraId, details, Instant.now());
    }
}

