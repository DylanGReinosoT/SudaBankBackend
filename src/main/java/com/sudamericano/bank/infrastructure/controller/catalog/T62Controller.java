package com.sudamericano.bank.infrastructure.controller.catalog;

import com.sudamericano.bank.domain.model.catalog.T62Dto;
import com.sudamericano.bank.domain.ports.inputs.catalog.T62UseCase;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Tag(name = "Catalog T62", description = "Catalog T62 management endpoints")
@RestController
@RequestMapping("/api/catalogs/t62")
public class T62Controller {
    private final T62UseCase useCase;

    public T62Controller(T62UseCase useCase) {
        this.useCase = useCase;
    }

    @GetMapping
    public ResponseEntity<List<T62Dto>> getAll() {
        return ResponseEntity.ok().body(useCase.findAll());
    }
}
