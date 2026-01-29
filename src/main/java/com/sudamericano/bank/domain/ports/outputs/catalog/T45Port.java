package com.sudamericano.bank.domain.ports.outputs.catalog;

import com.sudamericano.bank.domain.model.catalog.T45Dto;

import java.util.List;

public interface T45Port {
    List<T45Dto> findAll();
    T45Dto findById(Integer id);
}
