package com.sudamericano.bank.domain.services.catalog;

import com.sudamericano.bank.domain.model.catalog.T44Dto;
import com.sudamericano.bank.domain.ports.inputs.catalog.T44UseCase;
import com.sudamericano.bank.domain.ports.outputs.catalog.T44Port;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class T44Service implements T44UseCase {

    private final T44Port port;

    public T44Service(T44Port port) {
        this.port = port;
    }

    @Override
    public List<T44Dto> findAll() {
        return port.findAll();
    }

    @Override
    public T44Dto findById(Integer id) {
        return port.findById(id);
    }
}
