package com.sudamericano.bank.infrastructure.mapper.catalog;

import com.sudamericano.bank.domain.model.catalog.T43Dto;
import com.sudamericano.bank.infrastructure.persistence.entity.catalog.T43Entity;
import org.springframework.stereotype.Component;

@Component
public class T43Mapper {
    public T43Entity toEntity(T43Dto dto){
        return new T43Entity(
                dto.getId(),
                dto.getCodigo(),
                dto.getDescripcion()
        );
    }

    public T43Dto toDomain(T43Entity entity){
        return new T43Dto(
                entity.getId(),
                entity.getCodigo(),
                entity.getDescripcion()
        );
    }
}
