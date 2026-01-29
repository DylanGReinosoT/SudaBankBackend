package com.sudamericano.bank.infrastructure.controller.catalog;

import com.sudamericano.bank.domain.model.catalog.T70Dto;
import com.sudamericano.bank.domain.ports.inputs.catalog.T70UseCase;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Tag(name = "Catalog T70", description = "Catalog T70 management endpoints")
@RestController
@RequestMapping("/api/catalogs/t70")
public class T70Controller {
    private final T70UseCase useCase;

    public T70Controller(T70UseCase useCase) {
        this.useCase = useCase;
    }

    @GetMapping
    public List<T70Dto> getAll() {
        return useCase.findAll();
    }

    @GetMapping("/{id}")
    public T70Dto getById(@PathVariable Integer id) {
        return useCase.findById(id);
    }
}
