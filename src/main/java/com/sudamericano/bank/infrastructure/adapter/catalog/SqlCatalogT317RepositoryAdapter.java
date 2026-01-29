package com.sudamericano.bank.infrastructure.adapter.catalog;

import com.sudamericano.bank.domain.model.catalog.CatalogT317;
import com.sudamericano.bank.domain.ports.outputs.catalog.CatalogT317RepositoryPort;
import com.sudamericano.bank.infrastructure.persistence.jpa.catalog.SpringDataCatalogT317Repository;
import com.sudamericano.bank.infrastructure.mapper.catalog.PersistenceCatalogT317Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class SqlCatalogT317RepositoryAdapter implements CatalogT317RepositoryPort {

    private final SpringDataCatalogT317Repository springDataCatalogT317Repository;
    private final PersistenceCatalogT317Mapper mapper;

    public SqlCatalogT317RepositoryAdapter(
            SpringDataCatalogT317Repository springDataCatalogT317Repository,
            PersistenceCatalogT317Mapper mapper) {
        this.springDataCatalogT317Repository = springDataCatalogT317Repository;
        this.mapper = mapper;
    }

    @Override
    public List<CatalogT317> findAll() {
        return springDataCatalogT317Repository.findAll()
                .stream()
                .map(mapper::toDomain)
                .toList();
    }

    @Override
    public CatalogT317 findById(Integer id) {
        return springDataCatalogT317Repository.findById(id)
                .map(mapper::toDomain)
                .orElse(null);
    }
}
