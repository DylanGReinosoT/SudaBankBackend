package com.sudamericano.bank.infrastructure.adapter.catalog;

import com.sudamericano.bank.domain.model.catalog.CatalogT35;
import com.sudamericano.bank.domain.ports.outputs.catalog.CatalogT35RepositoryPort;
import com.sudamericano.bank.infrastructure.persistence.jpa.catalog.SpringDataCatalogT35Repository;
import com.sudamericano.bank.infrastructure.mapper.catalog.PersistenceCatalogT35Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class SqlCatalogT35RepositoryAdapter implements CatalogT35RepositoryPort {

    private final SpringDataCatalogT35Repository springDataCatalogT35Repository;
    private final PersistenceCatalogT35Mapper mapper;

    public SqlCatalogT35RepositoryAdapter(
            SpringDataCatalogT35Repository springDataCatalogT35Repository,
            PersistenceCatalogT35Mapper mapper) {
        this.springDataCatalogT35Repository = springDataCatalogT35Repository;
        this.mapper = mapper;
    }

    @Override
    public List<CatalogT35> findAll() {
        return springDataCatalogT35Repository.findAll()
                .stream()
                .map(mapper::toDomain)
                .toList();
    }

    @Override
    public CatalogT35 findById(Integer id) {
        return springDataCatalogT35Repository.findById(id)
                .map(mapper::toDomain)
                .orElse(null);
    }
}
