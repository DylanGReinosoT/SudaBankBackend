package com.sudamericano.bank.infrastructure.controller.catalog;

import com.sudamericano.bank.domain.model.catalog.T42Dto;
import com.sudamericano.bank.domain.ports.inputs.catalog.T42UseCase;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Tag(name = "Catalog T42", description = "Catalog T42 management endpoints")
@RestController
@RequestMapping("/api/catalogs/t42")
public class T42Controller {
    private final T42UseCase useCase;

    public T42Controller(T42UseCase useCase) {
        this.useCase = useCase;
    }

    @GetMapping
    public ResponseEntity<List<T42Dto>> getAllT42() {
        return ResponseEntity.ok().body(useCase.findAll());
    }
}
