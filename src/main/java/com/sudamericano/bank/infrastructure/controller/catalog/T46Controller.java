package com.sudamericano.bank.infrastructure.controller.catalog;

import com.sudamericano.bank.domain.model.catalog.T46Dto;
import com.sudamericano.bank.domain.ports.inputs.catalog.T46UseCase;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Tag(name = "Catalog T46", description = "Catalog T46 management endpoints")
@RestController
@RequestMapping("/api/catalogs/t46")
public class T46Controller {
    private final T46UseCase useCase;

    public T46Controller(T46UseCase useCase) {
        this.useCase = useCase;
    }

    @GetMapping
    public ResponseEntity<List<T46Dto>> getAll() {
        return ResponseEntity.ok().body(useCase.findAll());
    }
}
