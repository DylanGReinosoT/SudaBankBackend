package com.sudamericano.bank.application.mapper;


import com.sudamericano.bank.domain.model.valueobject.*;
import com.sudamericano.bank.infrastructure.persistence.R22ReadModel;

import java.math.BigDecimal;

public class R22ReadModelMapper {

    public static R22Detalle toDomain(R22ReadModel rm) {

        Identification identification = new Identification(
                rm.getTipoIdentificacion(),
                rm.getIdentificacion()
        );

        Provision provision = new Provision(
                defaultIfNull(rm.getBaseProvision()),
                defaultIfNull(rm.getPorcentajeProvision()),
                defaultIfNull(rm.getProvisionRequerida()),
                defaultIfNull(rm.getProvisionConstituida())
        );

        PaymentSummary paymentSummary = new PaymentSummary(
                defaultIfNull(rm.getValorMinimoPagar()),
                defaultIfNull(rm.getValorPagado()),
                defaultIfNull(rm.getValorPagarCapital()),
                defaultIfNull(rm.getInteresMes()),
                defaultIfNull(rm.getSeguroMes())
        );

        DeferredCapital deferredCapital = new DeferredCapital(
                defaultIfNull(rm.getSaldoCapitalDiferido()),
                defaultIfNull(rm.getInteresCapitalDiferido())
        );

        return new R22Detalle(
                identification,
                rm.getNumeroTarjetaHomologado(),
                rm.getDiasMorosidad() != null ? rm.getDiasMorosidad() : 0,
                rm.getCalificacionPropia(),
                rm.getCalificacionHomologada(),
                provision,
                paymentSummary,
                deferredCapital
        );
    }

    private static BigDecimal defaultIfNull(BigDecimal value) {
        return value != null ? value : BigDecimal.ZERO;
    }
}

