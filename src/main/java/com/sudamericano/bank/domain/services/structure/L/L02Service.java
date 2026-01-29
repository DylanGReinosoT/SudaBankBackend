package com.sudamericano.bank.domain.services.structure.L;

import com.sudamericano.bank.domain.model.structure.L.L02Dto;
import com.sudamericano.bank.domain.ports.inputs.structure.L.L02UseCase;
import com.sudamericano.bank.domain.ports.outputs.structure.L.L02Port;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class L02Service implements L02UseCase {

    private final L02Port port;

    public L02Service(L02Port port) {
        this.port = port;
    }

    public List<L02Dto> findAll() {
        return port.findAll();
    }

    public L02Dto findById(Long id) {
        return port.findById(id);
    }

    public L02Dto create(L02Dto dto) {
        return port.create(dto);
    }

    public L02Dto update(Long id, L02Dto dto) {
        return port.update(id, dto);
    }

    public void delete(Long id) {
        port.delete(id);
    }

}
