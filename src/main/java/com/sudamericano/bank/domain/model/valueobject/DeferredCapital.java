package com.sudamericano.bank.domain.model.valueobject;


import java.math.BigDecimal;

public record DeferredCapital(
        BigDecimal balance,
        BigDecimal interest
) { }

