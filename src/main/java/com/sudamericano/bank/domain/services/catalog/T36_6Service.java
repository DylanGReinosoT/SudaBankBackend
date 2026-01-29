package com.sudamericano.bank.domain.services.catalog;

import com.sudamericano.bank.domain.model.catalog.T36_6Dto;
import com.sudamericano.bank.domain.ports.inputs.catalog.T36_6UseCase;
import com.sudamericano.bank.domain.ports.outputs.catalog.T36_6Port;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class T36_6Service implements T36_6UseCase {

    private final T36_6Port port;

    public T36_6Service(T36_6Port port) {
        this.port = port;
    }

    public List<T36_6Dto> findAll() {
        return port.findAll();
    }

    @Override
    public T36_6Dto findById(Integer id) {
        return port.findById(id);
    }
}
