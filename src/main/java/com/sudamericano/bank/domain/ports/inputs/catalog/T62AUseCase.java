package com.sudamericano.bank.domain.ports.inputs.catalog;

import com.sudamericano.bank.domain.model.catalog.T62ADto;

import java.util.List;

public interface T62AUseCase {
    List<T62ADto> findAll();
    T62ADto findById(Integer id);
}
