package com.sudamericano.bank.domain.ports.outputs.catalog;

import com.sudamericano.bank.domain.model.catalog.T42Dto;

import java.util.List;

public interface T42Port {
    List<T42Dto> findAll();
    T42Dto findById(Integer id);
}
