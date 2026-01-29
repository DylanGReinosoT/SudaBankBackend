package com.sudamericano.bank.domain.services.catalog;

import com.sudamericano.bank.domain.model.catalog.T47Dto;
import com.sudamericano.bank.domain.ports.inputs.catalog.T47UseCase;
import com.sudamericano.bank.domain.ports.outputs.catalog.T47Port;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class T47Service implements T47UseCase {

    private final T47Port port;

    public T47Service(T47Port port) {
        this.port = port;
    }

    public List<T47Dto> findAll(){
        return port.findAll();
    }

    @Override
    public T47Dto findById(Integer id){
        return port.findById(id);
    }
}
