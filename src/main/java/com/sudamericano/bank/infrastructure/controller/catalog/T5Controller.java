package com.sudamericano.bank.infrastructure.controller.catalog;

import com.sudamericano.bank.domain.model.catalog.T5Dto;
import com.sudamericano.bank.domain.ports.inputs.catalog.T5UseCase;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Tag(name = "Catalog T5", description = "Catalog T5 management endpoints")
@RestController
@RequestMapping("/api/catalogs/t5")
public class T5Controller {
    private final T5UseCase useCase;

    public T5Controller(T5UseCase useCase) {
        this.useCase = useCase;
    }

    @GetMapping
    public ResponseEntity<List<T5Dto>> getAll() {
        return ResponseEntity.ok().body(useCase.findAll());
    }
}
