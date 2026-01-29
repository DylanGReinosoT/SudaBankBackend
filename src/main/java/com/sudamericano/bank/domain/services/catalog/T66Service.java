package com.sudamericano.bank.domain.services.catalog;

import com.sudamericano.bank.domain.model.catalog.T66Dto;
import com.sudamericano.bank.domain.ports.inputs.catalog.T66UseCase;
import com.sudamericano.bank.domain.ports.outputs.catalog.T66RepositoryPort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class T66Service implements T66UseCase {

    private final T66RepositoryPort port;

    public T66Service(T66RepositoryPort port) {
        this.port = port;
    }

    public List<T66Dto> findAll() {
        return port.findAll();
    }
}
