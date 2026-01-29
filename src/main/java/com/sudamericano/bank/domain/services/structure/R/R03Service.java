package com.sudamericano.bank.domain.services.structure.R;

import com.sudamericano.bank.domain.model.structure.R.R03Dto;
import com.sudamericano.bank.domain.ports.inputs.structure.R.R03UsesCase;
import com.sudamericano.bank.domain.ports.outputs.structure.R.R03Port;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class R03Service implements R03UsesCase
{
    private final R03Port port;

    public R03Service(R03Port port) {
        this.port = port;
    }

    public List<R03Dto> findAll() {
        return port.findAll();
    }

    public R03Dto findById(Long id) {
        return port.findById(id);
    }

    public R03Dto create(R03Dto dto) {
        return port.create(dto);
    }

    public R03Dto update(Long id, R03Dto dto) {
        return port.update(id, dto);
    }

    public void delete(Long id) {
        port.delete(id);
    }

}
