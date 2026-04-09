package com.sudamericano.bank.infrastructure.controller.structure.L;

import com.sudamericano.bank.domain.model.catalog.T75Dto;
import com.sudamericano.bank.domain.model.structure.L.L10Dto;
import com.sudamericano.bank.domain.ports.inputs.catalog.T75UseCase;
import com.sudamericano.bank.domain.ports.inputs.structure.L.L10UseCase;
import com.sudamericano.bank.infrastructure.outputs.ReportDto;
import com.sudamericano.bank.infrastructure.outputs.ResponseDTO;
import com.sudamericano.bank.infrastructure.outputs.structure.L.report.L10ReportResponse;
import com.sudamericano.bank.infrastructure.outputs.structure.L.resume.L10ResumeResponse;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Tag(name = "Structure L10", description = "Controlador para la entidad L10")
@RestController
@RequestMapping("/api/structures/L10")
public class L10Controller {

    private final L10UseCase useCase;
    public final T75UseCase t75UseCase;

    public L10Controller(L10UseCase useCase, T75UseCase t75UseCase) {
        this.useCase = useCase;
        this.t75UseCase = t75UseCase;
    }

    @GetMapping
    public List<L10Dto> getAll() {
        return useCase.findAll();
    }

    @GetMapping("/resume")
    public List<L10ResumeResponse> getAllResume() {
        List<L10ResumeResponse> resumes = new java.util.ArrayList<>(List.of());
        for (L10Dto dto : useCase.findAll()){
            L10ResumeResponse resume = new L10ResumeResponse();

            resume.setCodigoProducto(dto.getCodigoProducto());

            T75Dto banda = t75UseCase.findById((dto.getCodigoBanda()));
            if (banda != null){
                resume.setCodigoBanda(new ResponseDTO(banda.getId(), banda.getDescripcion()));
            }

            resume.setValorProductoBanda(dto.getValorProductoBanda());

            resumes.add(resume);
        }
        return resumes;
    }

    @GetMapping("/report")
    public List<L10ReportResponse> getReports() {
        List<L10ReportResponse> reports = new java.util.ArrayList<>(List.of());

        for (L10Dto dto : useCase.findAll()){
            L10ReportResponse report = new L10ReportResponse();

            report.setCodigoProducto(dto.getCodigoProducto());
            report.setValorProductoBanda(dto.getValorProductoBanda());

            T75Dto banda = t75UseCase.findById((dto.getCodigoBanda()));
            if (banda != null){
                report.setCodigoBanda(new ReportDto(banda.getId(), banda.getCodigo(),banda.getDescripcion()));
            }

            reports.add(report);
        }
        return reports;
    }

    @GetMapping("/{id}")
    public L10Dto getById(@PathVariable Long id) {
        return useCase.findById(id);
    }

    @PostMapping
    public L10Dto create(@RequestBody L10Dto dto) {
        return useCase.create(dto);
    }

    @PutMapping("/{id}")
    public L10Dto update(@PathVariable Long id, @RequestBody L10Dto dto){
        return useCase.update(id, dto);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        useCase.delete(id);
    }

}
