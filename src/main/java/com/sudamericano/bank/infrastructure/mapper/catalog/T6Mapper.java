package com.sudamericano.bank.infrastructure.mapper.catalog;

import com.sudamericano.bank.domain.model.catalog.T6Dto;
import com.sudamericano.bank.infrastructure.persistence.entity.catalog.T6Entity;
import org.springframework.stereotype.Component;

@Component
public class T6Mapper {
    public T6Dto toDto(T6Entity entity){
        return new T6Dto(
                entity.getId(),
                entity.getCodigo(),
                entity.getDescripcion(),
                entity.getEstado()
        );
    }
}
