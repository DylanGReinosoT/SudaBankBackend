package com.sudamericano.bank.infrastructure.controller.catalog;

import com.sudamericano.bank.domain.model.catalog.T43Dto;
import com.sudamericano.bank.domain.ports.inputs.catalog.T43UseCase;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Tag(name = "Catalog T43", description = "Catalog T43 management endpoints")
@RestController
@RequestMapping("/api/catalogs/t43")
public class T43Controller {
    private final T43UseCase useCase;

    public T43Controller(T43UseCase useCase) {
        this.useCase = useCase;
    }

    @GetMapping
    public ResponseEntity<List<T43Dto>> getAllT43() {
        return ResponseEntity.ok().body(useCase.findAll());
    }
}
