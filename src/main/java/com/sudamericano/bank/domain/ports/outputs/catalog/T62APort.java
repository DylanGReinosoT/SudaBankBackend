package com.sudamericano.bank.domain.ports.outputs.catalog;

import com.sudamericano.bank.domain.model.catalog.T62ADto;

import java.util.List;

public interface T62APort {
    List<T62ADto> findAll();
    T62ADto findById(Integer id);
}
