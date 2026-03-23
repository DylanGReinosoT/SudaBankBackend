package com.sudamericano.bank.domain.ports.outputs.catalog;

import com.sudamericano.bank.domain.model.catalog.T180Dto;

import java.util.List;

public interface T180Port {
    List<T180Dto> findAll();
    T180Dto findById(Integer id);
}
