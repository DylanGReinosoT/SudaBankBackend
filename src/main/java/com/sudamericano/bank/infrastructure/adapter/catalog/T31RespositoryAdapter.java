package com.sudamericano.bank.infrastructure.adapter.catalog;

import com.sudamericano.bank.domain.model.catalog.T31Dto;
import com.sudamericano.bank.domain.ports.outputs.catalog.T31Port;
import com.sudamericano.bank.infrastructure.mapper.catalog.T31Mapper;
import com.sudamericano.bank.infrastructure.persistence.jpa.catalog.T31Repository;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class T31RespositoryAdapter implements T31Port {

    private final T31Repository t31Repository;
    private final T31Mapper t31Mapper;

    public T31RespositoryAdapter(T31Repository t31Repository, T31Mapper t31Mapper) {
        this.t31Repository = t31Repository;
        this.t31Mapper = t31Mapper;
    }

    @Override
    public List<T31Dto> findAll() {
        return t31Repository.findAll()
                .stream()
                .map(t31Mapper::toDto)
                .toList();
    }

    @Override
    public T31Dto findById(Integer id) {
        return t31Repository.findById(id)
                .map(t31Mapper::toDto)
                .orElse(null);
    }

}
