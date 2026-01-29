package com.sudamericano.bank.infrastructure.controller.catalog;

import com.sudamericano.bank.domain.model.catalog.T37Dto;
import com.sudamericano.bank.domain.ports.inputs.catalog.T37UseCase;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Tag(name= "Catalog T37", description = "Catalog T37 management endpoints")
@RestController
@RequestMapping("/api/catalogs/t37")
public class T37Controller {
    private final T37UseCase useCase;

    public T37Controller(T37UseCase useCase) {
        this.useCase = useCase;
    }

    @GetMapping
    public ResponseEntity<List<T37Dto>> getAll() {
        return ResponseEntity.ok().body(useCase.findAll());
    }

}
