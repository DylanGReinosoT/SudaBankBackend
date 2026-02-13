package com.sudamericano.bank.domain.ports.inputs.catalog;

import com.sudamericano.bank.domain.model.catalog.T9Dto;

import java.util.List;

public interface T9UseCase {
    List<T9Dto> findAll();
    T9Dto findById(Integer id);
}
