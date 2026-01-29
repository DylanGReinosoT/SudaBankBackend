package com.sudamericano.bank.domain.ports.inputs.catalog;

import com.sudamericano.bank.domain.model.catalog.T41_ADto;

import java.util.List;

public interface T41_AUseCase {
    List<T41_ADto> findAll();
    T41_ADto findById(Integer id);
}
