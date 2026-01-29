package com.sudamericano.bank.infrastructure.mapper.catalog;

import com.sudamericano.bank.domain.model.catalog.T50Dto;
import com.sudamericano.bank.infrastructure.persistence.entity.catalog.T50Entity;
import org.springframework.stereotype.Component;

@Component
public class T50Mapper {
    public T50Dto toDto(T50Entity entity){
        return new T50Dto(
                entity.getId(),
                entity.getCodigoProv(),
                entity.getCodigoCant(),
                entity.getCodigo(),
                entity.getDescripcion(),
                entity.getEstado()
        );
    }
}
