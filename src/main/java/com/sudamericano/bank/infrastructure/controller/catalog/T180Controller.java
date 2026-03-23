package com.sudamericano.bank.infrastructure.controller.catalog;

import com.sudamericano.bank.domain.model.catalog.T180Dto;
import com.sudamericano.bank.domain.ports.inputs.catalog.T180UseCase;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Tag(name = "Catalog T180", description = "Catalog T180 management endpoints")
@RestController
@RequestMapping("/api/catalogs/t180")
public class T180Controller {
    private final T180UseCase useCase;

    private T180Controller(T180UseCase useCase) {
        this.useCase = useCase;
    }

    @GetMapping
    public ResponseEntity<List<T180Dto>> getAll() {
        return ResponseEntity.ok().body(useCase.findAll());
    }
}
