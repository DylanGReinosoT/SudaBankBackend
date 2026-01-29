package com.sudamericano.bank.domain.ports.outputs.catalog;

import com.sudamericano.bank.domain.model.catalog.T79Dto;

import java.util.List;

public interface T79Port {
    List<T79Dto> findAll();
    T79Dto findById(Integer id);
}
