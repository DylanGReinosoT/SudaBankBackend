package com.sudamericano.bank.domain.ports.outputs.catalog;

import com.sudamericano.bank.domain.model.catalog.T3Dto;

import java.util.List;

public interface T3Port {
    List<T3Dto> findAll();
    T3Dto findById(Integer id);
}
