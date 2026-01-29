package com.sudamericano.bank.infrastructure.mapper.catalog;

import com.sudamericano.bank.domain.model.catalog.T33Dto;
import com.sudamericano.bank.infrastructure.persistence.entity.catalog.T33Entity;
import org.springframework.stereotype.Component;

@Component
public class T33Mapper {
    public T33Dto toDto(T33Entity entity){
        return new T33Dto(
                entity.getId(),
                entity.getCodigo(),
                entity.getDescripcion(),
                entity.getSustituida()
        );
    }
}
