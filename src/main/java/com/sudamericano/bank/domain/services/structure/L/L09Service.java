package com.sudamericano.bank.domain.services.structure.L;


import com.sudamericano.bank.domain.model.structure.L.L09Dto;
import com.sudamericano.bank.domain.ports.inputs.structure.L.L09UseCase;
import com.sudamericano.bank.domain.ports.outputs.structure.L.L09Port;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class L09Service implements L09UseCase {
    private final L09Port port;

    public L09Service(L09Port port) {
        this.port = port;
    }

    @Override
    public List<L09Dto> findAll() {
        return port.findAll();
    }

    @Override
    public L09Dto findById(Long id) {
        return port.findById(id);
    }

    @Override
    public L09Dto create(L09Dto dto) {
        return port.create(dto);
    }

    @Override
    public L09Dto update(Long id, L09Dto dto) {
        return port.update(id, dto);
    }

    @Override
    public void delete(Long id) {
        port.delete(id);
    }
}
