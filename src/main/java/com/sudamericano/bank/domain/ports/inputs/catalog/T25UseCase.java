package com.sudamericano.bank.domain.ports.inputs.catalog;

import com.sudamericano.bank.domain.model.catalog.T25Dto;

import java.util.List;

public interface T25UseCase {
    List<T25Dto> findAll();
    T25Dto findById(Integer id);
}
