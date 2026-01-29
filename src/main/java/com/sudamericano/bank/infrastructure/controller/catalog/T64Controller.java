package com.sudamericano.bank.infrastructure.controller.catalog;

import com.sudamericano.bank.domain.model.catalog.T64Dto;
import com.sudamericano.bank.domain.ports.inputs.catalog.T64UseCase;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Tag(name = "Catalog T64", description = "Catalog T64 management endpoints")
@RestController
@RequestMapping("/api/catalogs/t64")
public class T64Controller {
    private final T64UseCase useCase;

    public T64Controller(T64UseCase useCase) {
        this.useCase = useCase;
    }

    @GetMapping
    public List<T64Dto> getAll() {
        return useCase.findAll();
    }

    @GetMapping("/{id}")
    public T64Dto getById(@PathVariable Integer id) {
        return useCase.findById(id);
    }

    @PostMapping
    public T64Dto create(@RequestBody T64Dto dto) {
        return useCase.create(dto);
    }

    @PutMapping("/{id}")
    public T64Dto update(@PathVariable Integer id, @RequestBody T64Dto dto) {
        return useCase.update(id, dto);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id) {
        useCase.delete(id);
    }
}
