package com.sudamericano.bank.domain.services.catalog;

import com.sudamericano.bank.domain.model.catalog.T62ADto;
import com.sudamericano.bank.domain.ports.inputs.catalog.T62AUseCase;
import com.sudamericano.bank.domain.ports.outputs.catalog.T62APort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class T62AService implements T62AUseCase {

    private final T62APort port;

    public T62AService(T62APort port) {
        this.port = port;
    }

    public List<T62ADto> findAll() {
        return port.findAll();
    }

    public T62ADto findById(Integer id) {
        return port.findById(id);
    }
}
