package com.sudamericano.bank.domain.ports.inputs.catalog;

import com.sudamericano.bank.domain.model.catalog.T39Dto;

import java.util.List;

public interface T39UseCase {
    List<T39Dto> findAll();
    T39Dto findById(Integer id);
}
