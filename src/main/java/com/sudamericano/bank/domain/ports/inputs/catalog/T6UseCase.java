package com.sudamericano.bank.domain.ports.inputs.catalog;

import com.sudamericano.bank.domain.model.catalog.T6Dto;

import java.util.List;

public interface T6UseCase {
    List<T6Dto> findAll();
    T6Dto findById(Integer id);
}
