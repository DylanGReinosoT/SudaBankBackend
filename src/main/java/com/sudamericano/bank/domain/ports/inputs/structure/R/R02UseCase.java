package com.sudamericano.bank.domain.ports.inputs.structure.R;


import com.sudamericano.bank.domain.model.structure.R.R02Dto;

import java.util.List;

public interface R02UseCase {
    List<R02Dto> findAll();
    R02Dto findById(Long id);
    R02Dto create(R02Dto dto);
    R02Dto update(Long id, R02Dto dto);
    void delete(Long id);
}
