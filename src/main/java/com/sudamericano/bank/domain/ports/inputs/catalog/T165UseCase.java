package com.sudamericano.bank.domain.ports.inputs.catalog;

import com.sudamericano.bank.domain.model.catalog.T165Dto;

import java.util.List;

public interface T165UseCase {
    List<T165Dto> findAll();
    T165Dto findById(Integer id);
}
