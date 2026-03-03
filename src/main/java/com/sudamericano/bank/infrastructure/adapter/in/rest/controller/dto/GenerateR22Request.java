package com.sudamericano.bank.infrastructure.adapter.in.rest.controller.dto;


import jakarta.validation.constraints.NotNull;

public record GenerateR22Request(

        @NotNull(message = "r21CabeceraId is required")
        Long r21CabeceraId,

        @NotNull(message = "r22CabeceraId is required")
        Long r22CabeceraId
) {}

