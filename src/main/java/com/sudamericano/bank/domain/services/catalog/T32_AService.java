package com.sudamericano.bank.domain.services.catalog;

import com.sudamericano.bank.domain.model.catalog.T32_ADto;
import com.sudamericano.bank.domain.ports.inputs.catalog.T32_AUseCase;
import com.sudamericano.bank.domain.ports.outputs.catalog.T32_APort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class T32_AService implements T32_AUseCase {

    private final T32_APort port;

    public T32_AService(T32_APort port) {
        this.port = port;
    }

    public List<T32_ADto> findAll() {
        return port.findAll();
    }

    @Override
    public T32_ADto findById(Integer id) {
        return port.findById(id);
    }
}
