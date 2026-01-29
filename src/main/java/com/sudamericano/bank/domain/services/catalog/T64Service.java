package com.sudamericano.bank.domain.services.catalog;

import com.sudamericano.bank.domain.model.catalog.T64Dto;
import com.sudamericano.bank.domain.ports.inputs.catalog.T64UseCase;
import com.sudamericano.bank.domain.ports.outputs.catalog.T64Port;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class T64Service implements T64UseCase {

    private final T64Port port;

    public T64Service(T64Port port) {
        this.port = port;
    }

    public List<T64Dto> findAll() {
        return port.findAll();
    }

    public T64Dto findById(Integer id) {
        return port.findById(id);
    }

    public T64Dto create(T64Dto dto) {
        return port.create(dto);
    }

    public T64Dto update(Integer id, T64Dto dto) {
        return port.update(id, dto);
    }

    public void delete(Integer id) {
        port.delete(id);
    }
}
