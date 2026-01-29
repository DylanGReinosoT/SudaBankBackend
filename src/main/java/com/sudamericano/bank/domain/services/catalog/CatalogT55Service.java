package com.sudamericano.bank.domain.services.catalog;

import com.sudamericano.bank.domain.model.catalog.CatalogT55;
import com.sudamericano.bank.domain.ports.inputs.catalog.CatalogT55UseCase;
import com.sudamericano.bank.domain.ports.outputs.catalog.CatalogT55RepositoryPort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CatalogT55Service implements CatalogT55UseCase {

    private final CatalogT55RepositoryPort catalogT55RepositoryPort;

    public CatalogT55Service(CatalogT55RepositoryPort catalogT55RepositoryPort) {
        this.catalogT55RepositoryPort = catalogT55RepositoryPort;
    }

    @Override
    public List<CatalogT55> getAllCatalogT55() {
        return catalogT55RepositoryPort.findAll();
    }

    @Override
    public CatalogT55 findById(Integer id) {
        return catalogT55RepositoryPort.findById(id);
    }
}
