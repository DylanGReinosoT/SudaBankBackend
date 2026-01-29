package com.sudamericano.bank.domain.ports.outputs.catalog;

import com.sudamericano.bank.domain.model.catalog.T39Dto;

import java.util.List;

public interface T39Port {
    List<T39Dto> findAll();
    T39Dto findById(Integer id);
}
