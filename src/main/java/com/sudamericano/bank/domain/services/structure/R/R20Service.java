package com.sudamericano.bank.domain.services.structure.R;

import com.sudamericano.bank.domain.model.structure.R.R20Dto;
import com.sudamericano.bank.domain.ports.inputs.structure.R.R20UseCase;
import com.sudamericano.bank.domain.ports.outputs.structure.R.R20Port;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class R20Service implements R20UseCase {
    private final R20Port port;

    public R20Service(R20Port port) {
        this.port = port;
    }

    public List<R20Dto> findAll() {
        return port.findAll();
    }

    public R20Dto findById(Long id) {
        return port.findById(id);
    }

    public R20Dto create(R20Dto dto) {
        return port.create(dto);
    }

    public R20Dto update(Long id, R20Dto dto) {
        return port.update(id, dto);
    }

    public void delete(Long id) {
        port.delete(id);
    }
    
}
