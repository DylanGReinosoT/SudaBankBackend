package com.sudamericano.bank.domain.services.catalog;

import com.sudamericano.bank.domain.model.catalog.T42Dto;
import com.sudamericano.bank.domain.ports.inputs.catalog.T42UseCase;
import com.sudamericano.bank.domain.ports.outputs.catalog.T42Port;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class T42Service implements T42UseCase {

    private final T42Port port;

    public T42Service(T42Port port) {
        this.port = port;
    }

    @Override
    public List<T42Dto> findAll() {
        return port.findAll();
    }

    @Override
    public T42Dto findById(Integer id) {
        return port.findById(id);
    }
}
