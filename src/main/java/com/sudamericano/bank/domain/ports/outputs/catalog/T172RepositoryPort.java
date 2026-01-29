package com.sudamericano.bank.domain.ports.outputs.catalog;

import com.sudamericano.bank.domain.model.catalog.T172Dto;

import java.util.List;

public interface T172RepositoryPort {
    List<T172Dto> findAll();
    T172Dto findById(Integer id);
}
