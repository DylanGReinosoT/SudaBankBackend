package com.sudamericano.bank.infrastructure.controller.catalog;

import com.sudamericano.bank.domain.model.catalog.T68Dto;
import com.sudamericano.bank.domain.ports.inputs.catalog.T68UseCase;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Tag(name = "Catalog T68", description = "Catalog T68 management endpoints")
@RestController
@RequestMapping("/api/catalogs/t68")
public class T68Controller {
    private final T68UseCase useCase;

    public T68Controller(T68UseCase useCase) {
        this.useCase = useCase;
    }

    @GetMapping
    public List<T68Dto> getAll() {
        return useCase.findAll();
    }

    @GetMapping("/{id}")
    public T68Dto getById(@PathVariable Integer id) {
        return useCase.findById(id);
    }
}
