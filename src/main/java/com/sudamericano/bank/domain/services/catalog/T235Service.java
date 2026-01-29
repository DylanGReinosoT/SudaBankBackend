package com.sudamericano.bank.domain.services.catalog;

import com.sudamericano.bank.domain.model.catalog.T235Dto;
import com.sudamericano.bank.domain.ports.inputs.catalog.T235UseCase;
import com.sudamericano.bank.domain.ports.outputs.catalog.T235Port;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class T235Service implements T235UseCase {

    private final T235Port port;

    public T235Service(T235Port port) {
        this.port = port;
    }

    public List<T235Dto> findAll() {
        return port.findAll();
    }

    @Override
    public T235Dto findById(Integer id) {
        return port.findById(id);
    }

}
