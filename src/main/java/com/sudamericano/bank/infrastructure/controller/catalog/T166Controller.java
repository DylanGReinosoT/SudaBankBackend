package com.sudamericano.bank.infrastructure.controller.catalog;

import com.sudamericano.bank.domain.model.catalog.T166Dto;
import com.sudamericano.bank.domain.ports.inputs.catalog.T166UseCase;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Tag(name = "Catalog T166", description = "Catalog T166 management endpoints")
@RestController
@RequestMapping("/api/catalogs/t166")
public class T166Controller {
    private final T166UseCase useCase;

    public T166Controller(T166UseCase useCase) {
        this.useCase = useCase;
    }

    @GetMapping
    public List<T166Dto> getAll() {
        return useCase.findAll();
    }

    @GetMapping("/{id}")
    public T166Dto getById(@PathVariable Integer id) {
        return useCase.findById(id);
    }
}
