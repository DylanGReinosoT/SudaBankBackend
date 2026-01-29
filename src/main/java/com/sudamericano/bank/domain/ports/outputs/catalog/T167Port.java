package com.sudamericano.bank.domain.ports.outputs.catalog;

import com.sudamericano.bank.domain.model.catalog.T167Dto;

import java.util.List;

public interface T167Port {
    List<T167Dto> findAll();
    T167Dto findById(Integer id);
}
