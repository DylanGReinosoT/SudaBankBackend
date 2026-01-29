package com.sudamericano.bank.domain.ports.inputs.catalog;

import com.sudamericano.bank.domain.model.catalog.T43Dto;

import java.util.List;

public interface T43UseCase {
    List<T43Dto> findAll();
    T43Dto findById(Integer id);
}
