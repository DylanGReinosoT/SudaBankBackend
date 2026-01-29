package com.sudamericano.bank.domain.ports.inputs.catalog;

import com.sudamericano.bank.domain.model.catalog.CatalogT35;

import java.util.List;

public interface CatalogT35UseCase {
    List<CatalogT35> getAllCatalogT35();
    CatalogT35 findById(Integer id);
}
