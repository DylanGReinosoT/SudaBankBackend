package com.sudamericano.bank.domain.ports.outputs.catalog;

import com.sudamericano.bank.domain.model.catalog.T67Dto;

import java.util.List;

public interface T67Port {
    List<T67Dto> findAll();
    T67Dto findById(Integer id);
}
