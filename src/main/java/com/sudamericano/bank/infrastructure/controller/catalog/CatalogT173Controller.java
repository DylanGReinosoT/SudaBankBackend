package com.sudamericano.bank.infrastructure.controller.catalog;

import com.sudamericano.bank.domain.model.catalog.CatalogT173;
import com.sudamericano.bank.domain.ports.inputs.catalog.CatalogT173UseCase;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Tag(name = "Catalog T173", description = "Catalog T173 management endpoints")
@RestController
@RequestMapping("/api/catalogs/t173")
public class CatalogT173Controller {
    private final CatalogT173UseCase catalogT173UseCase;

    public CatalogT173Controller(CatalogT173UseCase catalogT173UseCase) {
        this.catalogT173UseCase = catalogT173UseCase;
    }

    @GetMapping
    public ResponseEntity<List<CatalogT173>> getAllCatalogT173() {
        return ResponseEntity.ok().body(catalogT173UseCase.getAllCatalogT173());
    }
}
