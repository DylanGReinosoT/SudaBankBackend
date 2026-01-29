package com.sudamericano.bank.domain.services.catalog;

import com.sudamericano.bank.domain.model.catalog.T50Dto;
import com.sudamericano.bank.domain.ports.inputs.catalog.T50UseCase;
import com.sudamericano.bank.domain.ports.outputs.catalog.T50Port;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class T50Service implements T50UseCase {
    private final T50Port port;

    public T50Service(T50Port port) {
        this.port = port;
    }

    public List<T50Dto> findAll() {
        return port.findAll();
    }

    @Override
    public T50Dto findById(Integer id) {
        return port.findById(id);
    }
}
