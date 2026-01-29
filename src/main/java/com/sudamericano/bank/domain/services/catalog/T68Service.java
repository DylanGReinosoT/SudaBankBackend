package com.sudamericano.bank.domain.services.catalog;

import com.sudamericano.bank.domain.model.catalog.T68Dto;
import com.sudamericano.bank.domain.ports.inputs.catalog.T68UseCase;
import com.sudamericano.bank.domain.ports.outputs.catalog.T68Port;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class T68Service implements T68UseCase {

    private final T68Port port;

    public T68Service(T68Port port) {
        this.port = port;
    }

    public List<T68Dto> findAll() {
        return port.findAll();
    }

    public T68Dto findById(Integer id) {
        return port.findById(id);
    }
}
