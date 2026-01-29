package com.sudamericano.bank.infrastructure.mapper.catalog;

import com.sudamericano.bank.domain.model.catalog.T235Dto;
import com.sudamericano.bank.infrastructure.persistence.entity.catalog.T235Entity;
import org.springframework.stereotype.Component;

@Component
public class T235Mapper {
    public T235Dto toDto(T235Entity entity){
        return new T235Dto(
                entity.getId(),
                entity.getCodigo(),
                entity.getDescripcion(),
                entity.getEstado()
        );
    }

}
