package com.sudamericano.bank.infrastructure.adapter.catalog;

import com.sudamericano.bank.domain.model.catalog.T212Dto;
import com.sudamericano.bank.domain.ports.outputs.catalog.T212Port;
import com.sudamericano.bank.infrastructure.mapper.catalog.T212Mapper;
import com.sudamericano.bank.infrastructure.persistence.jpa.catalog.T212Repository;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class T212RepositoryAdapter implements T212Port {
    private final T212Repository repository;
    private final T212Mapper mapper;

    public T212RepositoryAdapter(T212Repository repository, T212Mapper mapper) {
        this.repository = repository;
        this.mapper = mapper;
    }

    @Override
    public List<T212Dto> findAll() {
        return repository.findAll()
                .stream()
                .map(mapper::toDto)
                .toList();
    }

    @Override
    public T212Dto findById(Integer id) {
        return repository.findById(id)
                .map(mapper::toDto)
                .orElse(null);
    }
}
