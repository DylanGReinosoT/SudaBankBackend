package com.sudamericano.bank.domain.services.catalog;

import com.sudamericano.bank.domain.model.catalog.T171Dto;
import com.sudamericano.bank.domain.ports.inputs.catalog.T171UseCase;
import com.sudamericano.bank.domain.ports.outputs.catalog.T171Port;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class T171Service implements T171UseCase{

    private final T171Port port;

    public T171Service(T171Port port) {
        this.port = port;
    }

    @Override
    public List<T171Dto> findAll() {
        return port.findAll();
    }

    @Override
    public T171Dto findById(Integer id) {
        return port.findById(id);
    }
}
