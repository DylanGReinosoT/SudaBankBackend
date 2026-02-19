package com.sudamericano.bank.domain.services.structure.L;

import com.sudamericano.bank.domain.model.structure.L.L07Dto;
import com.sudamericano.bank.domain.ports.inputs.structure.L.L07UseCase;
import com.sudamericano.bank.domain.ports.outputs.structure.L.L07Port;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class L07Service implements L07UseCase {

    private final L07Port port;

    public L07Service(L07Port port) {
        this.port = port;
    }

    public List<L07Dto> findAll() {
        return port.findAll();
    }

    public L07Dto findById(Long id) {
        return port.findById(id);
    }

    public L07Dto create(L07Dto dto) {
        return port.create(dto);
    }

    public L07Dto update(Long id, L07Dto dto) {
        return port.update(id, dto);
    }

    public void delete(Long id) {
        port.delete(id);
    }
}

