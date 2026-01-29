package com.sudamericano.bank.infrastructure.controller.catalog;

import com.sudamericano.bank.domain.model.catalog.T44Dto;
import com.sudamericano.bank.domain.ports.inputs.catalog.T44UseCase;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Tag(name = "Catalog T44", description = "Catalog T44 management endpoints")
@RestController
@RequestMapping("/api/catalogs/t44")
public class T44Controller {
    private final T44UseCase useCase;

    public T44Controller(T44UseCase useCase) {
        this.useCase = useCase;
    }

    @GetMapping
    public ResponseEntity<List<T44Dto>> getAllT44() {
        return ResponseEntity.ok().body(useCase.findAll());
    }
}
