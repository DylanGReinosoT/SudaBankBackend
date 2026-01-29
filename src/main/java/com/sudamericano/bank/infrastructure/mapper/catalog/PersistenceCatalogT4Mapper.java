package com.sudamericano.bank.infrastructure.mapper.catalog;

import com.sudamericano.bank.domain.model.catalog.CatalogT4;
import com.sudamericano.bank.infrastructure.persistence.entity.catalog.CatalogT4Entity;
import org.springframework.stereotype.Component;

@Component
public class PersistenceCatalogT4Mapper {
    public CatalogT4Entity toEntity(CatalogT4 catalog){
        return CatalogT4Entity.builder()
                .id(catalog.getId())
                .codigo(catalog.getCodigo())
                .descripcion(catalog.getDescripcion())
                .build();
    }

    public CatalogT4 toDomain(CatalogT4Entity catalogEntity){
        return new CatalogT4(
                catalogEntity.getId(),
                catalogEntity.getCodigo(),
                catalogEntity.getDescripcion()
        );
    }
}
