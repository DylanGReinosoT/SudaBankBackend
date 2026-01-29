package com.sudamericano.bank.infrastructure.adapter.catalog;

import com.sudamericano.bank.domain.model.catalog.T235Dto;
import com.sudamericano.bank.domain.ports.outputs.catalog.T235Port;
import com.sudamericano.bank.infrastructure.mapper.catalog.T235Mapper;
import com.sudamericano.bank.infrastructure.persistence.jpa.catalog.T235Repository;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class T235ResponseAdapter implements T235Port {

    private final T235Repository repository;
    private final T235Mapper mapper;

    public T235ResponseAdapter(T235Repository repository, T235Mapper mapper) {
        this.repository = repository;
        this.mapper = mapper;
    }

    @Override
    public List<T235Dto> findAll() {
        return repository.findAll()
                .stream()
                .map(mapper::toDto)
                .toList();
    }

    @Override
    public T235Dto findById(Integer id) {
        return repository.findById(id)
                .map(mapper::toDto)
                .orElse(null);
    }
}
