package com.sudamericano.bank.infrastructure.controller.catalog;

import com.sudamericano.bank.domain.model.catalog.T214Dto;
import com.sudamericano.bank.domain.ports.inputs.catalog.T214UseCase;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Tag(name = "Catalog T214", description = "Catalog T214 management endpoints")
@RestController
@RequestMapping("/api/catalogs/t214")
public class T214Controller {
    private final T214UseCase useCase;

    public T214Controller(T214UseCase useCase) {
        this.useCase = useCase;
    }

    @GetMapping
    public ResponseEntity<List<T214Dto>> getAll() {
        return ResponseEntity.ok().body(useCase.findAll());
    }
}
