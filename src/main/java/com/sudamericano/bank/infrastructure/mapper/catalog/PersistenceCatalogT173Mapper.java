package com.sudamericano.bank.infrastructure.mapper.catalog;

import com.sudamericano.bank.domain.model.catalog.CatalogT173;
import com.sudamericano.bank.infrastructure.persistence.entity.catalog.CatalogT173Entity;
import org.springframework.stereotype.Component;

@Component
public class PersistenceCatalogT173Mapper {
    public CatalogT173Entity toEntity(CatalogT173 catalog){
        return CatalogT173Entity.builder()
                .id(catalog.getId())
                .codigo(catalog.getCodigo())
                .descripcion(catalog.getDescripcion())
                .build();
    }

    public CatalogT173 toDomain(CatalogT173Entity catalogEntity){
        return new CatalogT173(
                catalogEntity.getId(),
                catalogEntity.getCodigo(),
                catalogEntity.getDescripcion()
        );
    }
}
