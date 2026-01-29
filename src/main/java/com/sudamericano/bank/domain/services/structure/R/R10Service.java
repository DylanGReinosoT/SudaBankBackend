package com.sudamericano.bank.domain.services.structure.R;

import com.sudamericano.bank.domain.model.structure.R.R10Dto;
import com.sudamericano.bank.domain.ports.inputs.structure.R.R10UseCase;
import com.sudamericano.bank.domain.ports.outputs.structure.R.R10Port;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class R10Service implements R10UseCase {
    private final R10Port port;

    public R10Service(R10Port port) {
        this.port = port;
    }

    public List<R10Dto> findAll() {
        return port.findAll();
    }

    public R10Dto findById(Long id) {
        return port.findById(id);
    }

    public R10Dto create(R10Dto dto) {
        return port.create(dto);
    }

    public R10Dto update(Long id, R10Dto dto) {
        return port.update(id, dto);
    }

    public void delete(Long id) {
        port.delete(id);
    }
}
