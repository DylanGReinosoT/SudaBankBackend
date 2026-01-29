package com.sudamericano.bank.domain.ports.inputs.catalog;

import com.sudamericano.bank.domain.model.catalog.T166Dto;

import java.util.List;

public interface T166UseCase {
    List<T166Dto> findAll();
    T166Dto findById(Integer id);
}
