package com.sudamericano.bank.infrastructure.persistence.mapper;


import com.sudamericano.bank.domain.model.valueobject.DeferredCapital;
import com.sudamericano.bank.domain.model.valueobject.Identification;
import com.sudamericano.bank.domain.model.valueobject.PaymentSummary;
import com.sudamericano.bank.domain.model.valueobject.Provision;
import com.sudamericano.bank.infrastructure.persistence.entity.structure.R21.R22DetalleEntity;

public final class ValueObjectMapper {

    private ValueObjectMapper() {
    }

    public static Identification toIdentification(R22DetalleEntity entity) {
        return new Identification(
                entity.getIdentificationType(),
                entity.getIdentificationNumber()
        );
    }

    public static Provision toProvision(R22DetalleEntity entity) {
        return new Provision(
                entity.getProvisionBase(),
                entity.getProvisionPercentage(),
                entity.getRequiredProvision(),
                entity.getConstitutedProvision()
        );
    }

    public static PaymentSummary toPaymentSummary(R22DetalleEntity entity) {
        return new PaymentSummary(
                entity.getMinimumPaymentAmount(),
                entity.getAmountPaid(),
                entity.getCapitalPaymentAmount(),
                entity.getMonthlyInterest(),
                entity.getMonthlyInsurance()
        );
    }

    public static DeferredCapital toDeferredCapital(R22DetalleEntity entity) {
        return new DeferredCapital(
                entity.getDeferredCapitalBalance(),
                entity.getDeferredCapitalInterest()
        );
    }
}

