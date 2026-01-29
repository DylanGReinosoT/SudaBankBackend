package com.sudamericano.bank.domain.ports.inputs.catalog;

import com.sudamericano.bank.domain.model.catalog.T41Dto;

import java.util.List;

public interface T41UseCase {
    List<T41Dto> findAll();
    T41Dto findById(Integer id);
}
