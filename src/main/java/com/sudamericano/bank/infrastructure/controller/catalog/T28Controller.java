package com.sudamericano.bank.infrastructure.controller.catalog;

import com.sudamericano.bank.domain.model.catalog.T28Dto;
import com.sudamericano.bank.domain.ports.inputs.catalog.T28UseCase;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Tag(name = "Catalog T28", description = "Endpoints para gestionar T28")
@RestController
@RequestMapping("/api/catalogs/t28")
public class T28Controller {

    private final T28UseCase useCase;

    public T28Controller(T28UseCase useCase) {
        this.useCase = useCase;
    }

    @GetMapping
    public ResponseEntity<List<T28Dto>> getAll() {
        return ResponseEntity.ok().body(useCase.findAll());
    }

}
