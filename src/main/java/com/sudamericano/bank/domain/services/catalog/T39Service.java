package com.sudamericano.bank.domain.services.catalog;

import com.sudamericano.bank.domain.model.catalog.T39Dto;
import com.sudamericano.bank.domain.ports.inputs.catalog.T39UseCase;
import com.sudamericano.bank.domain.ports.outputs.catalog.T39Port;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class T39Service implements T39UseCase {

    private final T39Port port;

    public T39Service(T39Port port) {
        this.port = port;
    }

    public List<T39Dto> findAll(){
        return port.findAll();
    }

    @Override
    public T39Dto findById(Integer id){
        return port.findById(id);
    }
}
