package com.sudamericano.bank.infrastructure.controller.catalog;

import com.sudamericano.bank.domain.model.catalog.T79Dto;
import com.sudamericano.bank.domain.ports.inputs.catalog.T79UseCase;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Tag(name = "Catalog T79", description = "Catalog T79 management endpoints")
@RestController
@RequestMapping("/api/catalogs/t79")
public class T79Controller {
    private final T79UseCase useCase;

    public T79Controller(T79UseCase useCase) {
        this.useCase = useCase;
    }

    @GetMapping
    public List<T79Dto> getAll() {
        return useCase.findAll();
    }

    @GetMapping("/{id}")
    public T79Dto getById(@PathVariable Integer id) {
        return useCase.findById(id);
    }
}
