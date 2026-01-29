package com.sudamericano.bank.domain.ports.inputs.structure.R;

import com.sudamericano.bank.domain.model.structure.R.R01Dto;

import java.util.List;

public interface R01UseCase {
    List<R01Dto> findAll();
    R01Dto findById(Long id);
    R01Dto create(R01Dto dto);
    R01Dto update(Long id, R01Dto dto);
    void delete(Long id);
}
