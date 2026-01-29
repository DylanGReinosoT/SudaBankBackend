package com.sudamericano.bank.domain.ports.outputs.catalog;

import com.sudamericano.bank.domain.model.catalog.CatalogT55;

import java.util.List;

public interface CatalogT55RepositoryPort {
    List<CatalogT55> findAll();
    CatalogT55 findById(Integer id);
}
