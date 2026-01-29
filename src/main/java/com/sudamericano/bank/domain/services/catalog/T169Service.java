package com.sudamericano.bank.domain.services.catalog;

import com.sudamericano.bank.domain.model.catalog.T169Dto;
import com.sudamericano.bank.domain.ports.inputs.catalog.T169UseCase;
import com.sudamericano.bank.domain.ports.outputs.catalog.T169Port;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class T169Service implements T169UseCase {

    private final T169Port port;

    public T169Service(T169Port port) {
        this.port = port;
    }

    public List<T169Dto> findAll() {
        return port.findAll();
    }

    public T169Dto findById(Integer id) {
        return port.findById(id);
    }
}
