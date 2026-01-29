package com.sudamericano.bank.infrastructure.mapper.catalog;

import com.sudamericano.bank.domain.model.catalog.T31Dto;
import com.sudamericano.bank.infrastructure.persistence.entity.catalog.T31Entity;
import org.springframework.stereotype.Component;

@Component
public class T31Mapper {
    public T31Dto toDto(T31Entity entity){
        return new T31Dto(
                entity.getId(),
                entity.getCodigo(),
                entity.getDescripcion(),
                entity.getEstado()
        );
    }
}
