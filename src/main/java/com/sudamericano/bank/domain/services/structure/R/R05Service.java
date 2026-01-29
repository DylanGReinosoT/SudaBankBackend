package com.sudamericano.bank.domain.services.structure.R;

import com.sudamericano.bank.domain.model.structure.R.R05Dto;
import com.sudamericano.bank.domain.ports.inputs.structure.R.R05UseCase;
import com.sudamericano.bank.domain.ports.outputs.structure.R.R05Port;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class R05Service implements R05UseCase {

    private final R05Port port;

    public R05Service(R05Port port) {
        this.port = port;
    }

    public List<R05Dto> findAll() {
        return port.findAll();
    }

    public R05Dto findById(Long id) {
        return port.findById(id);
    }

    public R05Dto create(R05Dto dto) {
        return port.create(dto);
    }

    public R05Dto update(Long id, R05Dto dto) {
        return port.update(id, dto);
    }

    public void delete(Long id) {
        port.delete(id);
    }
}
