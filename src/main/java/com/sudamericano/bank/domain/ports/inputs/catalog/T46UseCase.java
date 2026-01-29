package com.sudamericano.bank.domain.ports.inputs.catalog;

import com.sudamericano.bank.domain.model.catalog.T46Dto;

import java.util.List;

public interface T46UseCase {
    List<T46Dto> findAll();
    T46Dto findById(Integer id);
}
