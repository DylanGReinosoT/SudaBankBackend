package com.sudamericano.bank.infrastructure.mapper.catalog;

import com.sudamericano.bank.domain.model.catalog.CatalogT55;
import com.sudamericano.bank.infrastructure.persistence.entity.catalog.CatalogT55Entity;
import org.springframework.stereotype.Component;

@Component
public class PersistenceCatalogT55Mapper {
    public CatalogT55Entity toEntity(CatalogT55 catalog){
        return CatalogT55Entity.builder()
                .id(catalog.getId())
                .codigo(catalog.getCodigo())
                .descripcion(catalog.getDescripcion())
                .build();
    }

    public CatalogT55 toDomain(CatalogT55Entity catalogEntity){
        return new CatalogT55(
                catalogEntity.getId(),
                catalogEntity.getCodigo(),
                catalogEntity.getDescripcion()
        );
    }
}
