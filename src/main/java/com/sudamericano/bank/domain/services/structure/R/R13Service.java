package com.sudamericano.bank.domain.services.structure.R;

import com.sudamericano.bank.domain.model.structure.R.R13Dto;
import com.sudamericano.bank.domain.ports.inputs.structure.R.R13UseCase;
import com.sudamericano.bank.domain.ports.outputs.structure.R.R13Port;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class R13Service implements R13UseCase {
    
    private final R13Port port;

    public R13Service(R13Port port) {
        this.port = port;
    }

    public List<R13Dto> findAll() {
        return port.findAll();
    }

    public R13Dto findById(Long id) {
        return port.findById(id);
    }

    public R13Dto create(R13Dto dto) {
        return port.create(dto);
    }

    public R13Dto update(Long id, R13Dto dto) {
        return port.update(id, dto);
    }

    public void delete(Long id) {
        port.delete(id);
    }
}
