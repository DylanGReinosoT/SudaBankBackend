package com.sudamericano.bank.domain.ports.inputs.catalog;

import com.sudamericano.bank.domain.model.catalog.CatalogT4;

import java.util.List;

public interface CatalogT4UseCase {
    List<CatalogT4> getAllCatalogT4();
    CatalogT4 findById(Integer id);
}
