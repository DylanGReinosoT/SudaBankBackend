package com.sudamericano.bank.domain.ports.inputs.catalog;

import com.sudamericano.bank.domain.model.catalog.CatalogT55;

import java.util.List;

public interface CatalogT55UseCase {
    List<CatalogT55> getAllCatalogT55();
    CatalogT55 findById(Integer id);
}
