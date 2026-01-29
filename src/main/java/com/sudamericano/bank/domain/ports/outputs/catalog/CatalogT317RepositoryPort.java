package com.sudamericano.bank.domain.ports.outputs.catalog;

import com.sudamericano.bank.domain.model.catalog.CatalogT317;
import java.util.List;

public interface CatalogT317RepositoryPort {
    List<CatalogT317> findAll();
    CatalogT317 findById(Integer id);
}
