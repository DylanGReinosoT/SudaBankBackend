package com.sudamericano.bank.infrastructure.controller.catalog;

import com.sudamericano.bank.domain.model.catalog.T47Dto;
import com.sudamericano.bank.domain.ports.inputs.catalog.T47UseCase;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Tag(name = "Catalog T47", description = "Catalog T47 management endpoints")
@RestController
@RequestMapping("/api/catalogs/t47")
public class T47Controller {
    private final T47UseCase useCase;

    public T47Controller(T47UseCase useCase) {
        this.useCase = useCase;
    }

    @GetMapping
    public ResponseEntity<List<T47Dto>> getAll(){
        return ResponseEntity.ok().body(useCase.findAll());
    }
}
