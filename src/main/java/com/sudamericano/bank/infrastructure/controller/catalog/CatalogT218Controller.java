package com.sudamericano.bank.infrastructure.controller.catalog;

import com.sudamericano.bank.domain.model.catalog.CatalogT218;
import com.sudamericano.bank.domain.ports.inputs.catalog.CatalogT218UseCase;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Tag(name = "Catalog T218", description = "Catalog T218 management endpoints")
@RestController
@RequestMapping("/api/catalogs/t218")
public class CatalogT218Controller {
    private final CatalogT218UseCase catalogT218UseCase;

    public CatalogT218Controller(CatalogT218UseCase catalogT218UseCase) {
        this.catalogT218UseCase = catalogT218UseCase;
    }

    @GetMapping
    public ResponseEntity<List<CatalogT218>> getAllCatalogT218() {
        return ResponseEntity.ok().body(catalogT218UseCase.getAllCatalogT218());
    }
}
