package com.sudamericano.bank.infrastructure.mapper.catalog;

import com.sudamericano.bank.domain.model.catalog.T208Dto;
import com.sudamericano.bank.infrastructure.persistence.entity.catalog.T208Entity;
import org.springframework.stereotype.Component;

@Component
public class T208Mapper {
    public T208Dto toDto(T208Entity entity){
        return new T208Dto(
                entity.getId(),
                entity.getCodigo(),
                entity.getDescripcion()
        );
    }
}
