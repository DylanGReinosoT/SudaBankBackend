package com.sudamericano.bank.domain.ports.outputs.catalog;

import com.sudamericano.bank.domain.model.catalog.T170Dto;

import java.util.List;

public interface T170Port {
    List<T170Dto> findAll();
    T170Dto findById(Integer id);
}
