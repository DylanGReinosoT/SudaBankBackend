package com.sudamericano.bank.domain.services.structure.L;

import com.sudamericano.bank.domain.model.structure.L.L10Dto;
import com.sudamericano.bank.domain.ports.inputs.structure.L.L10UseCase;
import com.sudamericano.bank.domain.ports.outputs.structure.L.L10Port;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class L10Service implements L10UseCase {

    private final L10Port port;

    public L10Service(L10Port port) {
        this.port = port;
    }

    @Override
    public List<L10Dto> findAll() {
        return port.findAll();
    }

    @Override
    public L10Dto findById(Long id) {
        return port.findById(id);
    }

    @Override
    public L10Dto create(L10Dto dto) {
        return port.create(dto);
    }

    @Override
    public L10Dto update(Long id, L10Dto dto) {
        return port.update(id, dto);
    }

    @Override
    public void delete(Long id) {
        port.delete(id);
    }

}
