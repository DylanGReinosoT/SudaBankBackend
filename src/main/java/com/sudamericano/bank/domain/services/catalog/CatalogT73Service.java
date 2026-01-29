package com.sudamericano.bank.domain.services.catalog;

import com.sudamericano.bank.domain.model.catalog.CatalogT73;
import com.sudamericano.bank.domain.ports.inputs.catalog.CatalogT73UseCase;
import com.sudamericano.bank.domain.ports.outputs.catalog.CatalogT73RepositoryPort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CatalogT73Service implements CatalogT73UseCase {

    private final CatalogT73RepositoryPort catalogT73RepositoryPort;

    public CatalogT73Service(CatalogT73RepositoryPort catalogT73RepositoryPort) {
        this.catalogT73RepositoryPort = catalogT73RepositoryPort;
    }


    @Override
    public List<CatalogT73> getAllCatalogT73() {
        return catalogT73RepositoryPort.findAll();
    }


}
