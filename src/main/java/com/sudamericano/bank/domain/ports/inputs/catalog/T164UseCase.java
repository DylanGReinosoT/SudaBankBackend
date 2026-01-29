package com.sudamericano.bank.domain.ports.inputs.catalog;

import com.sudamericano.bank.domain.model.catalog.T164Dto;

import java.util.List;

public interface T164UseCase {
    List<T164Dto> findAll();
    T164Dto findById(Integer id);
    T164Dto create(T164Dto dto);
    T164Dto update(Integer id, T164Dto dto);
    void delete(Integer id);
}
