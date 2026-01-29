package com.sudamericano.bank.infrastructure.controller.catalog;

import com.sudamericano.bank.domain.model.catalog.CatalogT35;
import com.sudamericano.bank.domain.ports.inputs.catalog.CatalogT35UseCase;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Tag(name = "Catalog T35", description = "Catalog T35 management endpoints")
@RestController
@RequestMapping("/api/catalogs/t35")
public class CatalogT35Controller {
    private final CatalogT35UseCase catalogT35UseCase;

    public CatalogT35Controller(CatalogT35UseCase catalogT35UseCase) {
        this.catalogT35UseCase = catalogT35UseCase;
    }

    @GetMapping
    public ResponseEntity<List<CatalogT35>> getAllCatalogT35() {
        return ResponseEntity.ok().body(catalogT35UseCase.getAllCatalogT35());
    }
}
