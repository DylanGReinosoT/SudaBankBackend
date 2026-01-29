package com.sudamericano.bank.domain.ports.outputs.structure.R;

import com.sudamericano.bank.domain.model.structure.R.R04Dto;

import java.util.List;

public interface R04Port {
    List<R04Dto> findAll();
    R04Dto findById(Long id);
    R04Dto create(R04Dto dto);
    R04Dto update(Long id, R04Dto dto);
    void delete(Long id);
}