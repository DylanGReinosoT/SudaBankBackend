package com.sudamericano.bank.infrastructure.controller.catalog;

import com.sudamericano.bank.domain.model.catalog.T170Dto;
import com.sudamericano.bank.domain.ports.inputs.catalog.T170UseCase;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Tag(name = "Catalog T170", description = "Catalog T170 management endpoints")
@RestController
@RequestMapping("/api/catalogs/t170")
public class T170Controller {
    private final T170UseCase useCase;

    public T170Controller(T170UseCase useCase) {
        this.useCase = useCase;
    }

    @GetMapping
    public List<T170Dto> getAll() {
        return useCase.findAll();
    }

    @GetMapping("/{id}")
    public T170Dto getById(@PathVariable Integer id) {
        return useCase.findById(id);
    }
}
