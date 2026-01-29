package com.sudamericano.bank.infrastructure.mapper.catalog;

import com.sudamericano.bank.domain.model.catalog.CatalogT35;
import com.sudamericano.bank.infrastructure.persistence.entity.catalog.CatalogT35Entity;
import org.springframework.stereotype.Component;

@Component
public class PersistenceCatalogT35Mapper {
    public CatalogT35Entity toEntity(CatalogT35 catalog){
        return CatalogT35Entity.builder()
                .id(catalog.getId())
                .codigo(catalog.getCodigo())
                .descripcion(catalog.getDescripcion())
                .build();
    }

    public CatalogT35 toDomain(CatalogT35Entity catalogEntity){
        return new CatalogT35(
                catalogEntity.getId(),
                catalogEntity.getCodigo(),
                catalogEntity.getDescripcion()
        );
    }
}
