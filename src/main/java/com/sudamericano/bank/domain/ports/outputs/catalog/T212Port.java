package com.sudamericano.bank.domain.ports.outputs.catalog;

import com.sudamericano.bank.domain.model.catalog.T212Dto;

import java.util.List;

public interface T212Port {
    List<T212Dto> findAll();
    T212Dto findById(Integer id);
}
