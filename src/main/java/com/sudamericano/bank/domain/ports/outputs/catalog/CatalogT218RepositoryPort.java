package com.sudamericano.bank.domain.ports.outputs.catalog;

import com.sudamericano.bank.domain.model.catalog.CatalogT218;

import java.util.List;

public interface CatalogT218RepositoryPort {
    List<CatalogT218> findAll();
    CatalogT218 findById(Integer id);
}
