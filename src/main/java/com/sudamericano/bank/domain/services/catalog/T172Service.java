package com.sudamericano.bank.domain.services.catalog;

import com.sudamericano.bank.domain.model.catalog.T172Dto;
import com.sudamericano.bank.domain.ports.inputs.catalog.T172UseCase;
import com.sudamericano.bank.domain.ports.outputs.catalog.T172RepositoryPort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class T172Service implements T172UseCase {

    private final T172RepositoryPort port;

    public T172Service(T172RepositoryPort port) {
        this.port = port;
    }

    public List<T172Dto> findAll() {
        return port.findAll();
    }

    @Override
    public T172Dto findById(Integer id) {
        return port.findById(id);
    }
}
