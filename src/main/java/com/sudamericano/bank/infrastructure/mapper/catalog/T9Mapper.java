package com.sudamericano.bank.infrastructure.mapper.catalog;

import com.sudamericano.bank.domain.model.catalog.T9Dto;
import com.sudamericano.bank.infrastructure.persistence.entity.catalog.T9Entity;
import org.springframework.stereotype.Component;

@Component
public class T9Mapper {
    public T9Dto toDto(T9Entity entity){
        return new T9Dto(
                entity.getId(),
                entity.getCodigo(),
                entity.getDescripcion()
        );
    }
}
