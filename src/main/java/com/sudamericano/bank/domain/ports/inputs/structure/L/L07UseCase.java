package com.sudamericano.bank.domain.ports.inputs.structure.L;

import com.sudamericano.bank.domain.model.structure.L.L07Dto;

import java.util.List;

public interface L07UseCase {
    List<L07Dto> findAll();
    L07Dto findById(Long id);
    L07Dto create(L07Dto dto);
    L07Dto update(Long id, L07Dto dto);
    void delete(Long id);
}
