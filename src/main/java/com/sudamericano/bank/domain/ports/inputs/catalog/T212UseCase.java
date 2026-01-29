package com.sudamericano.bank.domain.ports.inputs.catalog;

import com.sudamericano.bank.domain.model.catalog.T212Dto;

import java.util.List;

public interface T212UseCase {
    List<T212Dto> findAll();
    T212Dto findById(Integer id);
}
