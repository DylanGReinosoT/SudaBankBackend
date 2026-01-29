package com.sudamericano.bank.domain.ports.outputs.structure.R;



import com.sudamericano.bank.domain.model.structure.R.R02Dto;

import java.util.List;

public interface R02Port {
    List<R02Dto> findAll();
    R02Dto findById(Long id);
    R02Dto create(R02Dto dto);
    R02Dto update(Long id, R02Dto dto);
    void delete(Long id);
}
