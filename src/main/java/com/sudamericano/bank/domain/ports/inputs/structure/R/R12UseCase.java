package com.sudamericano.bank.domain.ports.inputs.structure.R;

import com.sudamericano.bank.domain.model.structure.R.R12Dto;

import java.util.List;

public interface R12UseCase{
    List<R12Dto> findAll();
    R12Dto findById(Long id);
    R12Dto create(R12Dto dto);
    R12Dto update(Long id, R12Dto dto);
    void delete(Long id);
}
