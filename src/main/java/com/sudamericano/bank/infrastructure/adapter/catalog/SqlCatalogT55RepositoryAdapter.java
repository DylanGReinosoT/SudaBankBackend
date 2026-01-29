package com.sudamericano.bank.infrastructure.adapter.catalog;

import com.sudamericano.bank.domain.model.catalog.CatalogT55;
import com.sudamericano.bank.domain.ports.outputs.catalog.CatalogT55RepositoryPort;
import com.sudamericano.bank.infrastructure.persistence.jpa.catalog.SpringDataCatalogT55Repository;
import com.sudamericano.bank.infrastructure.mapper.catalog.PersistenceCatalogT55Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class SqlCatalogT55RepositoryAdapter implements CatalogT55RepositoryPort {

    private final SpringDataCatalogT55Repository springDataCatalogT55Repository;
    private final PersistenceCatalogT55Mapper mapper;

    public SqlCatalogT55RepositoryAdapter(
            SpringDataCatalogT55Repository springDataCatalogT55Repository,
            PersistenceCatalogT55Mapper mapper) {
        this.springDataCatalogT55Repository = springDataCatalogT55Repository;
        this.mapper = mapper;
    }

    @Override
    public List<CatalogT55> findAll() {
        return springDataCatalogT55Repository.findAll()
                .stream()
                .map(mapper::toDomain)
                .toList();
    }

    @Override
    public CatalogT55 findById(Integer id) {
        return springDataCatalogT55Repository.findById(id)
                .map(mapper::toDomain)
                .orElse(null);
    }
}
