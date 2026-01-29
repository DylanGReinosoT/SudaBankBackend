package com.sudamericano.bank.domain.ports.inputs.structure.L;

import com.sudamericano.bank.domain.model.structure.L.L02Dto;

import java.util.List;

public interface L02UseCase {
    List<L02Dto> findAll();
    L02Dto findById(Long id);
    L02Dto create(L02Dto dto);
    L02Dto update(Long id, L02Dto dto);
    void delete(Long id);
}
