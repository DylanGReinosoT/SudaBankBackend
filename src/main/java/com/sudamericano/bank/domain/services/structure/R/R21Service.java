package com.sudamericano.bank.domain.services.structure.R;

import com.sudamericano.bank.domain.model.structure.R.R21Dto;
import com.sudamericano.bank.domain.ports.inputs.structure.R.R21UseCase;
import com.sudamericano.bank.domain.ports.outputs.structure.R.R21Port;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class R21Service implements R21UseCase {

    private final R21Port port;

    public R21Service(R21Port port) {
        this.port = port;
    }

    public List<R21Dto> findAll() {
        return port.findAll();
    }

    public R21Dto findById(Long id) {
        return port.findById(id);
    }

    public R21Dto create(R21Dto dto) {
        return port.create(dto);
    }

    public R21Dto update(Long id, R21Dto dto) {
        return port.update(id, dto);
    }

    public void delete(Long id) {
        port.delete(id);
    }

}
