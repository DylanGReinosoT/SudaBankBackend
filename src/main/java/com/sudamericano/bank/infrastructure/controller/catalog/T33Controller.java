package com.sudamericano.bank.infrastructure.controller.catalog;

import com.sudamericano.bank.domain.model.catalog.T33Dto;
import com.sudamericano.bank.domain.ports.inputs.catalog.T33UseCase;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Tag(name = "Catalog T33", description = "Catalog T33 management endpoints")
@RestController
@RequestMapping("/api/catalogs/t33")
public class T33Controller {
    private final T33UseCase useCase;

    public T33Controller(T33UseCase useCase) {
        this.useCase = useCase;
    }

    @GetMapping
    public ResponseEntity<List<T33Dto>> getAll() {
        return ResponseEntity.ok().body(useCase.findAll());
    }
}
