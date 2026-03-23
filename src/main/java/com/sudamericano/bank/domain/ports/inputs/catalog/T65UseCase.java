package com.sudamericano.bank.domain.ports.inputs.catalog;

import com.sudamericano.bank.domain.model.catalog.T65Dto;

import java.util.List;

public interface T65UseCase {
    List<T65Dto> findAll();
    T65Dto findById(Integer id);
}
