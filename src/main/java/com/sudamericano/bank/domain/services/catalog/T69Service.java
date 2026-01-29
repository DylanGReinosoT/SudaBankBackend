package com.sudamericano.bank.domain.services.catalog;

import com.sudamericano.bank.domain.model.catalog.T69Dto;
import com.sudamericano.bank.domain.ports.inputs.catalog.T69UseCase;
import com.sudamericano.bank.domain.ports.outputs.catalog.T69Port;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class T69Service implements T69UseCase {

    private final T69Port port;

    public T69Service(T69Port port) {
        this.port = port;
    }

    public List<T69Dto> findAll() {
        return port.findAll();
    }

    public T69Dto findById(Integer id) {
        return port.findById(id);
    }
}
