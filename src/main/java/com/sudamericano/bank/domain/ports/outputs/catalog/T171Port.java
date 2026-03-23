package com.sudamericano.bank.domain.ports.outputs.catalog;

import com.sudamericano.bank.domain.model.catalog.T171Dto;

import java.util.List;

public interface T171Port {
    List<T171Dto> findAll();
    T171Dto findById(Integer id);
}
