package com.sudamericano.bank.domain.services.catalog;

import com.sudamericano.bank.domain.model.catalog.CatalogT218;
import com.sudamericano.bank.domain.ports.inputs.catalog.CatalogT218UseCase;
import com.sudamericano.bank.domain.ports.outputs.catalog.CatalogT218RepositoryPort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CatalogT218Service implements CatalogT218UseCase {

    private final CatalogT218RepositoryPort catalogT218RepositoryPort;

    public CatalogT218Service(CatalogT218RepositoryPort catalogT218RepositoryPort) {
        this.catalogT218RepositoryPort = catalogT218RepositoryPort;
    }

    @Override
    public List<CatalogT218> getAllCatalogT218() {
        return catalogT218RepositoryPort.findAll();
    }

    @Override
    public CatalogT218 findById(Integer id) {
        return catalogT218RepositoryPort.findById(id);
    }
}
