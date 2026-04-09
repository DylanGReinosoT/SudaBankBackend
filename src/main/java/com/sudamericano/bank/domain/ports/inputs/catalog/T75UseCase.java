package com.sudamericano.bank.domain.ports.inputs.catalog;

import com.sudamericano.bank.domain.model.catalog.T75Dto;

import java.util.List;

public interface T75UseCase {
    List<T75Dto> findAll();
    T75Dto findById(Integer id);
}
