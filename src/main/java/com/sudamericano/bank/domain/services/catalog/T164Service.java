package com.sudamericano.bank.domain.services.catalog;

import com.sudamericano.bank.domain.model.catalog.T164Dto;
import com.sudamericano.bank.domain.ports.inputs.catalog.T164UseCase;
import com.sudamericano.bank.domain.ports.outputs.catalog.T164Port;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class T164Service implements T164UseCase {

    private final T164Port port;

    public T164Service(T164Port port) {
        this.port = port;
    }

    public List<T164Dto> findAll() {
        return port.findAll();
    }

    public T164Dto findById(Integer id) {
        return port.findById(id);
    }

    public T164Dto create(T164Dto dto) {
        return port.create(dto);
    }

    public T164Dto update(Integer id, T164Dto dto) {
        return port.update(id, dto);
    }

    public void delete(Integer id) {
        port.delete(id);
    }
}
