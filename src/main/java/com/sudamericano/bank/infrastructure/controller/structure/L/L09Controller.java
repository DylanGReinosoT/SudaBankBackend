package com.sudamericano.bank.infrastructure.controller.structure.L;

import com.sudamericano.bank.domain.model.catalog.T47Dto;
import com.sudamericano.bank.domain.model.catalog.T79Dto;
import com.sudamericano.bank.domain.model.structure.L.L09Dto;
import com.sudamericano.bank.domain.ports.inputs.catalog.T47UseCase;
import com.sudamericano.bank.domain.ports.inputs.catalog.T79UseCase;
import com.sudamericano.bank.domain.ports.inputs.structure.L.L09UseCase;
import com.sudamericano.bank.infrastructure.outputs.ReportDto;
import com.sudamericano.bank.infrastructure.outputs.ResponseDTO;
import com.sudamericano.bank.infrastructure.outputs.structure.L.report.L09ReportResponse;
import com.sudamericano.bank.infrastructure.outputs.structure.L.resume.L09ResumeResponse;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Tag(name = "Structure L09", description = "Structure L09 management endpoints")
@RestController
@RequestMapping("/api/structures/L09")
public class L09Controller {
    private final L09UseCase l09UseCase;
    private final T79UseCase t79UseCase;
    private final T47UseCase t47UseCase;

    public L09Controller(L09UseCase l09UseCase, T79UseCase t79UseCase, T47UseCase t47UseCase) {
        this.l09UseCase = l09UseCase;
        this.t79UseCase = t79UseCase;
        this.t47UseCase = t47UseCase;
    }

    @GetMapping
    public List<L09Dto> getAll(){
        return l09UseCase.findAll();
    }

    @GetMapping("/resume")
    public List<L09ResumeResponse> getAllResume(){
        List<L09ResumeResponse> resumes = new java.util.ArrayList<>(List.of());
        for (L09Dto dto : l09UseCase.findAll()){
            L09ResumeResponse resume = new L09ResumeResponse();

            resume.setCodigoProducto(dto.getCodigoProducto());
            resume.setDescripcionProducto(dto.getDescripcionProducto());

            T79Dto fondo = t79UseCase.findById(dto.getCodigoFondoInversion());
            if (fondo != null){
                resume.setCodigoFondoInversion(new ResponseDTO(fondo.getId(), fondo.getDescripcion()));
            }

            T47Dto estado = t47UseCase.findById(dto.getEstadoRegistro());
            if (estado != null){
                resume.setEstadoRegistro(new ResponseDTO(estado.getId(), estado.getDescripcion()));
            }

            resumes.add(resume);
        }
        return resumes;
    }

    @GetMapping("/report")
    public List<L09ReportResponse> getReport(){
        List<L09ReportResponse> reports = new java.util.ArrayList<>(List.of());

        for (L09Dto dto : l09UseCase.findAll()){
            L09ReportResponse report = new L09ReportResponse();

            report.setCodigoProducto(dto.getCodigoProducto());
            report.setDescripcionProducto(dto.getDescripcionProducto());

            T79Dto fondo = t79UseCase.findById(dto.getCodigoFondoInversion());
            if (fondo != null){
                report.setCodigoFondoInversion(new ReportDto(fondo.getId(), fondo.getCodigo() ,fondo.getDescripcion()));
            }

            T47Dto estado = t47UseCase.findById(dto.getEstadoRegistro());
            if (estado != null){
                report.setEstadoRegistro(new ReportDto(estado.getId(), estado.getCodigo() ,estado.getDescripcion()));
            }

            reports.add(report);
        }
        return reports;
    }

    @GetMapping("/{id}")
    public L09Dto getById(@PathVariable Long id){
        return l09UseCase.findById(id);
    }

    @PostMapping
    public L09Dto create(@RequestBody L09Dto dto){
        return l09UseCase.create(dto);
    }

    @PutMapping("/{id}")
    public L09Dto update(@PathVariable Long id, @RequestBody L09Dto dto){
        return l09UseCase.update(id, dto);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id){
        l09UseCase.delete(id);
    }
}
