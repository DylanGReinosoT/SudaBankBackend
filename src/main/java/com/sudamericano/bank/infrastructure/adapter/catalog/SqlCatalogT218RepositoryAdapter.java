package com.sudamericano.bank.infrastructure.adapter.catalog;

import com.sudamericano.bank.domain.model.catalog.CatalogT218;
import com.sudamericano.bank.domain.ports.outputs.catalog.CatalogT218RepositoryPort;
import com.sudamericano.bank.infrastructure.persistence.jpa.catalog.SpringDataCatalogT218Repository;
import com.sudamericano.bank.infrastructure.mapper.catalog.PersistenceCatalogT218Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class SqlCatalogT218RepositoryAdapter implements CatalogT218RepositoryPort {

    private final SpringDataCatalogT218Repository springDataCatalogT218Repository;
    private final PersistenceCatalogT218Mapper mapper;

    public SqlCatalogT218RepositoryAdapter(
            SpringDataCatalogT218Repository springDataCatalogT218Repository,
            PersistenceCatalogT218Mapper mapper) {
        this.springDataCatalogT218Repository = springDataCatalogT218Repository;
        this.mapper = mapper;
    }

    @Override
    public List<CatalogT218> findAll() {
        return springDataCatalogT218Repository.findAll()
                .stream()
                .map(mapper::toDomain)
                .toList();
    }

    @Override
    public CatalogT218 findById(Integer id) {
        return springDataCatalogT218Repository.findById(id)
                .map(mapper::toDomain)
                .orElse(null);
    }
}
