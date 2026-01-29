package com.sudamericano.bank.domain.services.structure.R;

import com.sudamericano.bank.domain.model.structure.R.R02Dto;
import com.sudamericano.bank.domain.ports.inputs.structure.R.R02UseCase;
import com.sudamericano.bank.domain.ports.outputs.structure.R.R02Port;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class R02Service implements R02UseCase {

    private final R02Port port;

    public R02Service(R02Port port) {
        this.port = port;
    }

    public List<R02Dto> findAll() {
        return port.findAll();
    }

    public R02Dto findById(Long id) {
        return port.findById(id);
    }

    public R02Dto create(R02Dto dto) {
        return port.create(dto);
    }

    public R02Dto update(Long id, R02Dto dto) {
        return port.update(id, dto);
    }

    public void delete(Long id) {
        port.delete(id);
    }
}
