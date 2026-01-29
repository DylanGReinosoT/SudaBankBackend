package com.sudamericano.bank.infrastructure.mapper.catalog;

import com.sudamericano.bank.domain.model.catalog.T2Dto;
import com.sudamericano.bank.infrastructure.persistence.entity.catalog.T2Entity;
import org.springframework.stereotype.Component;

@Component
public class T2Mapper {

    public T2Dto toDto(T2Entity entity){
        return  new T2Dto(
                entity.getId(),
                entity.getCodigo(),
                entity.getDescripcion(),
                entity.getEstado()
        );
    }
}
