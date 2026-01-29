package com.sudamericano.bank.domain.ports.outputs.catalog;

import com.sudamericano.bank.domain.model.catalog.T66Dto;

import java.util.List;

public interface T66RepositoryPort {
    List<T66Dto> findAll();
}
