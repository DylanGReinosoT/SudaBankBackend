package com.sudamericano.bank.domain.services.catalog;

import com.sudamericano.bank.domain.model.catalog.T37Dto;
import com.sudamericano.bank.domain.ports.inputs.catalog.T37UseCase;
import com.sudamericano.bank.domain.ports.outputs.catalog.T37Port;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class T37Service implements T37UseCase {

    private final T37Port port;

    public T37Service(T37Port port) {
        this.port = port;
    }

    public List<T37Dto> findAll() {
        return port.findAll();
    }

    @Override
    public T37Dto findById(Integer id) {
        return port.findById(id);
    }
}
