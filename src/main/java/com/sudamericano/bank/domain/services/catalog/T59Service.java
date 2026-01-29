package com.sudamericano.bank.domain.services.catalog;

import com.sudamericano.bank.domain.model.catalog.T59Dto;
import com.sudamericano.bank.domain.ports.inputs.catalog.T59UseCase;
import com.sudamericano.bank.domain.ports.outputs.catalog.T59Port;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class T59Service implements T59UseCase {

    private final T59Port port;

    public T59Service(T59Port port) { this.port = port; }

    public List<T59Dto> findAll() { return port.findAll(); }

    public T59Dto findById(Integer id) {
        return port.findById(id);
    }
}
