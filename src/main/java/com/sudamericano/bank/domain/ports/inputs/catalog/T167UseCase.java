package com.sudamericano.bank.domain.ports.inputs.catalog;

import com.sudamericano.bank.domain.model.catalog.T167Dto;

import java.util.List;

public interface T167UseCase {
    List<T167Dto> findAll();
    T167Dto findById(Integer id);
}
