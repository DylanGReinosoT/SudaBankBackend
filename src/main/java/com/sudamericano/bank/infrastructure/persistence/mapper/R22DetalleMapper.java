package com.sudamericano.bank.infrastructure.persistence.mapper;

import com.sudamericano.bank.domain.model.valueobject.R22Detalle;
import com.sudamericano.bank.infrastructure.persistence.entity.structure.R21.R22DetalleEntity;

public final class R22DetalleMapper {

    private R22DetalleMapper() {
    }

    public static R22Detalle toDomain(R22DetalleEntity entity) {

        return new R22Detalle(
                ValueObjectMapper.toIdentification(entity),
                entity.getStandardizedCardNumber(),
                entity.getDaysPastDue(),
                entity.getInternalRating(),
                entity.getStandardizedRating(),
                ValueObjectMapper.toProvision(entity),
                ValueObjectMapper.toPaymentSummary(entity),
                ValueObjectMapper.toDeferredCapital(entity)
        );
    }
}

