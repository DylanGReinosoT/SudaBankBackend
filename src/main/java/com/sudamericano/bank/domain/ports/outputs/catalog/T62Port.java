package com.sudamericano.bank.domain.ports.outputs.catalog;

import com.sudamericano.bank.domain.model.catalog.T62Dto;

import java.util.List;

public interface T62Port {
    List<T62Dto> findAll();
    T62Dto findById(Integer id);
}
