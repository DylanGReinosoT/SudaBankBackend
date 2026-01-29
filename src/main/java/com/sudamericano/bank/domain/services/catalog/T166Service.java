package com.sudamericano.bank.domain.services.catalog;

import com.sudamericano.bank.domain.model.catalog.T166Dto;
import com.sudamericano.bank.domain.ports.inputs.catalog.T166UseCase;
import com.sudamericano.bank.domain.ports.outputs.catalog.T166Port;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class T166Service implements T166UseCase {

    private final T166Port port;

    public T166Service(T166Port port) {
        this.port = port;
    }

    public List<T166Dto> findAll() {
        return port.findAll();
    }

    public T166Dto findById(Integer id) {
        return port.findById(id);
    }
}
