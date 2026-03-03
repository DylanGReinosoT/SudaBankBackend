package com.sudamericano.bank.domain.model.valueobject;


public record Identification(
        String type,
        String number
) {
    public Identification {
        if (type == null || number == null) {
            throw new IllegalArgumentException("Identification data is required");
        }
    }
}
