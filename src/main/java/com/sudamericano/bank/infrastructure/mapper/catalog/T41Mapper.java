package com.sudamericano.bank.infrastructure.mapper.catalog;

import com.sudamericano.bank.domain.model.catalog.T41Dto;
import com.sudamericano.bank.infrastructure.persistence.entity.catalog.T41Entity;
import org.springframework.stereotype.Component;

@Component
public class T41Mapper {
    public T41Dto toDto(T41Entity entity){
        return new T41Dto(
                entity.getId(),
                entity.getCodigo(),
                entity.getDescripcion()
        );
    }
}
