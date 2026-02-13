package com.sudamericano.bank.domain.ports.outputs.catalog;

import com.sudamericano.bank.domain.model.catalog.T9Dto;

import java.util.List;

public interface T9Port {
    List<T9Dto> findAll();
    T9Dto findById(Integer id);
}
