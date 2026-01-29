package com.sudamericano.bank.domain.ports.inputs.structure.R;

import com.sudamericano.bank.domain.model.structure.R.R13Dto;

import java.util.List;

public interface R13UseCase {
    List<R13Dto> findAll();
    R13Dto findById(Long id);
    R13Dto create(R13Dto dto);
    R13Dto update(Long id, R13Dto dto);
    void delete(Long id);
    
}
