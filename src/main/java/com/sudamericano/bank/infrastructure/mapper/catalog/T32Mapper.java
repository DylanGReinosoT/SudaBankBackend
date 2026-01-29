package com.sudamericano.bank.infrastructure.mapper.catalog;

import com.sudamericano.bank.domain.model.catalog.T32Dto;
import com.sudamericano.bank.infrastructure.persistence.entity.catalog.T32Entity;
import org.springframework.stereotype.Component;

@Component
public class T32Mapper {
    public T32Dto toDto(T32Entity entity){
        return new T32Dto(
                entity.getId(),
                entity.getCodigo().toString(),
                entity.getDescripcion(),
                entity.getEstado()
        );
    }
}
