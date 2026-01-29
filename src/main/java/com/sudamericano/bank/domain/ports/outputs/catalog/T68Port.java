package com.sudamericano.bank.domain.ports.outputs.catalog;

import com.sudamericano.bank.domain.model.catalog.T68Dto;

import java.util.List;

public interface T68Port {
    List<T68Dto> findAll();
    T68Dto findById(Integer id);
}
