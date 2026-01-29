package com.sudamericano.bank.domain.ports.outputs.catalog;

import com.sudamericano.bank.domain.model.catalog.T59Dto;

import java.util.List;

public interface T59Port {
    List<T59Dto> findAll();
    T59Dto findById(Integer id);
}
