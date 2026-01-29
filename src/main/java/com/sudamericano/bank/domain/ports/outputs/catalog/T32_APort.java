package com.sudamericano.bank.domain.ports.outputs.catalog;

import com.sudamericano.bank.domain.model.catalog.T32_ADto;

import java.util.List;

public interface T32_APort {
    List<T32_ADto> findAll();
    T32_ADto findById(Integer id);
}
