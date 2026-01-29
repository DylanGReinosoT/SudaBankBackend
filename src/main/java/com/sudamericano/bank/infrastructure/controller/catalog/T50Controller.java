package com.sudamericano.bank.infrastructure.controller.catalog;

import com.sudamericano.bank.domain.model.catalog.T50Dto;
import com.sudamericano.bank.domain.ports.inputs.catalog.T50UseCase;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Tag(name = "Catalog T50", description = "Catalog T50 management endpoints")
@RestController
@RequestMapping("/api/catalogs/t50")
public class T50Controller {
    private final T50UseCase useCase;

    public T50Controller(T50UseCase useCase) {
        this.useCase = useCase;
    }

    @GetMapping
    public ResponseEntity<List<T50Dto>> getAll() {
        return ResponseEntity.ok().body(useCase.findAll());
    }
}
