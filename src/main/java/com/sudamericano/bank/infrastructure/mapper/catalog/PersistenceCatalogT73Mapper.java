package com.sudamericano.bank.infrastructure.mapper.catalog;

import com.sudamericano.bank.domain.model.catalog.CatalogT73;
import com.sudamericano.bank.infrastructure.persistence.entity.catalog.CatalogT73Entity;
import org.springframework.stereotype.Component;

@Component
public class PersistenceCatalogT73Mapper {
    public CatalogT73Entity toEntity(CatalogT73 catalog){
        return CatalogT73Entity.builder()
                .id(catalog.getId())
                .codigo(catalog.getCodigo())
                .descripcion(catalog.getDescripcion())
                .build();
    }

    public CatalogT73 toDomain(CatalogT73Entity catalogEntity){
        return new CatalogT73(
                catalogEntity.getId(),
                catalogEntity.getCodigo(),
                catalogEntity.getDescripcion()
        );
    }
}
