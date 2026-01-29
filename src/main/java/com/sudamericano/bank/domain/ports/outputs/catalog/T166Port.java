package com.sudamericano.bank.domain.ports.outputs.catalog;

import com.sudamericano.bank.domain.model.catalog.T166Dto;

import java.util.List;

public interface T166Port {
    List<T166Dto> findAll();
    T166Dto findById(Integer id);
}
