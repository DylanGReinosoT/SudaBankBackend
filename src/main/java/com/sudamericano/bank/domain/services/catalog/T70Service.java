package com.sudamericano.bank.domain.services.catalog;

import com.sudamericano.bank.domain.model.catalog.T70Dto;
import com.sudamericano.bank.domain.ports.inputs.catalog.T70UseCase;
import com.sudamericano.bank.domain.ports.outputs.catalog.T70Port;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class T70Service implements T70UseCase {

    private final T70Port port;

    public T70Service(T70Port port) {
        this.port = port;
    }

    public List<T70Dto> findAll() {
        return port.findAll();
    }

    public T70Dto findById(Integer id) {
        return port.findById(id);
    }
}
