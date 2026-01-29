package com.sudamericano.bank.domain.ports.inputs.catalog;


import com.sudamericano.bank.domain.model.catalog.T32_ADto;


import java.util.List;

public interface T32_AUseCase {

    List<T32_ADto> findAll();
    T32_ADto findById(Integer id);
}
