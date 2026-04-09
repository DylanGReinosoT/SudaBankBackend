package com.sudamericano.bank.infrastructure.controller.catalog;

import com.sudamericano.bank.domain.model.catalog.T75Dto;
import com.sudamericano.bank.domain.ports.inputs.catalog.T75UseCase;
import io.swagger.v3.oas.annotations.tags.Tag;
import jdk.dynalink.linker.LinkerServices;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Tag(name = "Catalog T75", description = "Catalog T75 management endpoints")
@RestController
@RequestMapping("/api/catalogs/t75")
public class T75Controller {
    private final T75UseCase useCase;

    public T75Controller(T75UseCase useCase) {
        this.useCase = useCase;
    }

    @GetMapping
    public ResponseEntity<List<T75Dto>> getAll() {
        return ResponseEntity.ok().body(useCase.findAll());
    }
}
