package com.sudamericano.bank.infrastructure.controller.catalog;

import com.sudamericano.bank.domain.model.catalog.T45Dto;
import com.sudamericano.bank.domain.ports.inputs.catalog.T45UseCase;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Tag(name = "Catalog T45", description = "Catalog T45 management endpoints")
@RestController
@RequestMapping("/api/catalogs/t45")
public class T45Controller {
    private final T45UseCase useCase;

    public T45Controller(T45UseCase useCase) {
        this.useCase = useCase;
    }

    @GetMapping
    public ResponseEntity<List<T45Dto>> getAll() {
        return ResponseEntity.ok().body(useCase.findAll());
    }
}
