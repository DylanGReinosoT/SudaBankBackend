package com.sudamericano.bank.domain.ports.inputs.catalog;

import com.sudamericano.bank.domain.model.catalog.T48Dto;

import java.util.List;

public interface T48UseCase {
    List<T48Dto> findAll();
    T48Dto findById(Integer id);
}
