package com.sudamericano.bank.domain.services.structure.R;

import com.sudamericano.bank.domain.model.structure.R.R11Dto;
import com.sudamericano.bank.domain.ports.inputs.structure.R.R11UseCase;
import com.sudamericano.bank.domain.ports.outputs.structure.R.R11Port;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class R11Service implements R11UseCase {
    
    private final R11Port port;

    public R11Service(R11Port port) {
        this.port = port;
    }

    public List<R11Dto> findAll() {
        return port.findAll();
    }

    public R11Dto findById(Long id) {
        return port.findById(id);
    }

    public R11Dto create(R11Dto dto) {
        return port.create(dto);
    }

    public R11Dto update(Long id, R11Dto dto) {
        return port.update(id, dto);
    }

    public void delete(Long id) {
        port.delete(id);
    }
}
