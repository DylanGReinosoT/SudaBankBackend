package com.sudamericano.bank.infrastructure.mapper.catalog;

import com.sudamericano.bank.domain.model.catalog.T28Dto;
import com.sudamericano.bank.infrastructure.persistence.entity.catalog.T28Entity;
import org.springframework.stereotype.Component;

@Component
public class T28Mapper {

    public T28Dto toDto(T28Entity entity){
        return new T28Dto(
                entity.getId(),
                entity.getCodigo(),
                entity.getDescripcion(),
                entity.getNivel()
        );
    }
}
