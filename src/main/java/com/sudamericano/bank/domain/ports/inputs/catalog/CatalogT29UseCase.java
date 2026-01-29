package com.sudamericano.bank.domain.ports.inputs.catalog;

import com.sudamericano.bank.domain.model.catalog.CatalogT29;

import java.util.List;

public interface CatalogT29UseCase {
    List<CatalogT29> getAllCatalogT29();
    CatalogT29 findById(Integer id);
}
