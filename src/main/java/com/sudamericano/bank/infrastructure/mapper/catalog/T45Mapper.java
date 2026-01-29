package com.sudamericano.bank.infrastructure.mapper.catalog;

import com.sudamericano.bank.domain.model.catalog.T45Dto;
import com.sudamericano.bank.infrastructure.persistence.entity.catalog.T45Entity;
import org.springframework.stereotype.Component;

@Component
public class T45Mapper {
    public T45Dto toDto(T45Entity entity){
        return new T45Dto(
          entity.getId(),
          entity.getCodigo(),
          entity.getDescripcion()
        );
    }
}
