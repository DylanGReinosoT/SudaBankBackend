package com.sudamericano.bank.domain.services.structure.R;

import com.sudamericano.bank.domain.model.structure.R.R01Dto;
import com.sudamericano.bank.domain.ports.inputs.structure.R.R01UseCase;
import com.sudamericano.bank.domain.ports.outputs.structure.R.R01Port;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class R01Service implements R01UseCase {
    private final R01Port port;

    public R01Service(R01Port port) {
        this.port = port;
    }

    public List<R01Dto> findAll() {
        return port.findAll();
    }

    public R01Dto findById(Long id) {
        return port.findById(id);
    }

    public R01Dto create(R01Dto dto) {
        return port.create(dto);
    }

    public R01Dto update(Long id, R01Dto dto) {
        return port.update(id, dto);
    }

    public void delete(Long id) {
        port.delete(id);
    }
}
