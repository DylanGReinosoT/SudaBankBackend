package com.sudamericano.bank.domain.services.catalog;

import com.sudamericano.bank.domain.model.catalog.T170Dto;
import com.sudamericano.bank.domain.ports.inputs.catalog.T170UseCase;
import com.sudamericano.bank.domain.ports.outputs.catalog.T170Port;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class T170Service implements T170UseCase {

    private final T170Port port;

    public T170Service(T170Port port) {
        this.port = port;
    }

    public List<T170Dto> findAll() {
        return port.findAll();
    }

    public T170Dto findById(Integer id) {
        return port.findById(id);
    }
}
