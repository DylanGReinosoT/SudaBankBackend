package com.sudamericano.bank.domain.services.catalog;

import com.sudamericano.bank.domain.model.catalog.T79Dto;
import com.sudamericano.bank.domain.ports.inputs.catalog.T79UseCase;
import com.sudamericano.bank.domain.ports.outputs.catalog.T79Port;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class T79Service implements T79UseCase {

    private final T79Port port;

    public T79Service(T79Port port) {
        this.port = port;
    }

    public List<T79Dto> findAll() {
        return port.findAll();
    }

    public T79Dto findById(Integer id) {
        return port.findById(id);
    }
}
