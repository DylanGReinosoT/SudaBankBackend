package com.sudamericano.bank.domain.ports.outputs.catalog;

import com.sudamericano.bank.domain.model.catalog.T47Dto;

import java.util.List;

public interface T47Port {
    List<T47Dto> findAll();
    T47Dto findById(Integer id);
}