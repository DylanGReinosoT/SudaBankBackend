package com.sudamericano.bank.infrastructure.controller.catalog;

import com.sudamericano.bank.domain.model.catalog.T212Dto;
import com.sudamericano.bank.domain.ports.inputs.catalog.T212UseCase;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Tag(name = "Catalog T212", description = "Catalog T212 management endpoints")
@RestController
@RequestMapping("/api/catalogs/t212")
public class T212Controller {
    private final T212UseCase useCase;

    public T212Controller(T212UseCase useCase) {
        this.useCase = useCase;
    }

    @GetMapping
    public ResponseEntity<List<T212Dto>> getAll() {
        return ResponseEntity.ok().body(useCase.findAll());
    }
}
