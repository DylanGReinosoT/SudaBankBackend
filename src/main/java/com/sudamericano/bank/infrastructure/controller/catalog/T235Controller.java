package com.sudamericano.bank.infrastructure.controller.catalog;

import com.sudamericano.bank.domain.model.catalog.T235Dto;
import com.sudamericano.bank.domain.ports.inputs.catalog.T235UseCase;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Tag(name = "T235", description = "Endpoints for T235 management")
@RestController
@RequestMapping("/api/catalogs/t235")
public class T235Controller {
    public T235UseCase useCase;

    public T235Controller(T235UseCase useCase) {
        this.useCase = useCase;
    }

    @GetMapping
    public ResponseEntity<List<T235Dto>> getAll() {
        return ResponseEntity.ok().body(useCase.findAll());
    }
}
