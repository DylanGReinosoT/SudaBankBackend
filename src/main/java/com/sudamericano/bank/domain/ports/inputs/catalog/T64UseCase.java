package com.sudamericano.bank.domain.ports.inputs.catalog;

import com.sudamericano.bank.domain.model.catalog.T64Dto;

import java.util.List;

public interface T64UseCase {
    List<T64Dto> findAll();
    T64Dto findById(Integer id);
    T64Dto create(T64Dto dto);
    T64Dto update(Integer id, T64Dto dto);
    void delete(Integer id);
}
