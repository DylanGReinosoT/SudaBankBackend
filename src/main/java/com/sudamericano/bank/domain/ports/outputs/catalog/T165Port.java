package com.sudamericano.bank.domain.ports.outputs.catalog;

import com.sudamericano.bank.domain.model.catalog.T165Dto;

import java.util.List;

public interface T165Port {
    List<T165Dto> findAll();
    T165Dto findById(Integer id);
}
