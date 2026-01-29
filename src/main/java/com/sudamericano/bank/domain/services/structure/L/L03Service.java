package com.sudamericano.bank.domain.services.structure.L;

import com.sudamericano.bank.domain.model.structure.L.L03Dto;
import com.sudamericano.bank.domain.model.structure.L.L03ViewDto;
import com.sudamericano.bank.domain.ports.inputs.structure.L.L03UseCase;
import com.sudamericano.bank.domain.ports.outputs.structure.L.L03Port;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class L03Service implements L03UseCase {

    private final L03Port port;

    public L03Service(L03Port port) {
        this.port = port;
    }

    public List<L03Dto> findAll() {
        return port.findAll();
    }

    public L03Dto findById(Long id) {
        return port.findById(id);
    }

    public L03Dto create(L03Dto dto) {
        return port.create(dto);
    }

    public L03Dto update(Long id, L03Dto dto) {
        return port.update(id, dto);
    }

    public void delete(Long id) {
        port.delete(id);
    }

    public List<L03ViewDto> findAllResumenDatosL03() {
        return port.findAllResumenDatosL03();
    }
}
