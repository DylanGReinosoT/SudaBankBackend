package com.sudamericano.bank.domain.ports.outputs.catalog;

import com.sudamericano.bank.domain.model.catalog.T46Dto;

import java.util.List;

public interface T46Port {
    List<T46Dto> findAll();
    T46Dto findById(Integer id);
}
