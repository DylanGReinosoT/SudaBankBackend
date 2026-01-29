package com.sudamericano.bank.infrastructure.controller.catalog;

import com.sudamericano.bank.domain.model.catalog.T25Dto;
import com.sudamericano.bank.domain.ports.inputs.catalog.T25UseCase;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Tag(name = "Catalog T25", description = "Catalog T25 management endpoints")
@RestController
@RequestMapping("/api/catalogs/t25")
public class T25Controller {
    private final T25UseCase useCase;

    public T25Controller(T25UseCase useCase) {
        this.useCase = useCase;
    }

    @GetMapping
    public ResponseEntity<List<T25Dto>> getAll() {
        return ResponseEntity.ok().body(useCase.findAll());
    }

}
