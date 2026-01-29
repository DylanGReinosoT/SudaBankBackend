package com.sudamericano.bank.infrastructure.mapper.catalog;

import com.sudamericano.bank.domain.model.catalog.T39Dto;
import com.sudamericano.bank.infrastructure.persistence.entity.catalog.T39Entity;
import org.springframework.stereotype.Component;

@Component
public class T39Mapper {
    public T39Dto toDto(T39Entity entity){
        return new T39Dto(
                entity.getId(),
                entity.getCodigo(),
                entity.getDescripcion()
        );
    }
}
