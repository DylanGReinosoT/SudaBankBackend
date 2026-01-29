package com.sudamericano.bank.domain.services.structure.R;

import com.sudamericano.bank.domain.model.structure.R.R09Dto;
import com.sudamericano.bank.domain.ports.inputs.structure.R.R09UseCase;
import com.sudamericano.bank.domain.ports.outputs.structure.R.R09Port;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class R09Service implements R09UseCase {

    private final R09Port port;

    public R09Service(R09Port port) {
        this.port = port;
    }

    public List<R09Dto> findAll() {
        return port.findAll();
    }

    public R09Dto findById(Long id) {
        return port.findById(id);
    }

    public R09Dto create(R09Dto dto) {
        return port.create(dto);
    }

    public R09Dto update(Long id, R09Dto dto) {
        return port.update(id, dto);
    }

    public void delete(Long id) {
        port.delete(id);
    }
}
