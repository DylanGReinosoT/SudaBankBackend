package com.sudamericano.bank.domain.services.catalog;

import com.sudamericano.bank.domain.model.catalog.T214Dto;
import com.sudamericano.bank.domain.ports.inputs.catalog.T214UseCase;
import com.sudamericano.bank.domain.ports.outputs.catalog.T214Port;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class T214Service implements T214UseCase {
    private final T214Port port;

    public T214Service(T214Port port) {
        this.port = port;
    }

    public List<T214Dto> findAll() {
        return port.findAll();
    }

    @Override
    public T214Dto findById(Integer id) {
        return port.findById(id);
    }
}
