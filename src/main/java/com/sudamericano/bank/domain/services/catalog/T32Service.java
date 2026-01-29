package com.sudamericano.bank.domain.services.catalog;

import com.sudamericano.bank.domain.model.catalog.T32Dto;
import com.sudamericano.bank.domain.ports.inputs.catalog.T32UseCase;
import com.sudamericano.bank.domain.ports.outputs.catalog.T32Port;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class T32Service implements T32UseCase {

    private final T32Port port;

    public T32Service(T32Port port) {
        this.port = port;
    }

    public List<T32Dto> findAll() {
        return port.findAll();
    }

    @Override
    public T32Dto findById(Integer id) {
        return port.findById(id);
    }
}
