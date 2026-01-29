package com.sudamericano.bank.domain.ports.outputs.structure.L;

import com.sudamericano.bank.domain.model.structure.L.L06Dto;

import java.util.List;

public interface L06Port {
    List<L06Dto> findAll();
    L06Dto findById(Integer id);
    L06Dto create(L06Dto dto);
    L06Dto update(Integer id, L06Dto dto);
    void delete(Integer id);

}
