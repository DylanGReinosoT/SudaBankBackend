package com.sudamericano.bank.infrastructure.controller.catalog;

import com.sudamericano.bank.domain.model.catalog.T164Dto;
import com.sudamericano.bank.domain.ports.inputs.catalog.T164UseCase;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Tag(name = "Catalog T164", description = "Catalog T164 management endpoints")
@RestController
@RequestMapping("/api/catalogs/t164")
public class T164Controller {
    private final T164UseCase useCase;

    public T164Controller(T164UseCase useCase) {
        this.useCase = useCase;
    }

    @GetMapping
    public List<T164Dto> getAll() {
        return useCase.findAll();
    }

    @GetMapping("/{id}")
    public T164Dto getById(@PathVariable Integer id) {
        return useCase.findById(id);
    }

    @PostMapping
    public T164Dto create(@RequestBody T164Dto dto) {
        return useCase.create(dto);
    }

    @PutMapping("/{id}")
    public T164Dto update(@PathVariable Integer id, @RequestBody T164Dto dto) {
        return useCase.update(id, dto);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id) {
        useCase.delete(id);
    }
}
