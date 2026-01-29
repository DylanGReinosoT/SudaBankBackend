package com.sudamericano.bank.domain.services.catalog;

import com.sudamericano.bank.domain.model.catalog.T6Dto;
import com.sudamericano.bank.domain.ports.inputs.catalog.T6UseCase;
import com.sudamericano.bank.domain.ports.outputs.catalog.T6Port;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class T6Service implements T6UseCase {
    private final T6Port port;

    public T6Service(T6Port port) {
        this.port = port;
    }

    public List<T6Dto> findAll() {
        return port.findAll();
    }

    @Override
    public T6Dto findById(Integer id) {
        return port.findById(id);
    }
}
