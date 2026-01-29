package com.sudamericano.bank.infrastructure.mapper.catalog;

import com.sudamericano.bank.domain.model.catalog.T5Dto;
import com.sudamericano.bank.infrastructure.persistence.entity.catalog.T5Entity;
import org.springframework.stereotype.Component;

@Component
public class T5Mapper {
    public T5Dto toDto(T5Entity entity){
        return new T5Dto(
                entity.getId(),
                entity.getCodigo(),
                entity.getDescripcion(),
                entity.getEstado()
        );
    }
}
