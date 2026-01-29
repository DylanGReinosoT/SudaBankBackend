package com.sudamericano.bank.domain.services.catalog;

import com.sudamericano.bank.domain.model.catalog.CatalogT173;
import com.sudamericano.bank.domain.ports.inputs.catalog.CatalogT173UseCase;
import com.sudamericano.bank.domain.ports.outputs.catalog.CatalogT173RepositoryPort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CatalogT173Service implements CatalogT173UseCase {

    private final CatalogT173RepositoryPort catalogT173RepositoryPort;

    public CatalogT173Service(CatalogT173RepositoryPort catalogT173RepositoryPort) {
        this.catalogT173RepositoryPort = catalogT173RepositoryPort;
    }


    @Override
    public List<CatalogT173> getAllCatalogT173() {
        return catalogT173RepositoryPort.findAll();
    }


}
