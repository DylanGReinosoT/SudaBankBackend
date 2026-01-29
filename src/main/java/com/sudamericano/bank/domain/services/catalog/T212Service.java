package com.sudamericano.bank.domain.services.catalog;

import com.sudamericano.bank.domain.model.catalog.T212Dto;
import com.sudamericano.bank.domain.ports.inputs.catalog.T212UseCase;
import com.sudamericano.bank.domain.ports.outputs.catalog.T212Port;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class T212Service implements T212UseCase {
    private final T212Port port;

    public T212Service(T212Port port) {
        this.port = port;
    }

    public List<T212Dto> findAll() {
        return port.findAll();
    }

    @Override
    public T212Dto findById(Integer id) {
        return port.findById(id);
    }
}
