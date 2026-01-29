package com.sudamericano.bank.infrastructure.controller.catalog;

import com.sudamericano.bank.domain.model.catalog.T207Dto;
import com.sudamericano.bank.domain.ports.inputs.catalog.T207UseCase;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Tag(name= "Catalog T207", description = "Catalog T207 management endpoints")
@RestController
@RequestMapping("/api/catalogs/t207")
public class T207Controller {

    private T207UseCase useCase;

    public T207Controller(T207UseCase useCase) {
        this.useCase = useCase;
    }

    @GetMapping
    public ResponseEntity<List<T207Dto>> getAll() {
        return ResponseEntity.ok().body(useCase.findAll());
    }
}
