package com.sudamericano.bank.domain.services.structure.L;

import com.sudamericano.bank.domain.model.structure.L.StructureL01Dto;
import com.sudamericano.bank.domain.ports.inputs.structure.L.L01UseCase;
import com.sudamericano.bank.domain.ports.outputs.structure.L.L01Port;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class L01Service implements L01UseCase {

    private final L01Port port;

    public L01Service(L01Port port) {
        this.port = port;
    }

    public List<StructureL01Dto> findAll() {
        return port.findAll();
    }

    public List<StructureL01Dto> findByFilter(StructureL01Dto dto) {
        return port.findByFilter(dto);
    }

    public StructureL01Dto findById(Integer id) {
        return port.findById(id);
    }

    public StructureL01Dto create(StructureL01Dto dto) {
        return port.create(dto);
    }

    public StructureL01Dto update(Integer id, StructureL01Dto dto) {
        return port.update(id, dto);
    }

    public void delete(Integer id) {
        port.delete(id);
    }
}
