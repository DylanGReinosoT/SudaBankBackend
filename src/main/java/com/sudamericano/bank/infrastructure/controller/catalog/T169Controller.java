package com.sudamericano.bank.infrastructure.controller.catalog;

import com.sudamericano.bank.domain.model.catalog.T169Dto;
import com.sudamericano.bank.domain.ports.inputs.catalog.T169UseCase;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Tag(name = "Catalog T169", description = "Catalog T169 management endpoints")
@RestController
@RequestMapping("/api/catalogs/t169")
public class T169Controller {
    private final T169UseCase useCase;

    public T169Controller(T169UseCase useCase) {
        this.useCase = useCase;
    }

    @GetMapping
    public List<T169Dto> getAll() {
        return useCase.findAll();
    }

    @GetMapping("/{id}")
    public T169Dto getById(@PathVariable Integer id) {
        return useCase.findById(id);
    }
}
