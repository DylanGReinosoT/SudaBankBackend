package com.sudamericano.bank.domain.ports.inputs.catalog;

import com.sudamericano.bank.domain.model.catalog.T207Dto;

import java.util.List;

public interface T207UseCase {
    List<T207Dto> findAll();
    T207Dto findById(Integer id);
}
