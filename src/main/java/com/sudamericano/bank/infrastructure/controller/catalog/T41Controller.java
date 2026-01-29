package com.sudamericano.bank.infrastructure.controller.catalog;

import com.sudamericano.bank.domain.model.catalog.T41Dto;
import com.sudamericano.bank.domain.ports.inputs.catalog.T41UseCase;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Tag(name = "Catalog T41", description = "Catalog T41 management endpoints")
@RestController
@RequestMapping("/api/catalogs/t41")
public class T41Controller {
    private final T41UseCase useCase;

    public T41Controller(T41UseCase useCase) {
        this.useCase = useCase;
    }

    @GetMapping
    public ResponseEntity<List<T41Dto>> getAll(){
        return ResponseEntity.ok().body(useCase.findAll());
    }
}
