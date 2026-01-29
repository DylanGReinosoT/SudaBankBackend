package com.sudamericano.bank.domain.ports.inputs.structure.R;

import com.sudamericano.bank.domain.model.structure.R.R11Dto;

import java.util.List;

public interface R11UseCase {
    List<R11Dto> findAll();
    R11Dto findById(Long id);
    R11Dto create(R11Dto dto);
    R11Dto update(Long id, R11Dto dto);
    void delete(Long id);
    
}
