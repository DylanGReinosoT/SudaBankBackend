package com.sudamericano.bank.infrastructure.mapper.catalog;

import com.sudamericano.bank.domain.model.catalog.T214Dto;
import com.sudamericano.bank.infrastructure.persistence.entity.catalog.T214Entity;
import org.springframework.stereotype.Component;

@Component
public class T214Mapper {
    public T214Dto toDto(T214Entity entity){
        return new T214Dto(
                entity.getId(),
                entity.getCodigo(),
                entity.getDescripcion()
        );
    }
}
