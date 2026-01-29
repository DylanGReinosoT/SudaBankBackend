package com.sudamericano.bank.infrastructure.controller.catalog;

import com.sudamericano.bank.domain.model.catalog.T62ADto;
import com.sudamericano.bank.domain.ports.inputs.catalog.T62AUseCase;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Tag(name = "Catalog T62A", description = "Catalog T62A management endpoints")
@RestController
@RequestMapping("/api/catalogs/t62a")
public class T62AController {
    private final T62AUseCase useCase;

    public T62AController(T62AUseCase useCase) {
        this.useCase = useCase;
    }

    @GetMapping
    public List<T62ADto> getAll() {
        return useCase.findAll();
    }

    @GetMapping("/{id}")
    public T62ADto getById(@PathVariable Integer id) {
        return useCase.findById(id);
    }
}
