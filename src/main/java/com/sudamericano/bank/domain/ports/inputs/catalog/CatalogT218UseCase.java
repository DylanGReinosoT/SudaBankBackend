package com.sudamericano.bank.domain.ports.inputs.catalog;

import com.sudamericano.bank.domain.model.catalog.CatalogT218;

import java.util.List;

public interface CatalogT218UseCase {
    List<CatalogT218> getAllCatalogT218();
    CatalogT218 findById(Integer id);
}
