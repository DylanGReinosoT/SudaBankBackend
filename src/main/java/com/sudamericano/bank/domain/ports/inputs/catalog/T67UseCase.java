package com.sudamericano.bank.domain.ports.inputs.catalog;

import com.sudamericano.bank.domain.model.catalog.T67Dto;

import java.util.List;

public interface T67UseCase {
    List<T67Dto> findAll();
    T67Dto findById(Integer id);
}
