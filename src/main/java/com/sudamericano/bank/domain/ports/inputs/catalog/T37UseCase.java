package com.sudamericano.bank.domain.ports.inputs.catalog;

import com.sudamericano.bank.domain.model.catalog.T37Dto;

import java.util.List;

public interface T37UseCase {
    List<T37Dto> findAll();
    T37Dto findById(Integer id);
}
