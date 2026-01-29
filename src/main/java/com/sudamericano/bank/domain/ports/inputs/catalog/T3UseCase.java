package com.sudamericano.bank.domain.ports.inputs.catalog;

import com.sudamericano.bank.domain.model.catalog.T3Dto;

import java.util.List;

public interface T3UseCase {
    List<T3Dto> findAll();
    T3Dto findById(Integer id);
}
