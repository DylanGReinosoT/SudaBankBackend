package com.sudamericano.bank.domain.ports.inputs.catalog;

import com.sudamericano.bank.domain.model.catalog.T59Dto;

import java.util.List;

public interface T59UseCase {
    List<T59Dto> findAll();
    T59Dto findById(Integer id);
}
