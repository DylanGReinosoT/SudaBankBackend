package com.sudamericano.bank.domain.services.catalog;

import com.sudamericano.bank.domain.model.catalog.T209Dto;
import com.sudamericano.bank.domain.ports.inputs.catalog.T209UseCase;
import com.sudamericano.bank.domain.ports.outputs.catalog.T209Port;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class T209Service implements T209UseCase {

    private final T209Port port;

    public T209Service(T209Port port) {
        this.port = port;
    }

    public List<T209Dto> findAll() {
        return port.findAll();
    }

    @Override
    public T209Dto findById(Integer id) {
        return port.findById(id);
    }


}
