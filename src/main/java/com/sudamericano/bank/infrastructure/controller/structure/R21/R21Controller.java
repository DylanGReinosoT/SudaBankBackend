package com.sudamericano.bank.infrastructure.controller.structure.R21;

import com.sudamericano.bank.application.usecase.structure.R21.R21CabeceraUseCase;
import com.sudamericano.bank.domain.model.structure.R21.R21Cabecera;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/r21")
@RequiredArgsConstructor
public class R21Controller {
    
    private final R21CabeceraUseCase r21UseCase;

    @PostMapping
    public ResponseEntity<R21Cabecera> create(@RequestBody R21Cabecera r21Cabecera) {
        return new ResponseEntity<>(r21UseCase.create(r21Cabecera), HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<R21Cabecera> update(@PathVariable Long id, @RequestBody R21Cabecera r21Cabecera) {
        return ResponseEntity.ok(r21UseCase.update(id, r21Cabecera));
    }

    @GetMapping("/{id}")
    public ResponseEntity<R21Cabecera> getById(@PathVariable Long id) {
        return r21UseCase.getById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @GetMapping
    public ResponseEntity<List<R21Cabecera>> getAll() {
        return ResponseEntity.ok(r21UseCase.getAll());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        r21UseCase.delete(id);
        return ResponseEntity.noContent().build();
    }

    @GetMapping("/{id}/report")
    public ResponseEntity<byte[]> getReport(@PathVariable Long id) {
        byte[] report = r21UseCase.getReport(id);
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_PDF);
        headers.setContentDispositionFormData("attachment", "reporte_r21_" + id + ".pdf");
        return new ResponseEntity<>(report, headers, HttpStatus.OK);
    }
}
