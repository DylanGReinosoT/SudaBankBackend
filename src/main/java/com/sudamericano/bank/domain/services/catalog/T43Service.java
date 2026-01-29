package com.sudamericano.bank.domain.services.catalog;

import com.sudamericano.bank.domain.model.catalog.T43Dto;
import com.sudamericano.bank.domain.ports.inputs.catalog.T43UseCase;
import com.sudamericano.bank.domain.ports.outputs.catalog.T43Port;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class T43Service implements T43UseCase {

    private final T43Port port;

    public T43Service(T43Port port) {
        this.port = port;
    }

    @Override
    public List<T43Dto> findAll() {
        return port.findAll();
    }

    @Override
    public T43Dto findById(Integer id) {
        return port.findById(id);
    }
}
