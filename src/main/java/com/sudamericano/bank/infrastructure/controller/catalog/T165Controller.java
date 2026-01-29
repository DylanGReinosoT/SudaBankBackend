package com.sudamericano.bank.infrastructure.controller.catalog;

import com.sudamericano.bank.domain.model.catalog.T165Dto;
import com.sudamericano.bank.domain.ports.inputs.catalog.T165UseCase;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Tag(name = "Catalog T165", description = "Catalog T165 management endpoints")
@RestController
@RequestMapping("/api/catalogs/t165")
public class T165Controller {
    private final T165UseCase useCase;

    public T165Controller(T165UseCase useCase) {
        this.useCase = useCase;
    }

    @GetMapping
    public List<T165Dto> getAll() {
        return useCase.findAll();
    }

    @GetMapping("/{id}")
    public T165Dto getById(@PathVariable Integer id) {
        return useCase.findById(id);
    }
}
