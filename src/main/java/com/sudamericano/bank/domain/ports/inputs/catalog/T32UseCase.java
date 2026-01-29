package com.sudamericano.bank.domain.ports.inputs.catalog;

import com.sudamericano.bank.domain.model.catalog.T32Dto;

import java.util.List;

public interface T32UseCase {

    List<T32Dto> findAll();
    T32Dto findById(Integer id);
}
