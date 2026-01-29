package com.sudamericano.bank.infrastructure.controller.catalog;

import com.sudamericano.bank.domain.model.catalog.T41_ADto;
import com.sudamericano.bank.domain.ports.inputs.catalog.T41_AUseCase;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Tag(name = "Catalog T41_A", description = "Catalog T41_A management endpoints")
@RestController
@RequestMapping("/api/catalogs/t41_A")
public class T41_AController {
    private final T41_AUseCase useCase;

    public T41_AController(T41_AUseCase useCase) {
        this.useCase = useCase;
    }

    @GetMapping
    public ResponseEntity<List<T41_ADto>> getAll() {
        return ResponseEntity.ok().body(useCase.findAll());
    }
}
