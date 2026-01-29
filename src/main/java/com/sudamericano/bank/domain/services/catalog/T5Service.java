package com.sudamericano.bank.domain.services.catalog;

import com.sudamericano.bank.domain.model.catalog.T5Dto;
import com.sudamericano.bank.domain.ports.inputs.catalog.T5UseCase;
import com.sudamericano.bank.domain.ports.outputs.catalog.T5RepositoryPort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class T5Service implements T5UseCase {

    private final T5RepositoryPort port;

    public T5Service(T5RepositoryPort port) {
        this.port = port;
    }

    public List<T5Dto> findAll() {
        return port.findAll();
    }

    @Override
    public T5Dto findById(Integer id) {
        return port.findById(id);
    }
}
