package com.sudamericano.bank.domain.services.structure.L;

import com.sudamericano.bank.domain.model.structure.L.L05Dto;
import com.sudamericano.bank.domain.ports.inputs.structure.L.L05UseCase;
import com.sudamericano.bank.domain.ports.outputs.structure.L.L05Port;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class L05Service implements L05UseCase {

    private final L05Port port;

    public L05Service(L05Port port) {
        this.port = port;
    }

    public List<L05Dto> findAll() {
        return port.findAll();
    }

    public L05Dto findById(Integer id) {
        return port.findById(id);
    }

    public L05Dto create(L05Dto dto) {
        return port.create(dto);
    }

    public L05Dto update(Integer id, L05Dto dto) {
        return port.update(id, dto);
    }

    public void delete(Integer id) {
        port.delete(id);
    }
}
