package com.sudamericano.bank.infrastructure.mapper.catalog;

import com.sudamericano.bank.domain.model.catalog.CatalogT29;
import com.sudamericano.bank.infrastructure.persistence.entity.catalog.CatalogT29Entity;
import org.springframework.stereotype.Component;

@Component
public class PersistenceCatalogT29Mapper {
    public CatalogT29Entity toEntity(CatalogT29 catalog){
        return CatalogT29Entity.builder()
                .id(catalog.getId())
                .codigo(catalog.getCodigo())
                .descripcion(catalog.getDescripcion())
                .build();
    }

    public CatalogT29 toDomain(CatalogT29Entity catalogEntity){
        return new CatalogT29(
                catalogEntity.getId(),
                catalogEntity.getCodigo(),
                catalogEntity.getDescripcion()
        );
    }
}
