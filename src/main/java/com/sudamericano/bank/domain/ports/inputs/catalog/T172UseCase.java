package com.sudamericano.bank.domain.ports.inputs.catalog;

import com.sudamericano.bank.domain.model.catalog.T172Dto;

import java.util.List;

public interface T172UseCase {
    List<T172Dto> findAll();
    T172Dto findById(Integer id);
}
