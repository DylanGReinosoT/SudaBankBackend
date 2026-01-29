package com.sudamericano.bank.domain.ports.outputs.catalog;

import com.sudamericano.bank.domain.model.catalog.T235Dto;

import java.util.List;

public interface T235Port {
    List<T235Dto> findAll();
    T235Dto findById(Integer id);

}
