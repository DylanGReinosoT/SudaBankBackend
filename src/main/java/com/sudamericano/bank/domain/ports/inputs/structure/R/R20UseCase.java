package com.sudamericano.bank.domain.ports.inputs.structure.R;

import com.sudamericano.bank.domain.model.structure.R.R20Dto;

import java.util.List;

public interface R20UseCase {
    List<R20Dto> findAll();
    R20Dto findById(Long id);
    R20Dto create(R20Dto dto);
    R20Dto update(Long id, R20Dto dto);
    void delete(Long id);
}
