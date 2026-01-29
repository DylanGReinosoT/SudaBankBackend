package com.sudamericano.bank.infrastructure.controller.catalog;

import com.sudamericano.bank.domain.model.catalog.T208Dto;
import com.sudamericano.bank.domain.ports.inputs.catalog.T208UseCase;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Tag(name = "Catalog T208", description = "Catalog T208 management endpoints")
@RestController
@RequestMapping("/api/catalogs/t208")
public class T208Controller {
    private final T208UseCase useCase;

    public T208Controller(T208UseCase useCase) {
        this.useCase = useCase;
    }

    @GetMapping
    public ResponseEntity<List<T208Dto>> getAll(){
        return ResponseEntity.ok().body(useCase.findAll());
    }
}
