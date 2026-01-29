package com.sudamericano.bank.domain.services.catalog;

import com.sudamericano.bank.domain.model.catalog.T38Dto;
import com.sudamericano.bank.domain.ports.inputs.catalog.T38UseCase;
import com.sudamericano.bank.domain.ports.outputs.catalog.T38Port;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class T38Service implements T38UseCase {

    private final T38Port port;

    public T38Service(T38Port port) {
        this.port = port;
    }

    public List<T38Dto> findAll() {
        return port.findAll();
    }

    @Override
    public T38Dto findById(Integer id) {
        return port.findById(id);
    }


}
