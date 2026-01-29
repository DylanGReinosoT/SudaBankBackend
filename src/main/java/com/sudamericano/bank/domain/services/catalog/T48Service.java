package com.sudamericano.bank.domain.services.catalog;

import com.sudamericano.bank.domain.model.catalog.T48Dto;
import com.sudamericano.bank.domain.ports.inputs.catalog.T48UseCase;
import com.sudamericano.bank.domain.ports.outputs.catalog.T48Port;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class T48Service implements T48UseCase {

    private final T48Port port;

    public T48Service(T48Port port) {
        this.port = port;
    }

    public List<T48Dto> findAll(){
        return port.findAll();
    }

    @Override
    public T48Dto findById(Integer id){
        return port.findById(id);
    }
}
