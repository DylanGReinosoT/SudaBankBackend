package com.sudamericano.bank.domain.ports.inputs.catalog;

import com.sudamericano.bank.domain.model.catalog.T209Dto;

import java.util.List;

public interface T209UseCase {
    List<T209Dto> findAll();
    T209Dto findById(Integer id);
}
