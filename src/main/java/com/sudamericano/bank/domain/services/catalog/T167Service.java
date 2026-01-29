package com.sudamericano.bank.domain.services.catalog;

import com.sudamericano.bank.domain.model.catalog.T167Dto;
import com.sudamericano.bank.domain.ports.inputs.catalog.T167UseCase;
import com.sudamericano.bank.domain.ports.outputs.catalog.T167Port;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class T167Service implements T167UseCase {

    private final T167Port port;

    public T167Service(T167Port port) {
        this.port = port;
    }

    public List<T167Dto> findAll() {
        return port.findAll();
    }

    public T167Dto findById(Integer id) {
        return port.findById(id);
    }
}
