package com.sudamericano.bank.domain.services.catalog;

import com.sudamericano.bank.domain.model.catalog.T2Dto;
import com.sudamericano.bank.domain.ports.inputs.catalog.T2UseCase;
import com.sudamericano.bank.domain.ports.outputs.catalog.T2Port;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class T2Service implements T2UseCase {

    private final T2Port port;

    public T2Service(T2Port port) {
        this.port = port;
    }

    public List<T2Dto> findAll(){
        return port.findAll();
    }

    @Override
    public T2Dto findById(Integer id){
        return port.findById(id);
    }
}
