package com.sudamericano.bank.domain.ports.outputs.catalog;

import com.sudamericano.bank.domain.model.catalog.CatalogT173;

import java.util.List;

public interface CatalogT173RepositoryPort {
    List<CatalogT173> findAll();
}
