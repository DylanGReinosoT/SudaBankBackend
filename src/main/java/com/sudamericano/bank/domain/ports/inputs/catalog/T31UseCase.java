package com.sudamericano.bank.domain.ports.inputs.catalog;

import com.sudamericano.bank.domain.model.catalog.T31Dto;


import java.util.List;

public interface T31UseCase {
    List<T31Dto> findAll();
    T31Dto findById(Integer id);

}
