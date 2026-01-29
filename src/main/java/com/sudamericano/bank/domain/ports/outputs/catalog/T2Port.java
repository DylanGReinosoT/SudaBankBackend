package com.sudamericano.bank.domain.ports.outputs.catalog;

import com.sudamericano.bank.domain.model.catalog.T2Dto;

import java.util.List;

public interface T2Port {
    List<T2Dto> findAll();
    T2Dto findById(Integer id);
}
