package com.sudamericano.bank.domain.services.structure.R;

import com.sudamericano.bank.domain.model.structure.R.R04Dto;
import com.sudamericano.bank.domain.ports.inputs.structure.R.R04UseCase;
import com.sudamericano.bank.domain.ports.outputs.structure.R.R04Port;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class R04Service implements R04UseCase {
   
    private final R04Port port;

    public R04Service(R04Port port) {
        this.port = port;
    }

    public List<R04Dto> findAll() {
        return port.findAll();
    }

    public R04Dto findById(Long id) {
        return port.findById(id);
    }

    public R04Dto create(R04Dto dto) {
        return port.create(dto);
    }

    public R04Dto update(Long id, R04Dto dto) {
        return port.update(id, dto);
    }

    public void delete(Long id) {
        port.delete(id);
    }
}
