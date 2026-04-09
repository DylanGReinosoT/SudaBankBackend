package com.sudamericano.bank.domain.services.catalog;

import com.sudamericano.bank.domain.model.catalog.T75Dto;
import com.sudamericano.bank.domain.ports.inputs.catalog.T75UseCase;
import com.sudamericano.bank.domain.ports.outputs.catalog.T75Port;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class T75Service implements T75UseCase {
    private final T75Port port;

    public T75Service(T75Port port) {
        this.port = port;
    }

    @Override
    public List<T75Dto> findAll() {
        return port.findAll();
    }

    @Override
    public T75Dto findById(Integer id) {
        return port.findById(id);
    }
}
