package com.sudamericano.bank.infrastructure.controller.catalog;

import com.sudamericano.bank.domain.model.catalog.T69Dto;
import com.sudamericano.bank.domain.ports.inputs.catalog.T69UseCase;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Tag(name = "Catalog T69", description = "Catalog T69 management endpoints")
@RestController
@RequestMapping("/api/catalogs/t69")
public class T69Controller {
    private final T69UseCase useCase;

    public T69Controller(T69UseCase useCase) {
        this.useCase = useCase;
    }

    @GetMapping
    public List<T69Dto> getAll() {
        return useCase.findAll();
    }

    @GetMapping("/{id}")
    public T69Dto getById(@PathVariable Integer id) {
        return useCase.findById(id);
    }
}
