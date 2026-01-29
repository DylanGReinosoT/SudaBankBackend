package com.sudamericano.bank.domain.ports.outputs.catalog;

import com.sudamericano.bank.domain.model.catalog.T69Dto;

import java.util.List;

public interface T69Port {
    List<T69Dto> findAll();
    T69Dto findById(Integer id);
}
