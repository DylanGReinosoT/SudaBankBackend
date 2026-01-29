package com.sudamericano.bank.infrastructure.controller.catalog;

import com.sudamericano.bank.domain.model.catalog.T59Dto;
import com.sudamericano.bank.domain.ports.inputs.catalog.T59UseCase;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Tag(name = "Catalog T59", description = "Catalog T59 management endpoints")
@RestController
@RequestMapping("/api/catalogs/t59")
public class T59Controller {
    private final T59UseCase useCase;

    public T59Controller(T59UseCase useCase) {
        this.useCase = useCase;
    }

    @GetMapping
    public List<T59Dto> getAll() {
        return useCase.findAll();
    }

    @GetMapping("/{id}")
    public T59Dto getById(@PathVariable Integer id) {
        return useCase.findById(id);
    }
}
