package com.sudamericano.bank.domain.services.catalog;

import com.sudamericano.bank.domain.model.catalog.T46Dto;
import com.sudamericano.bank.domain.ports.inputs.catalog.T46UseCase;
import com.sudamericano.bank.domain.ports.outputs.catalog.T46Port;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class T46Service implements T46UseCase {
    private final T46Port port;

    public T46Service(T46Port port) {
        this.port = port;
    }

    public List<T46Dto> findAll() {
        return port.findAll();
    }

    @Override
    public T46Dto findById(Integer id) {
        return port.findById(id);
    }
}
