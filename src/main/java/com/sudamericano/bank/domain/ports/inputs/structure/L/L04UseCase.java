package com.sudamericano.bank.domain.ports.inputs.structure.L;

import com.sudamericano.bank.domain.model.structure.L.L04Dto;

import java.util.List;

public interface L04UseCase {
    List<L04Dto> findAll();
    L04Dto findById(Long id);
    L04Dto create(L04Dto dto);
    L04Dto update(Long id, L04Dto dto);
    void delete(Long id);
}
