package com.sudamericano.bank.domain.services.catalog;

import com.sudamericano.bank.domain.model.catalog.CatalogT4;
import com.sudamericano.bank.domain.ports.inputs.catalog.CatalogT4UseCase;
import com.sudamericano.bank.domain.ports.outputs.catalog.CatalogT4RepositoryPort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CatalogT4Service implements CatalogT4UseCase {

    private final CatalogT4RepositoryPort catalogT4RepositoryPort;

    public CatalogT4Service(CatalogT4RepositoryPort catalogT4RepositoryPort) {
        this.catalogT4RepositoryPort = catalogT4RepositoryPort;
    }

    @Override
    public List<CatalogT4> getAllCatalogT4() {
        return catalogT4RepositoryPort.findAll();
    }

    @Override
    public CatalogT4 findById(Integer id) {
        return catalogT4RepositoryPort.findById(id);
    }
}
