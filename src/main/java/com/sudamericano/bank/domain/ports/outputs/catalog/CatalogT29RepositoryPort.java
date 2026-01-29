package com.sudamericano.bank.domain.ports.outputs.catalog;

import com.sudamericano.bank.domain.model.catalog.CatalogT29;

import java.util.List;

public interface CatalogT29RepositoryPort {
    List<CatalogT29> findAll();
    CatalogT29 findById(Integer id);
}
