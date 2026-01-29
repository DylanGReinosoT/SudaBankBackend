package com.sudamericano.bank.infrastructure.mapper.catalog;

import com.sudamericano.bank.domain.model.catalog.T38Dto;
import com.sudamericano.bank.infrastructure.persistence.entity.catalog.T38Entity;
import org.springframework.stereotype.Component;

@Component
public class T38Mapper {
    public T38Dto toDto(T38Entity entity){
        return new T38Dto(
                entity.getId(),
                entity.getCodigo(),
                entity.getDescripcion(),
                entity.getPeriodicidad()
        );
    }
}
