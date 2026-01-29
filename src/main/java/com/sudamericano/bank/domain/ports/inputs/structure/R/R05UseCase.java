package com.sudamericano.bank.domain.ports.inputs.structure.R;

import com.sudamericano.bank.domain.model.structure.R.R05Dto;

import java.util.List;

public interface R05UseCase {
    List<R05Dto> findAll();
    R05Dto findById(Long id);
    R05Dto create(R05Dto dto);
    R05Dto update(Long id, R05Dto dto);
    void delete(Long id);
}
