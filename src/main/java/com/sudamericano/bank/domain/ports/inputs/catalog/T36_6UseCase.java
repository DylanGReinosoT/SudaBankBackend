package com.sudamericano.bank.domain.ports.inputs.catalog;

import com.sudamericano.bank.domain.model.catalog.T36_6Dto;

import java.util.List;

public interface T36_6UseCase {
    List<T36_6Dto> findAll();
    T36_6Dto findById(Integer id);
}
