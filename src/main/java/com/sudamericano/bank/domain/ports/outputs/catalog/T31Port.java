package com.sudamericano.bank.domain.ports.outputs.catalog;

import com.sudamericano.bank.domain.model.catalog.T31Dto;

import java.util.List;

public interface T31Port {
    List<T31Dto> findAll();
    T31Dto findById(Integer id);
}
