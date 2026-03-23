package com.sudamericano.bank.infrastructure.controller.catalog;

import com.sudamericano.bank.domain.model.catalog.T171Dto;
import com.sudamericano.bank.domain.ports.inputs.catalog.T171UseCase;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Tag(name = "Catalog T171", description = "Catalog T171 management endpoints")
@RestController
@RequestMapping("/api/catalogs/t171")
public class T171Controller {

    private final T171UseCase useCase;

    public T171Controller(T171UseCase useCase) {
        this.useCase = useCase;
    }

    @GetMapping
    public ResponseEntity<List<T171Dto>> getAll() {
        return ResponseEntity.ok().body(useCase.findAll());
    }


}
