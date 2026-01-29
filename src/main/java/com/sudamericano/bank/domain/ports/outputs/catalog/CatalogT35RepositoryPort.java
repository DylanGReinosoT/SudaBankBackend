package com.sudamericano.bank.domain.ports.outputs.catalog;

import com.sudamericano.bank.domain.model.catalog.CatalogT35;

import java.util.List;

public interface CatalogT35RepositoryPort {
    List<CatalogT35> findAll();
    CatalogT35 findById(Integer id);
}
