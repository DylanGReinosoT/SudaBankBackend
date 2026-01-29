package com.sudamericano.bank.infrastructure.controller.catalog;

import com.sudamericano.bank.domain.model.catalog.T36_6Dto;
import com.sudamericano.bank.domain.ports.inputs.catalog.T36_6UseCase;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Tag(name = "Catalog T36_6", description = "Endpoints for managing T36_6 catalog")
@RestController
@RequestMapping("/api/catalogs/t36_6")
public class T36_6Controller {

    private final T36_6UseCase useCase;

    public T36_6Controller(T36_6UseCase useCase) {
        this.useCase = useCase;
    }

    @GetMapping
    public ResponseEntity<List<T36_6Dto>> getAll() {
        return ResponseEntity.ok().body(useCase.findAll());
    }
}
