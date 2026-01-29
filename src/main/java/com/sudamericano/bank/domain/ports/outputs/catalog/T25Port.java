package com.sudamericano.bank.domain.ports.outputs.catalog;

import com.sudamericano.bank.domain.model.catalog.T25Dto;

import java.util.List;

public interface T25Port {
    List<T25Dto> findAll();
    T25Dto findById(Integer id);
}
