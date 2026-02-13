package com.sudamericano.bank.domain.services.catalog;

import com.sudamericano.bank.domain.model.catalog.T9Dto;
import com.sudamericano.bank.domain.ports.inputs.catalog.T9UseCase;
import com.sudamericano.bank.domain.ports.outputs.catalog.T9Port;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class T9Service implements T9UseCase {
    private final T9Port port;

    public T9Service(T9Port port) {
        this.port = port;
    }

    public List<T9Dto> findAll() {
        return port.findAll();
    }

    @Override
    public T9Dto findById(Integer id) {
        return port.findById(id);
    }
}
