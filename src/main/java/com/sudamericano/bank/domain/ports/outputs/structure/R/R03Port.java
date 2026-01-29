package com.sudamericano.bank.domain.ports.outputs.structure.R;

import com.sudamericano.bank.domain.model.structure.R.R03Dto;

import java.util.List;

public interface R03Port 
{
    List<R03Dto> findAll();
    R03Dto findById(Long id);
    R03Dto create(R03Dto dto);
    R03Dto update(Long id, R03Dto dto);
    void delete(Long id);
}
