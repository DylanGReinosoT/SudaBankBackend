package com.sudamericano.bank.domain.ports.inputs.structure.L;

import com.sudamericano.bank.domain.model.structure.L.StructureL01Dto;

import java.util.List;

public interface L01UseCase {
    List<StructureL01Dto> findAll();
    List<StructureL01Dto> findByFilter(StructureL01Dto dto);
    StructureL01Dto findById(Integer id);
    StructureL01Dto create(StructureL01Dto dto);
    StructureL01Dto update(Integer id, StructureL01Dto dto);
    void delete(Integer id);
}
