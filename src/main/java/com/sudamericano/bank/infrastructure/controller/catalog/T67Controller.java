package com.sudamericano.bank.infrastructure.controller.catalog;

import com.sudamericano.bank.domain.model.catalog.T67Dto;
import com.sudamericano.bank.domain.ports.inputs.catalog.T67UseCase;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Tag(name = "Catalog T67", description = "Catalog T67 management endpoints")
@RestController
@RequestMapping("/api/catalogs/t67")
public class T67Controller {
    private final T67UseCase useCase;

    public T67Controller(T67UseCase useCase) {
        this.useCase = useCase;
    }

    @GetMapping
    public List<T67Dto> getAll() {
        return useCase.findAll();
    }

    @GetMapping("/{id}")
    public T67Dto getById(@PathVariable Integer id) {
        return useCase.findById(id);
    }
}
