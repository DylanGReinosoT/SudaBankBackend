package com.sudamericano.bank.domain.ports.outputs.structure.R;

import com.sudamericano.bank.domain.model.structure.R.R21Dto;

import java.util.List;

public interface R21Port {
    List<R21Dto> findAll();
    R21Dto findById(Long id);
    R21Dto create(R21Dto dto);
    R21Dto update(Long id, R21Dto dto);
    void delete(Long id);
}
