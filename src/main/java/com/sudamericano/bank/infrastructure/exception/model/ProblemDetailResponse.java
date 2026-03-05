package com.sudamericano.bank.infrastructure.exception.model;

import lombok.Builder;
import lombok.Getter;

import java.net.URI;
import java.util.Map;

@Getter
@Builder
public class ProblemDetailResponse {
    private URI type;
    private String title;
    private int status;
    private String detail;
    private URI instance;
    private Map<String, Object> extensions;
}
