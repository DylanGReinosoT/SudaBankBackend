package com.sudamericano.bank.domain.services.catalog;

import com.sudamericano.bank.domain.model.catalog.T25Dto;
import com.sudamericano.bank.domain.ports.inputs.catalog.T25UseCase;
import com.sudamericano.bank.domain.ports.outputs.catalog.T25Port;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class T25Service  implements T25UseCase {

    private final T25Port port;

    public T25Service(T25Port port) {
        this.port = port;
    }

    public List<T25Dto> findAll() {
        return port.findAll();
    }

    @Override
    public T25Dto findById(Integer id) {
        return port.findById(id);
    }


}
