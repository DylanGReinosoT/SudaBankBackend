package com.sudamericano.bank.domain.ports.outputs.catalog;

import com.sudamericano.bank.domain.model.catalog.T208Dto;

import java.util.List;

public interface T208Port {
    List<T208Dto> findAll();
    T208Dto findById(Integer id);
}
