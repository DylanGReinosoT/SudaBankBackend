package com.sudamericano.bank.infrastructure.controller.catalog;

import com.sudamericano.bank.domain.model.catalog.T9Dto;
import com.sudamericano.bank.domain.ports.inputs.catalog.T9UseCase;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Tag(name ="Catalog T9", description = "Controller for Catalog T9 operations")
@RestController
@RequestMapping("/api/catalogs/T9")
public class T9Controller {
    private final T9UseCase useCase;

    public T9Controller(T9UseCase useCase) {
        this.useCase = useCase;
    }

    @GetMapping
    public ResponseEntity<List<T9Dto>> getAll(){
        return ResponseEntity.ok().body(useCase.findAll());
    }
}
