package com.sudamericano.bank.domain.ports.outputs.catalog;

import com.sudamericano.bank.domain.model.catalog.T168Dto;

import java.util.List;

public interface T168Port {
    List<T168Dto> findAll();
    T168Dto findById(Integer id);
}
