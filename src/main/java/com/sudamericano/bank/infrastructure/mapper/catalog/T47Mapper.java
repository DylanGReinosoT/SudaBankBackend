package com.sudamericano.bank.infrastructure.mapper.catalog;

import com.sudamericano.bank.domain.model.catalog.T47Dto;
import com.sudamericano.bank.infrastructure.persistence.entity.catalog.T47Entity;
import org.springframework.stereotype.Component;

@Component
public class T47Mapper {
    public T47Dto toDto(T47Entity entity){
        return new T47Dto(
                entity.getId(),
                entity.getCodigo(),
                entity.getDescripcion()
        );
    }
}
