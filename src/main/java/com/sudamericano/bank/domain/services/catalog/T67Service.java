package com.sudamericano.bank.domain.services.catalog;

import com.sudamericano.bank.domain.model.catalog.T67Dto;
import com.sudamericano.bank.domain.ports.inputs.catalog.T67UseCase;
import com.sudamericano.bank.domain.ports.outputs.catalog.T67Port;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class T67Service implements T67UseCase {

    private final T67Port port;

    public T67Service(T67Port port) {
        this.port = port;
    }

    public List<T67Dto> findAll() {
        return port.findAll();
    }

    public T67Dto findById(Integer id) {
        return port.findById(id);
    }
}
