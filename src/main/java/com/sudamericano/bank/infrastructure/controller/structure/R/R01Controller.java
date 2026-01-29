package com.sudamericano.bank.infrastructure.controller.structure.R;

import com.sudamericano.bank.domain.model.structure.R.R01Dto;
import com.sudamericano.bank.domain.ports.inputs.structure.R.R01UseCase;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Tag(name = "Structure R01", description = "Structure R01 management endpoints")
@RestController
@RequestMapping("/api/structures/R01")
public class R01Controller {
    private final R01UseCase r01UseCase;

    public R01Controller(R01UseCase useCase) {
        this.r01UseCase = useCase;
    }

    @GetMapping
    public List<R01Dto> getAll() {
        return r01UseCase.findAll();
    }

    @GetMapping("/{id}")
    public R01Dto getById(Long id) {
        return r01UseCase.findById(id);
    }

    @PostMapping
    public R01Dto create(R01Dto dto) {
        return r01UseCase.create(dto);
    }

    @PutMapping("/{id}")
    public R01Dto update(Long id, R01Dto dto) {
        return r01UseCase.update(id, dto);
    }

    @DeleteMapping("/{id}")
    public void delete(Long id) {
        r01UseCase.delete(id);
    }

}
