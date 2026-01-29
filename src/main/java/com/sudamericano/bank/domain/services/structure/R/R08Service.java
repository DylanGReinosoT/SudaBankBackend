package com.sudamericano.bank.domain.services.structure.R;

import com.sudamericano.bank.domain.model.structure.R.R08Dto;
import com.sudamericano.bank.domain.ports.inputs.structure.R.R08UseCase;
import com.sudamericano.bank.domain.ports.outputs.structure.R.R08Port;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class R08Service implements R08UseCase {

    private final R08Port port;

    public R08Service(R08Port port) {
        this.port = port;
    }

    public List<R08Dto> findAll() {
        return port.findAll();
    }

    public R08Dto findById(Long id) {
        return port.findById(id);
    }

    public R08Dto create(R08Dto dto) {
        return port.create(dto);
    }

    public R08Dto update(Long id, R08Dto dto) {
        return port.update(id, dto);
    }

    public void delete(Long id) {
        port.delete(id);
    }
}
