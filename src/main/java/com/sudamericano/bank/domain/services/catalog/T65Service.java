package com.sudamericano.bank.domain.services.catalog;

import com.sudamericano.bank.domain.model.catalog.T65Dto;
import com.sudamericano.bank.domain.ports.inputs.catalog.T65UseCase;
import com.sudamericano.bank.domain.ports.outputs.catalog.T65RepositoryPort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class T65Service implements T65UseCase {

    private final T65RepositoryPort port;

    public T65Service(T65RepositoryPort port) {
        this.port = port;
    }

    public List<T65Dto> findAll() {
        return port.findAll();
    }
}
