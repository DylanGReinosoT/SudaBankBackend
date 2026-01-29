package com.sudamericano.bank.infrastructure.controller.structure.L;

import com.sudamericano.bank.domain.model.structure.L.StructureL01Dto;
import com.sudamericano.bank.domain.ports.inputs.structure.L.L01UseCase;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Tag(name = "Structure L01", description = "Structure L01 management endpoints")
@RestController
@RequestMapping("/api/structures/l01")
public class L01Controller {
    private final L01UseCase l01UseCase;

    public L01Controller(L01UseCase l01UseCase) {
        this.l01UseCase = l01UseCase;
    }

    @GetMapping
    public List<StructureL01Dto> getAll() {
        return l01UseCase.findAll();
    }

    @PostMapping("/search")
    public List<StructureL01Dto> search(@RequestBody StructureL01Dto filterRequest) {
        return l01UseCase.findByFilter(filterRequest);
    }

    @GetMapping("/{id}")
    public StructureL01Dto getById(@PathVariable Integer id) {
        return l01UseCase.findById(id);
    }

    @PostMapping
    public StructureL01Dto create(@RequestBody StructureL01Dto dto) {
        return l01UseCase.create(dto);
    }

    @PutMapping("/{id}")
    public StructureL01Dto update(@PathVariable Integer id, @RequestBody StructureL01Dto dto) {
        return l01UseCase.update(id, dto);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id) {
        l01UseCase.delete(id);
    }
}
