package com.sudamericano.bank.domain.ports.inputs.structure.R;

import com.sudamericano.bank.domain.model.structure.R.R10Dto;

import java.util.List;

public interface R10UseCase {
    List<R10Dto> findAll();
    R10Dto findById(Long id);
    R10Dto create(R10Dto dto);
    R10Dto update(Long id, R10Dto dto);
    void delete(Long id);
}


