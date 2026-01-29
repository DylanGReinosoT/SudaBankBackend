package com.sudamericano.bank.domain.ports.inputs.catalog;

import com.sudamericano.bank.domain.model.catalog.T169Dto;

import java.util.List;

public interface T169UseCase {
    List<T169Dto> findAll();
    T169Dto findById(Integer id);
}
