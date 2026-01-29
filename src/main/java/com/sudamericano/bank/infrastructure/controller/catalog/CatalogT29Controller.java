package com.sudamericano.bank.infrastructure.controller.catalog;

import com.sudamericano.bank.domain.model.catalog.CatalogT29;
import com.sudamericano.bank.domain.ports.inputs.catalog.CatalogT29UseCase;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Tag(name = "Catalog T29", description = "Catalog T29 management endpoints")
@RestController
@RequestMapping("/api/catalogs/t29")
public class CatalogT29Controller {
    private final CatalogT29UseCase catalogT29UseCase;

    public CatalogT29Controller(CatalogT29UseCase catalogT29UseCase) {
        this.catalogT29UseCase = catalogT29UseCase;
    }

    @GetMapping
    public ResponseEntity<List<CatalogT29>> getAllCatalogT29() {
        return ResponseEntity.ok().body(catalogT29UseCase.getAllCatalogT29());
    }
}
