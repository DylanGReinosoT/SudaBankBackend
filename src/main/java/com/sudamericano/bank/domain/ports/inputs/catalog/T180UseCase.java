package com.sudamericano.bank.domain.ports.inputs.catalog;

import com.sudamericano.bank.domain.model.catalog.T180Dto;

import java.util.List;

public interface T180UseCase {
    List<T180Dto> findAll();
    T180Dto findById(Integer id);
}
