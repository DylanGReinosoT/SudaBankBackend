package com.sudamericano.bank.infrastructure.mapper.catalog;

import com.sudamericano.bank.domain.model.catalog.T62Dto;
import com.sudamericano.bank.infrastructure.persistence.entity.catalog.T62Entity;
import org.springframework.stereotype.Component;

@Component
public class T62Mapper {
    public T62Dto toDto(T62Entity entity){
        return new T62Dto(
                entity.getId(),
                entity.getCodigo(),
                entity.getDescripcion()
        );
    }
}
