package com.sudamericano.bank.infrastructure.controller.catalog;

import com.sudamericano.bank.domain.model.catalog.T167Dto;
import com.sudamericano.bank.domain.ports.inputs.catalog.T167UseCase;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Tag(name = "Catalog T167", description = "Catalog T167 management endpoints")
@RestController
@RequestMapping("/api/catalogs/t167")
public class T167Controller {
    private final T167UseCase useCase;

    public T167Controller(T167UseCase useCase) {
        this.useCase = useCase;
    }

    @GetMapping
    public List<T167Dto> getAll() {
        return useCase.findAll();
    }

    @GetMapping("/{id}")
    public T167Dto getById(@PathVariable Integer id) {
        return useCase.findById(id);
    }
}
