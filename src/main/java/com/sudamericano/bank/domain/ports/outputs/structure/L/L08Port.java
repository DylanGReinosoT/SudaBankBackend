package com.sudamericano.bank.domain.ports.outputs.structure.L;

import com.sudamericano.bank.domain.model.structure.L.L08Dto;

import java.util.List;

public interface L08Port {
    List<L08Dto> findAll();
    L08Dto findById(Long id);
    L08Dto create(L08Dto dto);
    L08Dto update(Long id, L08Dto dto);
    void delete(Long id);
}
