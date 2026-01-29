package com.sudamericano.bank.infrastructure.controller.catalog;

import com.sudamericano.bank.domain.model.catalog.CatalogT73;
import com.sudamericano.bank.domain.ports.inputs.catalog.CatalogT73UseCase;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Tag(name = "Catalog T73", description = "Catalog T73 management endpoints")
@RestController
@RequestMapping("/api/catalogs/t73")
public class CatalogT73Controller {
    private final CatalogT73UseCase catalogT73UseCase;

    public CatalogT73Controller(CatalogT73UseCase catalogT73UseCase) {
        this.catalogT73UseCase = catalogT73UseCase;
    }

    @GetMapping
    public ResponseEntity<List<CatalogT73>> getAllCatalogT73() {
        return ResponseEntity.ok().body(catalogT73UseCase.getAllCatalogT73());
    }
}
