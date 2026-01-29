package com.sudamericano.bank.domain.services.structure.R;

import com.sudamericano.bank.domain.model.structure.R.R07Dto;
import com.sudamericano.bank.domain.ports.inputs.structure.R.R07UseCase;
import com.sudamericano.bank.domain.ports.outputs.structure.R.R07Port;
import com.sudamericano.bank.infrastructure.outputs.structure.R07ResumeResponse;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class R07Service implements R07UseCase {

    private final R07Port port;

    public R07Service(R07Port port) {
        this.port = port;
    }

    public List<R07Dto> findAll() {
        return port.findAll();
    }

    public R07Dto findById(Long id) {
        return port.findById(id);
    }

    public R07Dto create(R07Dto dto) {
        return port.create(dto);
    }

    public R07Dto update(Long id, R07Dto dto) {
        return port.update(id, dto);
    }

    public void delete(Long id) {
        port.delete(id);
    }

}
