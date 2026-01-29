package com.sudamericano.bank.domain.ports.outputs.catalog;

import com.sudamericano.bank.domain.model.catalog.T207Dto;

import java.util.List;

public interface T207Port {
    List<T207Dto> findAll();
    T207Dto findById(Integer id);
}
