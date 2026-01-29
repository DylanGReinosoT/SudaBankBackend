package com.sudamericano.bank.infrastructure.mapper.catalog;
import com.sudamericano.bank.domain.model.catalog.T41_ADto;
import com.sudamericano.bank.infrastructure.persistence.entity.catalog.T41_AEntity;
import org.springframework.stereotype.Component;

@Component
public class T41_AMapper {
    public T41_ADto toDto(T41_AEntity entity){
        return new T41_ADto(
                entity.getId(),
                entity.getCodigo(),
                entity.getDescripcion()
        );
    }
}
