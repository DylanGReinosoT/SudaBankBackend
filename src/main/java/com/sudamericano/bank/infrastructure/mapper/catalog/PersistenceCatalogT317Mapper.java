package com.sudamericano.bank.infrastructure.mapper.catalog;

import com.sudamericano.bank.domain.model.catalog.CatalogT317;
import com.sudamericano.bank.infrastructure.persistence.entity.catalog.CatalogT317Entity;
import org.springframework.stereotype.Component;

@Component
public class PersistenceCatalogT317Mapper {
    public CatalogT317Entity toEntity(CatalogT317 catalog){
        return CatalogT317Entity.builder()
                .id(catalog.getId())
                .codigo(catalog.getCodigo())
                .descripcion(catalog.getDescripcion())
                .build();
    }

    public CatalogT317 toDomain(CatalogT317Entity catalogEntity){
        return new CatalogT317(
                catalogEntity.getId(),
                catalogEntity.getCodigo(),
                catalogEntity.getDescripcion()
        );
    }


}
