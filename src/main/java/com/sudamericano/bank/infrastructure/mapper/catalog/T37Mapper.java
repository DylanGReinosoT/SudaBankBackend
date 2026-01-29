package com.sudamericano.bank.infrastructure.mapper.catalog;

import com.sudamericano.bank.domain.model.catalog.T37Dto;
import com.sudamericano.bank.infrastructure.persistence.entity.catalog.T37Entity;
import org.springframework.stereotype.Component;

@Component
public class T37Mapper {
    public T37Dto toDto(T37Entity entity){
        return new T37Dto(
                entity.getId(),
                entity.getCodigo(),
                entity.getDescripcion(),
                entity.getEstado()
        );
    }

}
