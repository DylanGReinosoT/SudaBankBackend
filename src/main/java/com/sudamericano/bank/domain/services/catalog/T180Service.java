package com.sudamericano.bank.domain.services.catalog;

import com.sudamericano.bank.domain.model.catalog.T180Dto;
import com.sudamericano.bank.domain.ports.inputs.catalog.T180UseCase;
import com.sudamericano.bank.domain.ports.outputs.catalog.T180Port;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class T180Service implements T180UseCase {

    private final T180Port port;

    public T180Service(T180Port port) {
        this.port = port;
    }

    @Override
    public List<T180Dto> findAll() {
        return port.findAll();
    }

    @Override
    public T180Dto findById(Integer id) {
        return port.findById(id);
    }
}
