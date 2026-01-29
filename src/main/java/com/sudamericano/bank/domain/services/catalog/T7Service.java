package com.sudamericano.bank.domain.services.catalog;

import com.sudamericano.bank.domain.model.catalog.T7Dto;
import com.sudamericano.bank.domain.ports.inputs.catalog.T7UseCase;
import com.sudamericano.bank.domain.ports.outputs.catalog.T7Port;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class T7Service implements T7UseCase {
    private final T7Port port;

    public T7Service(T7Port port) {
        this.port = port;
    }

    public List<T7Dto> findAll() {
        return port.findAll();
    }

    @Override
    public T7Dto findById(Integer id) {
        return port.findById(id);
    }
}
