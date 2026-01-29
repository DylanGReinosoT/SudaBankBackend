package com.sudamericano.bank.domain.services.catalog;

import com.sudamericano.bank.domain.model.catalog.CatalogT29;
import com.sudamericano.bank.domain.ports.inputs.catalog.CatalogT29UseCase;
import com.sudamericano.bank.domain.ports.outputs.catalog.CatalogT29RepositoryPort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CatalogT29Service implements CatalogT29UseCase {

    private final CatalogT29RepositoryPort catalogT29RepositoryPort;

    public CatalogT29Service(CatalogT29RepositoryPort catalogT29RepositoryPort) {
        this.catalogT29RepositoryPort = catalogT29RepositoryPort;
    }

    @Override
    public List<CatalogT29> getAllCatalogT29() {
        return catalogT29RepositoryPort.findAll();
    }

    @Override
    public CatalogT29 findById(Integer id) {
        return catalogT29RepositoryPort.findById(id);
    }
}
