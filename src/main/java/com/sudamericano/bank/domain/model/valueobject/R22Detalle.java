package com.sudamericano.bank.domain.model.valueobject;


public class R22Detalle {

    private final Identification identification;
    private final String standardizedCardNumber;

    private final int daysPastDue;
    private final String internalRating;
    private final String standardizedRating;

    private final Provision provision;
    private final PaymentSummary paymentSummary;
    private final DeferredCapital deferredCapital;



    public R22Detalle(
            Identification identification,
            String standardizedCardNumber,
            int daysPastDue,
            String internalRating,
            String standardizedRating,
            Provision provision,
            PaymentSummary paymentSummary,
            DeferredCapital deferredCapital
    ) {
        this.identification = identification;
        this.standardizedCardNumber = standardizedCardNumber;
        this.daysPastDue = daysPastDue;
        this.internalRating = internalRating;
        this.standardizedRating = standardizedRating;
        this.provision = provision;
        this.paymentSummary = paymentSummary;
        this.deferredCapital = deferredCapital;
    }

    public Identification identification() {
        return identification;
    }

    public String standardizedCardNumber() {
        return standardizedCardNumber;
    }

    public int daysPastDue() {
        return daysPastDue;
    }

    public String internalRating() {
        return internalRating;
    }

    public String standardizedRating() {
        return standardizedRating;
    }

    public Provision provision() {
        return provision;
    }

    public PaymentSummary paymentSummary() {
        return paymentSummary;
    }

    public DeferredCapital deferredCapital() {
        return deferredCapital;
    }
}

