package com.sudamericano.bank.domain.services.catalog;

import com.sudamericano.bank.domain.model.catalog.T41_ADto;
import com.sudamericano.bank.domain.ports.inputs.catalog.T41_AUseCase;
import com.sudamericano.bank.domain.ports.outputs.catalog.T41_APort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class T41_AService implements T41_AUseCase {
    private final T41_APort port;

    public T41_AService(T41_APort port) {
        this.port = port;
    }

    public List<T41_ADto> findAll() {
        return port.findAll();
    }

    @Override
    public T41_ADto findById(Integer id) {
        return port.findById(id);
    }
}
