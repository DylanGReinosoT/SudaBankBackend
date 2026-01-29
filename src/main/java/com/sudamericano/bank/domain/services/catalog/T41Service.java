package com.sudamericano.bank.domain.services.catalog;

import com.sudamericano.bank.domain.model.catalog.T41Dto;
import com.sudamericano.bank.domain.ports.inputs.catalog.T41UseCase;
import com.sudamericano.bank.domain.ports.outputs.catalog.T41Port;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class T41Service implements T41UseCase {

    private final T41Port port;

    public T41Service(T41Port port) {
        this.port = port;
    }

    public List<T41Dto> findAll(){
        return port.findAll();
    }

    @Override
    public T41Dto findById(Integer id){
        return port.findById(id);
    }
}
