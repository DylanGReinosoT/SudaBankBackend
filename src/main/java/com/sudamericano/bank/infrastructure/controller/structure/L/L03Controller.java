package com.sudamericano.bank.infrastructure.controller.structure.L;

import com.sudamericano.bank.domain.model.structure.L.L03Dto;
import com.sudamericano.bank.domain.model.structure.L.L03ViewDto;
import com.sudamericano.bank.domain.ports.inputs.structure.L.L03UseCase;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Tag(name = "Structure L03", description = "Structure L03 management endpoints")
@RestController
@RequestMapping("/api/structures/l03")
public class L03Controller {
    private final L03UseCase useCase;

    public L03Controller(L03UseCase useCase) {
        this.useCase = useCase;
    }

    @GetMapping
    public List<L03Dto> getAll() {
        return useCase.findAll();
    }

    @GetMapping("/details")
    public List<L03ViewDto> getAllWithDetails() {
        return useCase.findAllResumenDatosL03();
    }

    @GetMapping("/{id}")
    public L03Dto getById(@PathVariable Long id) {
        return useCase.findById(id);
    }

    @PostMapping
    public L03Dto create(@RequestBody L03Dto dto) {
        return useCase.create(dto);
    }

    @PutMapping("/{id}")
    public L03Dto update(@PathVariable Long id, @RequestBody L03Dto dto) {
        return useCase.update(id, dto);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        useCase.delete(id);
    }
}
