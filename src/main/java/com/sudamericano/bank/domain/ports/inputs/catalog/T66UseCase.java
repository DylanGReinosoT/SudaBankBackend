package com.sudamericano.bank.domain.ports.inputs.catalog;

import com.sudamericano.bank.domain.model.catalog.T66Dto;

import java.util.List;

public interface T66UseCase {
    List<T66Dto> findAll();
    T66Dto findById(Integer id);
}
