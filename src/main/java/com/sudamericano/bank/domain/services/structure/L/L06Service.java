package com.sudamericano.bank.domain.services.structure.L;

import com.sudamericano.bank.domain.model.structure.L.L06Dto;
import com.sudamericano.bank.domain.ports.inputs.structure.L.L06UseCase;
import com.sudamericano.bank.domain.ports.outputs.structure.L.L06Port;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class L06Service  implements L06UseCase {

    private final L06Port port;

    public L06Service(L06Port port) {
        this.port = port;
    }
    public List<L06Dto> findAll() {
        return port.findAll();
    }
    public L06Dto findById(Integer id) {
        return port.findById(id);
    }
    public L06Dto create(L06Dto dto) {
        return port.create(dto);
    }
    public L06Dto update(Integer id, L06Dto dto) {
        return port.update(id, dto);
    }
    public void delete(Integer id) {
        port.delete(id);
    }
}
