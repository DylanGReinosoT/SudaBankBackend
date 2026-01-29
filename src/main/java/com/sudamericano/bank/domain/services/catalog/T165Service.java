package com.sudamericano.bank.domain.services.catalog;

import com.sudamericano.bank.domain.model.catalog.T165Dto;
import com.sudamericano.bank.domain.ports.inputs.catalog.T165UseCase;
import com.sudamericano.bank.domain.ports.outputs.catalog.T165Port;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class T165Service implements T165UseCase {

    private final T165Port port;

    public T165Service(T165Port port) {
        this.port = port;
    }

    public List<T165Dto> findAll() {
        return port.findAll();
    }

    public T165Dto findById(Integer id) {
        return port.findById(id);
    }
}
