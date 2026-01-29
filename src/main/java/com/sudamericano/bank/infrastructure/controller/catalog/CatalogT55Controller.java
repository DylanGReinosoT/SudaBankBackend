package com.sudamericano.bank.infrastructure.controller.catalog;

import com.sudamericano.bank.domain.model.catalog.CatalogT55;
import com.sudamericano.bank.domain.ports.inputs.catalog.CatalogT55UseCase;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Tag(name = "Catalog T55", description = "Catalog T55 management endpoints")
@RestController
@RequestMapping("/api/catalogs/t55")
public class CatalogT55Controller {
    private final CatalogT55UseCase catalogT55UseCase;

    public CatalogT55Controller(CatalogT55UseCase catalogT55UseCase) {
        this.catalogT55UseCase = catalogT55UseCase;
    }

    @GetMapping
    public ResponseEntity<List<CatalogT55>> getAllCatalogT55() {
        return ResponseEntity.ok().body(catalogT55UseCase.getAllCatalogT55());
    }
}
