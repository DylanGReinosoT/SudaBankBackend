package com.sudamericano.bank.domain.services.catalog;

import com.sudamericano.bank.domain.model.catalog.T208Dto;
import com.sudamericano.bank.domain.ports.inputs.catalog.T208UseCase;
import com.sudamericano.bank.domain.ports.outputs.catalog.T208Port;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class T208Service implements T208UseCase {

    private final T208Port port;

    public T208Service(T208Port port) {
        this.port = port;
    }

    public List<T208Dto> findAll(){
        return port.findAll();
    }

    @Override
    public T208Dto findById(Integer id){
        return port.findById(id);
    }
}
