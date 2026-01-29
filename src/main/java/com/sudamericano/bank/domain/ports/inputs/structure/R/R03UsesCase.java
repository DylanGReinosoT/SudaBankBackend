package com.sudamericano.bank.domain.ports.inputs.structure.R;

import com.sudamericano.bank.domain.model.structure.R.R03Dto;

import java.util.List;

public interface R03UsesCase 
{
    List<R03Dto> findAll();
    R03Dto findById(Long id);
    R03Dto create(R03Dto dto);
    R03Dto update(Long id, R03Dto dto);
    void delete(Long id);
}
