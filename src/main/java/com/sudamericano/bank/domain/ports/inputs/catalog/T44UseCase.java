package com.sudamericano.bank.domain.ports.inputs.catalog;

import com.sudamericano.bank.domain.model.catalog.T44Dto;

import java.util.List;

public interface T44UseCase {
    List<T44Dto> findAll();
    T44Dto findById(Integer id);
}
