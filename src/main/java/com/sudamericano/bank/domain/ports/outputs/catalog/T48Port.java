package com.sudamericano.bank.domain.ports.outputs.catalog;

import com.sudamericano.bank.domain.model.catalog.T48Dto;

import java.util.List;

public interface T48Port {
    List<T48Dto> findAll();
    T48Dto findById(Integer id);
}
