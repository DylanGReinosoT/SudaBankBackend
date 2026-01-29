package com.sudamericano.bank.infrastructure.adapter.catalog;

import com.sudamericano.bank.domain.model.catalog.T36_6Dto;
import com.sudamericano.bank.domain.ports.outputs.catalog.T36_6Port;
import com.sudamericano.bank.infrastructure.mapper.catalog.T36_6Mapper;
import com.sudamericano.bank.infrastructure.persistence.jpa.catalog.T36_6Repository;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class T36_6ResponseAdapter implements T36_6Port {

    private T36_6Repository repository;
    private T36_6Mapper mapper;

    public T36_6ResponseAdapter(T36_6Repository repository, T36_6Mapper mapper) {
        this.repository = repository;
        this.mapper = mapper;
    }

    @Override
    public List<T36_6Dto> findAll() {
        return repository.findAll()
                .stream()
                .map(mapper::toDto)
                .toList();
    }

    @Override
    public T36_6Dto findById(Integer id) {
        return repository.findById(id)
                .map(mapper::toDto)
                .orElse(null);
    }
}
