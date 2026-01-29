package com.sudamericano.bank.domain.ports.inputs.catalog;

import com.sudamericano.bank.domain.model.catalog.T42Dto;

import java.util.List;

public interface T42UseCase {
    List<T42Dto> findAll();
    T42Dto findById(Integer id);
}
