package com.sudamericano.bank.infrastructure.controller.catalog;

import com.sudamericano.bank.domain.model.catalog.T6Dto;
import com.sudamericano.bank.domain.ports.inputs.catalog.T6UseCase;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Tag(name = "Catalog T6", description = "Catalog T6 management endpoints")
@RestController
@RequestMapping("/api/catalogs/t6")
public class T6Controller {
    private final T6UseCase useCase;

    public T6Controller(T6UseCase useCase) {
        this.useCase = useCase;
    }

    @GetMapping
    public ResponseEntity<List<T6Dto>> getAll() {
        return ResponseEntity.ok().body(useCase.findAll());
    }
}
