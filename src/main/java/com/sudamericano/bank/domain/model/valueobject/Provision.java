package com.sudamericano.bank.domain.model.valueobject;


import java.math.BigDecimal;

public record Provision(
        BigDecimal base,
        BigDecimal percentage,
        BigDecimal required,
        BigDecimal constituted
) {
    public Provision {
        if (base.signum() < 0 || required.signum() < 0) {
            throw new IllegalArgumentException("Provision amounts cannot be negative");
        }
    }
}

