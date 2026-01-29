package com.sudamericano.bank.domain.ports.outputs.catalog;

import com.sudamericano.bank.domain.model.catalog.T38Dto;

import java.util.List;

public interface T38Port {
    List<T38Dto> findAll();
    T38Dto findById(Integer id);
}
