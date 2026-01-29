package com.sudamericano.bank.domain.services.structure.L;

import com.sudamericano.bank.domain.model.structure.L.L04Dto;
import com.sudamericano.bank.domain.ports.inputs.structure.L.L04UseCase;
import com.sudamericano.bank.domain.ports.outputs.structure.L.L04Port;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class L04Service implements L04UseCase {

    private final L04Port port;

    public L04Service(L04Port port) {
        this.port = port;
    }

    public List<L04Dto> findAll() {
        return port.findAll();
    }

    public L04Dto findById(Long id) {
        return port.findById(id);
    }

    public L04Dto create(L04Dto dto) {
        return port.create(dto);
    }

    public L04Dto update(Long id, L04Dto dto) {
        return port.update(id, dto);
    }

    public void delete(Long id) {
        port.delete(id);
    }

}
