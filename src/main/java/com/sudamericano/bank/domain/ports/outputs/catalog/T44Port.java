package com.sudamericano.bank.domain.ports.outputs.catalog;

import com.sudamericano.bank.domain.model.catalog.T44Dto;

import java.util.List;

public interface T44Port {
    List<T44Dto> findAll();
    T44Dto findById(Integer id);
}
