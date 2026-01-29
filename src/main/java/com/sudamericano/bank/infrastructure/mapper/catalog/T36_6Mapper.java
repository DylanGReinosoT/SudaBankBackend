package com.sudamericano.bank.infrastructure.mapper.catalog;

import com.sudamericano.bank.domain.model.catalog.T36_6Dto;
import com.sudamericano.bank.infrastructure.persistence.entity.catalog.T36_6Entity;
import org.springframework.stereotype.Component;

@Component
public class T36_6Mapper {
    public T36_6Dto toDto(T36_6Entity entity){
        return new T36_6Dto(
                entity.getId(),
                entity.getCodigo(),
                entity.getDescripcion()
        );
    }
}
