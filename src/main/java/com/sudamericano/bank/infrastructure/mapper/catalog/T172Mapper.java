package com.sudamericano.bank.infrastructure.mapper.catalog;

import com.sudamericano.bank.domain.model.catalog.T172Dto;
import com.sudamericano.bank.infrastructure.persistence.entity.catalog.T172Entity;
import org.springframework.stereotype.Component;

@Component
public class T172Mapper {
    public T172Dto toDto(T172Entity entity){
        return new T172Dto(
                entity.getId(),
                entity.getCodigo(),
                entity.getDescripcion(),
                entity.getEstado()
        );
    }
}
