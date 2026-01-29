package com.sudamericano.bank.infrastructure.mapper.catalog;

import com.sudamericano.bank.domain.model.catalog.T207Dto;
import com.sudamericano.bank.infrastructure.persistence.entity.catalog.T207Entity;
import org.springframework.stereotype.Component;

@Component
public class T207Mapper {
    public T207Dto toDto(T207Entity entity){
        return new T207Dto(
                entity.getId(),
                entity.getCodigo(),
                entity.getDescripcion()
        );
    }
}
