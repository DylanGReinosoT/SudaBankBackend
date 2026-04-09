package com.sudamericano.bank.domain.ports.outputs.catalog;

import com.sudamericano.bank.domain.model.catalog.T75Dto;

import java.util.List;

public interface T75Port {
    List<T75Dto> findAll();
    T75Dto findById(Integer id);
}
