package com.sudamericano.bank.domain.services.catalog;

import com.sudamericano.bank.domain.model.catalog.T33Dto;
import com.sudamericano.bank.domain.ports.inputs.catalog.T33UseCase;
import com.sudamericano.bank.domain.ports.outputs.catalog.T33RepositoryPort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class T33Service implements T33UseCase {

    private final T33RepositoryPort port;

    public T33Service(T33RepositoryPort port) {
        this.port = port;
    }

    public List<T33Dto> findAll() {
        return port.findAll();
    }

    @Override
    public T33Dto findById(Integer id) {
        return port.findById(id);
    }
}
