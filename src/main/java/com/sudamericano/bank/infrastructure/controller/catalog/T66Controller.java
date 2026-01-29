package com.sudamericano.bank.infrastructure.controller.catalog;

import com.sudamericano.bank.domain.model.catalog.T66Dto;
import com.sudamericano.bank.domain.ports.inputs.catalog.T66UseCase;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Tag(name = "Catalog T66", description = "Catalog T66 management endpoints")
@RestController
@RequestMapping("/api/catalogs/t66")
public class T66Controller {
    private final T66UseCase useCase;

    public T66Controller(T66UseCase useCase) {
        this.useCase = useCase;
    }

    @GetMapping
    public ResponseEntity<List<T66Dto>> getAll() {
        return ResponseEntity.ok().body(useCase.findAll());
    }
}
