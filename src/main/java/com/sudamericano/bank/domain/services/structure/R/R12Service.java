package com.sudamericano.bank.domain.services.structure.R;

import com.sudamericano.bank.domain.model.structure.R.R12Dto;
import com.sudamericano.bank.domain.ports.inputs.structure.R.R12UseCase;
import com.sudamericano.bank.domain.ports.outputs.structure.R.R12Port;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class R12Service implements R12UseCase {
    private final R12Port port;

    public R12Service(R12Port port){
        this.port = port;
    }

    public List<R12Dto> findAll(){
        return port.findAll();
    }

    public R12Dto findById(Long id) {
        return port.findById(id);
    }

    public R12Dto create(R12Dto dto) {
        return port.create(dto);
    }

    public R12Dto update(Long id, R12Dto dto) {
        return port.update(id, dto);
    }

    public void delete(Long id) {
        port.delete(id);
    }

}

