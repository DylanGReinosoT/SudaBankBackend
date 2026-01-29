package com.sudamericano.bank.infrastructure.controller.catalog;

import com.sudamericano.bank.domain.model.catalog.CatalogT317;
import com.sudamericano.bank.domain.ports.inputs.catalog.CatalogT317UseCase;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Tag(name = "Catalog T317", description = "Catalog T317 management endpoints")
@RestController
@RequestMapping("/api/catalogs/t317")
public class CatalogT317Controller {
    private final CatalogT317UseCase catalogT317UseCase;

    public CatalogT317Controller(CatalogT317UseCase catalogT317UseCase) {
        this.catalogT317UseCase = catalogT317UseCase;
    }

    @GetMapping
    public ResponseEntity<List<CatalogT317>> getAllCatalogT317() {
        return ResponseEntity.ok().body(catalogT317UseCase.getAllCatalogT317());
    }
}