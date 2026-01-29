package com.sudamericano.bank.infrastructure.mapper.catalog;

import com.sudamericano.bank.domain.model.catalog.T66Dto;
import com.sudamericano.bank.infrastructure.persistence.entity.catalog.T66Entity;
import org.springframework.stereotype.Component;

@Component
public class T66Mapper {
    public T66Dto toDto(T66Entity entity){
        return new T66Dto(
                entity.getId(),
                entity.getCodigo(),
                entity.getDescripcion()
        );
    }
}
