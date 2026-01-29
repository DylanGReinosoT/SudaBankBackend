package com.sudamericano.bank.domain.services.catalog;

import com.sudamericano.bank.domain.model.catalog.T31Dto;
import com.sudamericano.bank.domain.ports.inputs.catalog.T31UseCase;
import com.sudamericano.bank.domain.ports.outputs.catalog.T31Port;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class T31Service implements T31UseCase {

    public T31Port port;

    public T31Service(T31Port port) {
        this.port = port;
    }

    public List<T31Dto> findAll() {
        return port.findAll();
    }

    @Override
    public T31Dto findById(Integer id) {
        return port.findById(id);
    }



}
