package com.sudamericano.bank.domain.ports.outputs.catalog;

import com.sudamericano.bank.domain.model.catalog.T7Dto;

import java.util.List;

public interface T7Port {
    List<T7Dto> findAll();
    T7Dto findById(Integer id);
}
