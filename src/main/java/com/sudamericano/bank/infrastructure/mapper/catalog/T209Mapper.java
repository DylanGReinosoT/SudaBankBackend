package com.sudamericano.bank.infrastructure.mapper.catalog;

import com.sudamericano.bank.domain.model.catalog.T209Dto;
import com.sudamericano.bank.infrastructure.persistence.entity.catalog.T209Entity;
import org.springframework.stereotype.Component;

@Component
public class T209Mapper {
    public T209Dto toDto(T209Entity entity){
        return new T209Dto(
                entity.getId(),
                entity.getCodigo(),
                entity.getDescripcion()
        );
    }
}
