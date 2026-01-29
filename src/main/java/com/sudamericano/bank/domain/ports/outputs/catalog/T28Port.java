package com.sudamericano.bank.domain.ports.outputs.catalog;

import com.sudamericano.bank.domain.model.catalog.T28Dto;

import java.util.List;

public interface T28Port {
    List<T28Dto> findAll();
    T28Dto findById(Integer id);
}
