package com.sudamericano.bank.domain.model.valueobject;


import java.math.BigDecimal;

public record PaymentSummary(
        BigDecimal minimumPayment,
        BigDecimal amountPaid,
        BigDecimal capitalPayment,
        BigDecimal monthlyInterest,
        BigDecimal monthlyInsurance
) { }

