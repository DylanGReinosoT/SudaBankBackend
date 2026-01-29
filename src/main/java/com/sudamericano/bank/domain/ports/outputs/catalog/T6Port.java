package com.sudamericano.bank.domain.ports.outputs.catalog;

import com.sudamericano.bank.domain.model.catalog.T6Dto;

import java.util.List;

public interface T6Port {
    List<T6Dto> findAll();
    T6Dto findById(Integer id);
}
