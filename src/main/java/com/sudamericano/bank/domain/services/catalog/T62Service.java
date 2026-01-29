package com.sudamericano.bank.domain.services.catalog;

import com.sudamericano.bank.domain.model.catalog.T62Dto;
import com.sudamericano.bank.domain.ports.inputs.catalog.T62UseCase;
import com.sudamericano.bank.domain.ports.outputs.catalog.T62Port;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class T62Service implements T62UseCase {
    private final T62Port port;

    public T62Service(T62Port port) {
        this.port = port;
    }

    public List<T62Dto> findAll() {
        return port.findAll();
    }

    @Override
    public T62Dto findById(Integer id) {
        return port.findById(id);
    }
}
