package com.sudamericano.bank.domain.services.catalog;

import com.sudamericano.bank.domain.model.catalog.T28Dto;
import com.sudamericano.bank.domain.ports.inputs.catalog.T28UseCase;
import com.sudamericano.bank.domain.ports.outputs.catalog.T28Port;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class T28Service implements T28UseCase {

    private final T28Port port;

    public T28Service(T28Port port) {
        this.port = port;
    }

    public List<T28Dto> findAll() {
        return port.findAll();
    }

    @Override
    public T28Dto findById(Integer id) {
        return port.findById(id);
    }
}
