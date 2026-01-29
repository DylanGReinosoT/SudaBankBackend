package com.sudamericano.bank.infrastructure.adapter.catalog;

import com.sudamericano.bank.domain.model.catalog.CatalogT73;
import com.sudamericano.bank.domain.ports.outputs.catalog.CatalogT73RepositoryPort;
import com.sudamericano.bank.infrastructure.persistence.jpa.catalog.SpringDataCatalogT73Repository;
import com.sudamericano.bank.infrastructure.mapper.catalog.PersistenceCatalogT73Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class SqlCatalogT73RepositoryAdapter implements CatalogT73RepositoryPort {

    private final SpringDataCatalogT73Repository springDataCatalogT73Repository;
    private final PersistenceCatalogT73Mapper mapper;

    public SqlCatalogT73RepositoryAdapter(
            SpringDataCatalogT73Repository springDataCatalogT73Repository,
            PersistenceCatalogT73Mapper mapper) {
        this.springDataCatalogT73Repository = springDataCatalogT73Repository;
        this.mapper = mapper;
    }

    @Override
    public List<CatalogT73> findAll() {
        return springDataCatalogT73Repository.findAll()
                .stream()
                .map(mapper::toDomain)
                .toList();
    }
}
