package com.sudamericano.bank.infrastructure.mapper.catalog;

import com.sudamericano.bank.domain.model.catalog.T42Dto;
import com.sudamericano.bank.infrastructure.persistence.entity.catalog.T42Entity;
import org.springframework.stereotype.Component;

@Component
public class T42Mapper {
    public T42Entity toEntity(T42Dto dto){
        return new T42Entity(
                dto.getId(),
                dto.getCodigo(),
                dto.getDescripcion()
        );
    }

    public T42Dto toDomain(T42Entity entity){
        return new T42Dto(
                entity.getId(),
                entity.getCodigo(),
                entity.getDescripcion()
        );
    }
}
