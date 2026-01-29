package com.sudamericano.bank.infrastructure.adapter.catalog;

import com.sudamericano.bank.domain.model.catalog.CatalogT29;
import com.sudamericano.bank.domain.ports.outputs.catalog.CatalogT29RepositoryPort;
import com.sudamericano.bank.infrastructure.persistence.jpa.catalog.SpringDataCatalogT29Repository;
import com.sudamericano.bank.infrastructure.mapper.catalog.PersistenceCatalogT29Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class SqlCatalogT29RepositoryAdapter implements CatalogT29RepositoryPort {

    private final SpringDataCatalogT29Repository springDataCatalogT29Repository;
    private final PersistenceCatalogT29Mapper mapper;

    public SqlCatalogT29RepositoryAdapter(
            SpringDataCatalogT29Repository springDataCatalogT29Repository,
            PersistenceCatalogT29Mapper mapper) {
        this.springDataCatalogT29Repository = springDataCatalogT29Repository;
        this.mapper = mapper;
    }

    @Override
    public List<CatalogT29> findAll() {
        return springDataCatalogT29Repository.findAll()
                .stream()
                .map(mapper::toDomain)
                .toList();
    }

    @Override
    public CatalogT29 findById(Integer id) {
        return springDataCatalogT29Repository.findById(id)
                .map(mapper::toDomain)
                .orElse(null);
    }
}
