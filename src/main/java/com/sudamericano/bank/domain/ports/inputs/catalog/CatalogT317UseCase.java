package com.sudamericano.bank.domain.ports.inputs.catalog;

import com.sudamericano.bank.domain.model.catalog.CatalogT317;
import java.util.List;

public interface CatalogT317UseCase {
    List<CatalogT317> getAllCatalogT317();
    CatalogT317 findById(Integer id);
}