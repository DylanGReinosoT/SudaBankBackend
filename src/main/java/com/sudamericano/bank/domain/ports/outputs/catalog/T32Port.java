package com.sudamericano.bank.domain.ports.outputs.catalog;

import com.sudamericano.bank.domain.model.catalog.T32Dto;

import java.util.List;

public interface T32Port {
    List<T32Dto> findAll();
    T32Dto findById(Integer id);
}
