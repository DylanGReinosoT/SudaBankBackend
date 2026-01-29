package com.sudamericano.bank.domain.ports.outputs.catalog;

import com.sudamericano.bank.domain.model.catalog.CatalogT4;

import java.util.List;

public interface CatalogT4RepositoryPort {
    List<CatalogT4> findAll();
    CatalogT4 findById(Integer id);
}
