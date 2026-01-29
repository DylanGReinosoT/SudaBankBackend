package com.sudamericano.bank.domain.ports.inputs.catalog;

import com.sudamericano.bank.domain.model.catalog.T33Dto;

import java.util.List;

public interface T33UseCase {
    List<T33Dto> findAll();
    T33Dto findById(Integer id);
}
