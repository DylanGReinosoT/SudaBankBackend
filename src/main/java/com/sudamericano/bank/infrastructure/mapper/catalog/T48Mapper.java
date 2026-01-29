package com.sudamericano.bank.infrastructure.mapper.catalog;

import com.sudamericano.bank.domain.model.catalog.T48Dto;
import com.sudamericano.bank.infrastructure.persistence.entity.catalog.T48Entity;
import org.springframework.stereotype.Component;

@Component
public class T48Mapper {
    public T48Dto toDto(T48Entity entity){
        return new T48Dto(
                entity.getId(),
                entity.getCodigo(),
                entity.getDescripcion()
        );
    }
}
