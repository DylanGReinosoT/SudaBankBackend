package com.sudamericano.bank.infrastructure.controller.catalog;

import com.sudamericano.bank.domain.model.catalog.T2Dto;
import com.sudamericano.bank.domain.ports.inputs.catalog.T2UseCase;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Tag(name = "Catalog T2", description = "Catalog T2 management endpoints")
@RestController
@RequestMapping("/api/catalogs/t2")
public class T2Controller {

    private final T2UseCase useCase;

    public T2Controller(T2UseCase useCase) {
        this.useCase = useCase;
    }

    @GetMapping
    public ResponseEntity<List<T2Dto>> getAll() {
        return ResponseEntity.ok().body(useCase.findAll());
    }
}
