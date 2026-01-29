package com.sudamericano.bank.domain.ports.inputs.catalog;

import com.sudamericano.bank.domain.model.catalog.T168Dto;

import java.util.List;

public interface T168UseCase {
    List<T168Dto> findAll();
    T168Dto findById(Integer id);
}
