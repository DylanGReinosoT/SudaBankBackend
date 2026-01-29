package com.sudamericano.bank.domain.services.catalog;

import com.sudamericano.bank.domain.model.catalog.CatalogT35;
import com.sudamericano.bank.domain.ports.inputs.catalog.CatalogT35UseCase;
import com.sudamericano.bank.domain.ports.outputs.catalog.CatalogT35RepositoryPort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CatalogT35Service implements CatalogT35UseCase {

    private final CatalogT35RepositoryPort catalogT35RepositoryPort;

    public CatalogT35Service(CatalogT35RepositoryPort catalogT35RepositoryPort) {
        this.catalogT35RepositoryPort = catalogT35RepositoryPort;
    }

    @Override
    public List<CatalogT35> getAllCatalogT35() {
        return catalogT35RepositoryPort.findAll();
    }

    @Override
    public CatalogT35 findById(Integer id) {
        return catalogT35RepositoryPort.findById(id);
    }
}
