package com.sudamericano.bank.infrastructure.mapper.catalog;

import com.sudamericano.bank.domain.model.catalog.CatalogT218;
import com.sudamericano.bank.infrastructure.persistence.entity.catalog.CatalogT218Entity;
import org.springframework.stereotype.Component;

@Component
public class PersistenceCatalogT218Mapper {
    public CatalogT218Entity toEntity(CatalogT218 catalog){
        return CatalogT218Entity.builder()
                .id(catalog.getId())
                .codigo(catalog.getCodigo())
                .descripcion(catalog.getDescripcion())
                .build();
    }

    public CatalogT218 toDomain(CatalogT218Entity catalogEntity){
        return new CatalogT218(
                catalogEntity.getId(),
                catalogEntity.getCodigo(),
                catalogEntity.getDescripcion()
        );
    }
}
