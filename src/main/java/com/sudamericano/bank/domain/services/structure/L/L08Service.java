package com.sudamericano.bank.domain.services.structure.L;

import com.sudamericano.bank.domain.model.structure.L.L08Dto;
import com.sudamericano.bank.domain.ports.inputs.structure.L.L08UseCase;
import com.sudamericano.bank.domain.ports.outputs.structure.L.L08Port;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class L08Service implements L08UseCase {

    private final L08Port port;

    public L08Service(L08Port port) {
        this.port = port;
    }

    public List<L08Dto> findAll() {
        return port.findAll();
    }

    public L08Dto findById(Long id) {
        return port.findById(id);
    }

    public L08Dto create(L08Dto dto) {
        return port.create(dto);
    }

    public L08Dto update(Long id, L08Dto dto) {
        return port.update(id, dto);
    }

    public void delete(Long id) {
        port.delete(id);
    }
}
