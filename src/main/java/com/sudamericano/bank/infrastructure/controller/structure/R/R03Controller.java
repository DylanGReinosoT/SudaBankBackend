package com.sudamericano.bank.infrastructure.controller.structure.R;

import com.sudamericano.bank.domain.model.structure.L.L02Dto;
import com.sudamericano.bank.domain.model.structure.R.R03Dto;
import com.sudamericano.bank.domain.ports.inputs.structure.R.R03UsesCase;
import com.sudamericano.bank.domain.ports.outputs.structure.R.R03Port;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Tag(name = "Structure R03", description = "Structure R03 management endpoints")
@RestController
@RequestMapping("/api/structures/R03")

public class R03Controller
{
    private final R03UsesCase r03UsesCase;

    public R03Controller(R03UsesCase usesCase)
    {
        this.r03UsesCase=usesCase;
    }


    @GetMapping
    public List<R03Dto> getAll() {
        return r03UsesCase.findAll();
    }

    @GetMapping("/{id}")
    public R03Dto getById(Long id) {
        return r03UsesCase.findById(id);
    }

    @PostMapping
    public R03Dto create(R03Dto dto) {
        return r03UsesCase.create(dto);
    }

    @PutMapping("/{id}")
    public R03Dto update(Long id, R03Dto dto) {
        return r03UsesCase.update(id, dto);
    }

    @DeleteMapping("/{id}")
    public void delete(Long id) {
        r03UsesCase.delete(id);
    }


}
