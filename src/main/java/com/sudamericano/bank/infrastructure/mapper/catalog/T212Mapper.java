package com.sudamericano.bank.infrastructure.mapper.catalog;

import com.sudamericano.bank.domain.model.catalog.T212Dto;
import com.sudamericano.bank.domain.model.catalog.T33Dto;
import com.sudamericano.bank.infrastructure.persistence.entity.catalog.T212Entity;
import com.sudamericano.bank.infrastructure.persistence.entity.catalog.T33Entity;
import org.springframework.stereotype.Component;

@Component
public class T212Mapper {
    public T212Dto toDto(T212Entity entity){
        return new T212Dto(
                entity.getId(),
                entity.getCodigo(),
                entity.getDescripcion(),
                entity.getEstado()
        );
    }

}
