package com.sudamericano.bank.domain.ports.inputs.structure.R;

import com.sudamericano.bank.domain.model.structure.R.R09Dto;

import java.util.List;

public interface R09UseCase {
    List<R09Dto> findAll();
    R09Dto findById(Long id);
    R09Dto create(R09Dto dto);
    R09Dto update(Long id, R09Dto dto);
    void delete(Long id);
}
