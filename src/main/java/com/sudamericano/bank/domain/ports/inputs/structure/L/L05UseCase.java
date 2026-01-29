package com.sudamericano.bank.domain.ports.inputs.structure.L;

import com.sudamericano.bank.domain.model.structure.L.L05Dto;

import java.util.List;

public interface L05UseCase {
    List<L05Dto> findAll();
    L05Dto findById(Integer id);
    L05Dto create(L05Dto dto);
    L05Dto update(Integer id, L05Dto dto);
    void delete(Integer id);
}
