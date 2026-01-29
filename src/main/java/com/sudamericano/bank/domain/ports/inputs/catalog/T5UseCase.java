package com.sudamericano.bank.domain.ports.inputs.catalog;

import com.sudamericano.bank.domain.model.catalog.T5Dto;

import java.util.List;

public interface T5UseCase {
    List<T5Dto> findAll();
    T5Dto findById(Integer id);
}
