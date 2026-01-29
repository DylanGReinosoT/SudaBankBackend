package com.sudamericano.bank.domain.ports.inputs.structure.R;

import com.sudamericano.bank.domain.model.structure.R.R08Dto;

import java.util.List;

public interface R08UseCase {
    List<R08Dto> findAll();
    R08Dto findById(Long id);
    R08Dto create(R08Dto dto);
    R08Dto update(Long id, R08Dto dto);
    void delete(Long id);
}
