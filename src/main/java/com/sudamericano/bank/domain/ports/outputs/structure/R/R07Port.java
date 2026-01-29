package com.sudamericano.bank.domain.ports.outputs.structure.R;

import com.sudamericano.bank.domain.model.structure.R.R07Dto;

import java.util.List;

public interface R07Port {
    List<R07Dto> findAll();
    R07Dto findById(Long id);
    R07Dto create(R07Dto dto);
    R07Dto update(Long id, R07Dto dto);
    void delete(Long id);
}
