package com.sudamericano.bank.infrastructure.controller.catalog;

import com.sudamericano.bank.domain.model.catalog.T31Dto;
import com.sudamericano.bank.domain.ports.inputs.catalog.T31UseCase;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Tag(name = "Catalog T31", description = "Catalog T31 management endpoints")
@RestController
@RequestMapping("/api/catalogs/t31")
public class T31Controller {

    private final T31UseCase useCase;

    public T31Controller(T31UseCase useCase) {
        this.useCase = useCase;
    }

    @GetMapping
    public ResponseEntity<List<T31Dto>> getAll() {
        return ResponseEntity.ok().body(useCase.findAll());
    }
}
