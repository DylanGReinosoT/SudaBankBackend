package com.sudamericano.bank.domain.ports.outputs.catalog;

import com.sudamericano.bank.domain.model.catalog.T41_ADto;

import java.util.List;

public interface T41_APort {
    List<T41_ADto> findAll();
    T41_ADto findById(Integer id);
}
