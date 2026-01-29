package com.sudamericano.bank.domain.ports.outputs.catalog;

import com.sudamericano.bank.domain.model.catalog.T33Dto;

import java.util.List;

public interface T33RepositoryPort {
    List<T33Dto> findAll();
    T33Dto findById(Integer id);
}
