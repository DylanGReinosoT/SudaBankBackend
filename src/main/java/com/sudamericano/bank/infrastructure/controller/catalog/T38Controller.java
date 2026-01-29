package com.sudamericano.bank.infrastructure.controller.catalog;

import com.sudamericano.bank.domain.model.catalog.T38Dto;
import com.sudamericano.bank.domain.ports.inputs.catalog.T38UseCase;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Tag(name = "Catalog T38", description = "Catalog T38 management endpoints")
@RestController
@RequestMapping("/api/catalogs/t38")
public class T38Controller {
    private final T38UseCase useCase;

    public T38Controller(T38UseCase useCase) {
        this.useCase = useCase;
    }

    @GetMapping
    public ResponseEntity<List<T38Dto>> getAll() {
        return ResponseEntity.ok().body(useCase.findAll());
    }

}
