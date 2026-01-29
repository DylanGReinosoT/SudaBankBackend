package com.sudamericano.bank.domain.ports.outputs.catalog;

import com.sudamericano.bank.domain.model.catalog.T5Dto;

import java.util.List;

public interface T5RepositoryPort {
    List<T5Dto> findAll();
    T5Dto findById(Integer id);
}
