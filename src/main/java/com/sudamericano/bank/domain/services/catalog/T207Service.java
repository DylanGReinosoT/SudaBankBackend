package com.sudamericano.bank.domain.services.catalog;

import com.sudamericano.bank.domain.model.catalog.T207Dto;
import com.sudamericano.bank.domain.ports.inputs.catalog.T207UseCase;
import com.sudamericano.bank.domain.ports.outputs.catalog.T207Port;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class T207Service implements T207UseCase {

    private final T207Port port;

    public T207Service(T207Port port) {
        this.port = port;
    }

    public List<T207Dto> findAll() {
        return port.findAll();
    }

    @Override
    public T207Dto findById(Integer id) {
        return port.findById(id);
    }

}
