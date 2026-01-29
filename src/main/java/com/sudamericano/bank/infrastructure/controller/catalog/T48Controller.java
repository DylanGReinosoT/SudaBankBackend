package com.sudamericano.bank.infrastructure.controller.catalog;

import com.sudamericano.bank.domain.model.catalog.T48Dto;
import com.sudamericano.bank.domain.ports.inputs.catalog.T48UseCase;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Tag(name = "Catalog T48", description = "Catalog T48 (Forma de pago) management endpoints")
@RestController
@RequestMapping("/api/catalogs/t48")
public class T48Controller {
    private final T48UseCase useCase;

    public T48Controller(T48UseCase useCase) {
        this.useCase = useCase;
    }

    @GetMapping
    public ResponseEntity<List<T48Dto>> getAll(){
        return ResponseEntity.ok().body(useCase.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<T48Dto> getById(@PathVariable Integer id){
        T48Dto result = useCase.findById(id);
        if (result != null) {
            return ResponseEntity.ok().body(result);
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
