package com.sudamericano.bank.infrastructure.mapper.catalog;

import com.sudamericano.bank.domain.model.catalog.T25Dto;
import org.springframework.stereotype.Component;

@Component
public class T25Mapper {
    public T25Dto toDto(com.sudamericano.bank.infrastructure.persistence.entity.catalog.T25Entity entity){
        return new T25Dto(
                entity.getId(),
                entity.getCodigo(),
                entity.getDescripcion(),
                entity.getEstado(),
                entity.getObservacion()
        );
    }
}
