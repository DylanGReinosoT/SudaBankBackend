package com.sudamericano.bank.domain.ports.inputs.catalog;

import com.sudamericano.bank.domain.model.catalog.T235Dto;

import java.util.List;

public interface T235UseCase {
    List<T235Dto> findAll();
    T235Dto findById(Integer id);

}
