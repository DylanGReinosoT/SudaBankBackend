package com.sudamericano.bank.domain.services.catalog;

import com.sudamericano.bank.domain.model.catalog.T45Dto;
import com.sudamericano.bank.domain.ports.inputs.catalog.T45UseCase;
import com.sudamericano.bank.domain.ports.outputs.catalog.T45Port;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class T45Service implements T45UseCase {
    private final T45Port port;

    public T45Service(T45Port port) {
        this.port = port;
    }

    public List<T45Dto> findAll() {
        return port.findAll();
    }

    @Override
    public T45Dto findById(Integer id) {
        return port.findById(id);
    }
}
