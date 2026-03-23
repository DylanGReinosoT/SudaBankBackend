package com.sudamericano.bank.infrastructure.mapper.catalog;

import com.sudamericano.bank.domain.model.catalog.T180Dto;
import com.sudamericano.bank.infrastructure.persistence.entity.catalog.T180Entity;
import org.springframework.stereotype.Component;

@Component
public class T180Mapper {
    public T180Dto toDto(T180Entity entity){
        return new T180Dto(
                entity.getId(),
                entity.getCodigo(),
                entity.getDescripcion()
        );
    }
}
