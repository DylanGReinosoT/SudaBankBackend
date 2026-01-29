package com.sudamericano.bank.domain.ports.outputs.catalog;

import com.sudamericano.bank.domain.model.catalog.T50Dto;

import java.util.List;

public interface T50Port {
    List<T50Dto> findAll();
    T50Dto findById(Integer id);
}
