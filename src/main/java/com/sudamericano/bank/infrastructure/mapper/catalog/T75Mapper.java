package com.sudamericano.bank.infrastructure.mapper.catalog;

import com.sudamericano.bank.domain.model.catalog.T75Dto;
import com.sudamericano.bank.infrastructure.persistence.entity.catalog.T75Entity;
import org.springframework.stereotype.Component;

@Component
public class T75Mapper {
    public T75Dto toDto(T75Entity entity){
        return new T75Dto(
                entity.getId(),
                entity.getCodigo(),
                entity.getDescripcion()
        );
    }
}
