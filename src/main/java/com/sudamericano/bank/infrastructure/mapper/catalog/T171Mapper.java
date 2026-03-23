package com.sudamericano.bank.infrastructure.mapper.catalog;

import com.sudamericano.bank.domain.model.catalog.T171Dto;
import com.sudamericano.bank.infrastructure.persistence.entity.catalog.T171Entity;
import org.springframework.stereotype.Component;

@Component
public class T171Mapper {
    public T171Dto toDto(T171Entity entity){
        return new T171Dto(
                entity.getId(),
                entity.getCodigo(),
                entity.getDescripcion()
        );
    }
}
