package com.sudamericano.bank.infrastructure.controller.catalog;

import com.sudamericano.bank.domain.model.catalog.T32_ADto;
import com.sudamericano.bank.domain.ports.inputs.catalog.T32_AUseCase;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Tag(name = "T32_A", description = "Endpoints for T32_A catalog")
@RestController
@RequestMapping("/api/catalogs/t32_A")
public class T32_AController {

    private final T32_AUseCase useCase;

    public T32_AController(T32_AUseCase useCase) {
        this.useCase = useCase;
    }

    @GetMapping
    public ResponseEntity<List<T32_ADto>> getAll() {
        return ResponseEntity.ok().body(useCase.findAll());
    }

}
