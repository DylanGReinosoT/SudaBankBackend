package com.sudamericano.bank.infrastructure.controller.catalog;

import com.sudamericano.bank.domain.model.catalog.T172Dto;
import com.sudamericano.bank.domain.ports.inputs.catalog.T172UseCase;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Tag(name = "Catalog T172", description = "Catalog T172 management endpoints")
@RestController
@RequestMapping("/api/catalogs/t172")
public class T172Controller {
    private final T172UseCase useCase;

    public T172Controller(T172UseCase useCase) {
        this.useCase = useCase;
    }

    @GetMapping
    public ResponseEntity<List<T172Dto>> getAll() {
        return ResponseEntity.ok().body(useCase.findAll());
    }
}
