package com.sudamericano.bank.infrastructure.mapper.catalog;

import com.sudamericano.bank.domain.model.catalog.T65Dto;
import com.sudamericano.bank.infrastructure.persistence.entity.catalog.T65Entity;
import org.springframework.stereotype.Component;

@Component
public class T65Mapper {
    public T65Dto toDto(T65Entity entity){
        return new T65Dto(
                entity.getId(),
                entity.getCodigo(),
                entity.getDescripcion(),
                entity.getSp(),
                entity.getMoodys(),
                entity.getFitch(),
                entity.getEstado()
        );
    }
}
