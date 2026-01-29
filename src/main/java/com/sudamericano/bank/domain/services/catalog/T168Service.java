package com.sudamericano.bank.domain.services.catalog;

import com.sudamericano.bank.domain.model.catalog.T168Dto;
import com.sudamericano.bank.domain.ports.inputs.catalog.T168UseCase;
import com.sudamericano.bank.domain.ports.outputs.catalog.T168Port;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class T168Service implements T168UseCase {

    private final T168Port port;

    public T168Service(T168Port port) {
        this.port = port;
    }

    public List<T168Dto> findAll() {
        return port.findAll();
    }

    public T168Dto findById(Integer id) {
        return port.findById(id);
    }
}
