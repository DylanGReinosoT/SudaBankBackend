package com.sudamericano.bank.infrastructure.controller.catalog;

import com.sudamericano.bank.domain.model.catalog.T7Dto;
import com.sudamericano.bank.domain.ports.inputs.catalog.T7UseCase;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Tag(name = "Catalog T7", description = "Catalog T7 management endpoints")
@RestController
@RequestMapping("/api/catalogs/t7")
public class T7Controller {
    private final T7UseCase useCase;

    public T7Controller(T7UseCase useCase) {
        this.useCase = useCase;
    }

    @GetMapping
    public ResponseEntity<List<T7Dto>> getAll() {
        return ResponseEntity.ok().body(useCase.findAll());
    }
}
