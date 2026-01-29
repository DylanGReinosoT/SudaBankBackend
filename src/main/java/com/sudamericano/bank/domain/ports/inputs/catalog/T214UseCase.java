package com.sudamericano.bank.domain.ports.inputs.catalog;

import com.sudamericano.bank.domain.model.catalog.T214Dto;

import java.util.List;

public interface T214UseCase {
    List<T214Dto> findAll();
    T214Dto findById(Integer id);
}
