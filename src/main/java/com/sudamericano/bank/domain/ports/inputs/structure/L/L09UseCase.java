package com.sudamericano.bank.domain.ports.inputs.structure.L;

import com.sudamericano.bank.domain.model.structure.L.L09Dto;

import java.util.List;

public interface L09UseCase {
    List<L09Dto> findAll();
    L09Dto findById(Long id);
    L09Dto create(L09Dto dto);
    L09Dto update(Long id, L09Dto dto);
    void delete(Long id);

}
