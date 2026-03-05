package com.sudamericano.bank.infrastructure.adapter.in.rest.controller;

import com.sudamericano.bank.application.usecase.structure.R21.GenerateR22FromR21UseCase;
import com.sudamericano.bank.infrastructure.adapter.in.rest.controller.dto.GenerateR22Request;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/r22")
@RequiredArgsConstructor
public class R22Controller {

    private final GenerateR22FromR21UseCase generateR22FromR21UseCase;

    @PostMapping("/generate")
    public ResponseEntity<Void> generateR22(
            @Valid @RequestBody GenerateR22Request request
    ) {
        generateR22FromR21UseCase.execute(
                request.r21CabeceraId(),
                request.r22CabeceraId()
        );

        return ResponseEntity.accepted().build();
    }
}

