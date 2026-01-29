package com.sudamericano.bank.infrastructure.mapper.catalog;

import com.sudamericano.bank.domain.model.catalog.T7Dto;
import com.sudamericano.bank.infrastructure.persistence.entity.catalog.T7Entity;
import org.springframework.stereotype.Component;

@Component
public class T7Mapper {
    public T7Dto toDto(T7Entity entity){
        return new T7Dto(
                entity.getId(),
                entity.getCodigo(),
                entity.getDescripcion(),
                entity.getCodigoProv(),
                entity.getEstado()
        );
    }
}
