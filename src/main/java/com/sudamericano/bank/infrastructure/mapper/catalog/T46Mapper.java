package com.sudamericano.bank.infrastructure.mapper.catalog;

import com.sudamericano.bank.domain.model.catalog.T46Dto;
import com.sudamericano.bank.infrastructure.persistence.entity.catalog.T46Entity;
import org.springframework.stereotype.Component;

@Component
public class T46Mapper {
    public T46Dto toDto(T46Entity entity) {
        return new T46Dto(
                entity.getId(),
                entity.getCodigo(),
                entity.getDescripcion()
        );
    }
}
