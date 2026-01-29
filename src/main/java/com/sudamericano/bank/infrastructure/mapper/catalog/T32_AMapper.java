package com.sudamericano.bank.infrastructure.mapper.catalog;

import com.sudamericano.bank.domain.model.catalog.T32_ADto;
import com.sudamericano.bank.infrastructure.persistence.entity.catalog.T32_AEntity;
import org.springframework.stereotype.Component;

@Component
public class T32_AMapper {
    public T32_ADto toDto(T32_AEntity entity){
        return new T32_ADto(
                entity.getId(),
                entity.getCodigo().toString(),
                entity.getDescripcion()
        );
    }
}
