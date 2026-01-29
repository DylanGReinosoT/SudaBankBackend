package com.sudamericano.bank.domain.ports.outputs.catalog;

import com.sudamericano.bank.domain.model.catalog.CatalogT73;

import java.util.List;

public interface CatalogT73RepositoryPort {
    List<CatalogT73> findAll();
}
