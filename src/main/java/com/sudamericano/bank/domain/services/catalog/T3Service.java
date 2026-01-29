package com.sudamericano.bank.domain.services.catalog;

import com.sudamericano.bank.domain.model.catalog.T3Dto;
import com.sudamericano.bank.domain.ports.inputs.catalog.T3UseCase;
import com.sudamericano.bank.domain.ports.outputs.catalog.T3Port;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class T3Service implements T3UseCase {

    private final T3Port port;

    public T3Service(T3Port port) {
        this.port = port;
    }

    public List<T3Dto> findAll() {
        return port.findAll();
    }

    @Override
    public T3Dto findById(Integer id) {
        return port.findById(id);
    }
}
