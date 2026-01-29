package com.sudamericano.bank.domain.ports.outputs.catalog;

import com.sudamericano.bank.domain.model.catalog.T70Dto;

import java.util.List;

public interface T70Port {
    List<T70Dto> findAll();
    T70Dto findById(Integer id);
}
