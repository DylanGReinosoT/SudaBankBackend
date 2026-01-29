package com.sudamericano.bank.domain.ports.outputs.structure.R;

import com.sudamericano.bank.domain.model.structure.R.R13Dto;

import java.util.List;

public interface R13Port {
    List<R13Dto> findAll();
    R13Dto findById(Long id);
    R13Dto create(R13Dto dto);
    R13Dto update(Long id, R13Dto dto);
    void delete(Long id);
}
