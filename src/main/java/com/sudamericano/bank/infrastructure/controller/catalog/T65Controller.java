package com.sudamericano.bank.infrastructure.controller.catalog;

import com.sudamericano.bank.domain.model.catalog.T65Dto;
import com.sudamericano.bank.domain.ports.inputs.catalog.T65UseCase;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Tag(name = "Catalog T65", description = "Catalog T65 management endpoints")
@RestController
@RequestMapping("/api/catalogs/t65")
public class T65Controller {
    private final T65UseCase useCase;

    public T65Controller(T65UseCase useCase) {
        this.useCase = useCase;
    }

    @GetMapping
    public ResponseEntity<List<T65Dto>> getAll() {
        return ResponseEntity.ok().body(useCase.findAll());
    }
}
