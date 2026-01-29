package com.sudamericano.bank.infrastructure.mapper.catalog;

import com.sudamericano.bank.domain.model.catalog.T44Dto;
import com.sudamericano.bank.infrastructure.persistence.entity.catalog.T44Entity;
import org.springframework.stereotype.Component;

@Component
public class T44Mapper {
    public T44Entity toEntity(T44Dto dto){
        return new T44Entity(
                dto.getId(),
                dto.getCodigo(),
                dto.getDescripcion()
        );
    }

    public T44Dto toDomain(T44Entity entity){
        return new T44Dto(
                entity.getId(),
                entity.getCodigo(),
                entity.getDescripcion()
        );
    }
}
