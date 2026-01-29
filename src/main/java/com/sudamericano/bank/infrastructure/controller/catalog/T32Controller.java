package com.sudamericano.bank.infrastructure.controller.catalog;

import com.sudamericano.bank.domain.model.catalog.T32Dto;
import com.sudamericano.bank.domain.ports.inputs.catalog.T32UseCase;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Tag(name = "T32", description = "Endpoints for T32 catalog")
@RestController
@RequestMapping("/api/catalogs/t32")
public class T32Controller {

    private final T32UseCase useCase;

    public T32Controller(T32UseCase useCase) {
        this.useCase = useCase;
    }

    @GetMapping
    public ResponseEntity<List<T32Dto>> getAll() {
        return ResponseEntity.ok().body(useCase.findAll());
    }

}
