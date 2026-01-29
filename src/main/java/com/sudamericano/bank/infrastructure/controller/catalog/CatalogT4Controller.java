package com.sudamericano.bank.infrastructure.controller.catalog;

import com.sudamericano.bank.domain.model.catalog.CatalogT4;
import com.sudamericano.bank.domain.ports.inputs.catalog.CatalogT4UseCase;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Tag(name = "Catalog T4", description = "Catalog T4 management endpoints")
@RestController
@RequestMapping("/api/catalogs/t4")
public class CatalogT4Controller {
    private final CatalogT4UseCase catalogT4UseCase;

    public CatalogT4Controller(CatalogT4UseCase catalogT4UseCase) {
        this.catalogT4UseCase = catalogT4UseCase;
    }

    @GetMapping
    public ResponseEntity<List<CatalogT4>> getAllCatalogT4() {
        return ResponseEntity.ok().body(catalogT4UseCase.getAllCatalogT4());
    }
}
