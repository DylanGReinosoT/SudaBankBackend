package com.sudamericano.bank.domain.services.catalog;

import com.sudamericano.bank.domain.model.catalog.CatalogT317;
import com.sudamericano.bank.domain.ports.inputs.catalog.CatalogT317UseCase;
import com.sudamericano.bank.domain.ports.outputs.catalog.CatalogT317RepositoryPort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CatalogT317Service implements CatalogT317UseCase {

    private final CatalogT317RepositoryPort catalogT317RepositoryPort;

    public CatalogT317Service(CatalogT317RepositoryPort catalogT317RepositoryPort) {
        this.catalogT317RepositoryPort = catalogT317RepositoryPort;
    }

    @Override
    public List<CatalogT317> getAllCatalogT317() {
        return catalogT317RepositoryPort.findAll();
    }

    @Override
    public CatalogT317 findById(Integer id) {
        return catalogT317RepositoryPort.findById(id);
    }
}
