package com.sudamericano.bank.domain.ports.inputs.structure.R;

import com.sudamericano.bank.domain.model.structure.R.R07Dto;

import java.util.List;

public interface R07UseCase {
    List<R07Dto> findAll();
    R07Dto findById(Long id);
    R07Dto create(R07Dto dto);
    R07Dto update(Long id, R07Dto dto);
    void delete(Long id);
}
