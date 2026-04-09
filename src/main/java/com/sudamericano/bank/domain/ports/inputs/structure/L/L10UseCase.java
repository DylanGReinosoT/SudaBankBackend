package com.sudamericano.bank.domain.ports.inputs.structure.L;

import com.sudamericano.bank.domain.model.structure.L.L10Dto;

import java.util.List;

public interface L10UseCase {
    List<L10Dto> findAll();
    L10Dto findById(Long id);
    L10Dto create(L10Dto dto);
    L10Dto update(Long id, L10Dto dto);
    void delete(Long id);
}
