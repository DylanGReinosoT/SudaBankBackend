package com.sudamericano.bank.domain.ports.outputs.catalog;

import com.sudamericano.bank.domain.model.catalog.T169Dto;

import java.util.List;

public interface T169Port {
    List<T169Dto> findAll();
    T169Dto findById(Integer id);
}
