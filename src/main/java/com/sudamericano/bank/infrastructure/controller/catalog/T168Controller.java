package com.sudamericano.bank.infrastructure.controller.catalog;

import com.sudamericano.bank.domain.model.catalog.T168Dto;
import com.sudamericano.bank.domain.ports.inputs.catalog.T168UseCase;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Tag(name = "Catalog T168", description = "Catalog T168 management endpoints")
@RestController
@RequestMapping("/api/catalogs/t168")
public class T168Controller {
    private final T168UseCase useCase;

    public T168Controller(T168UseCase useCase) {
        this.useCase = useCase;
    }

    @GetMapping
    public List<T168Dto> getAll() {
        return useCase.findAll();
    }

    @GetMapping("/{id}")
    public T168Dto getById(@PathVariable Integer id) {
        return useCase.findById(id);
    }
}
