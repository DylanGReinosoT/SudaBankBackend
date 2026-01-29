package com.sudamericano.bank.infrastructure.adapter.catalog;

import com.sudamericano.bank.domain.model.catalog.T32Dto;
import com.sudamericano.bank.domain.ports.outputs.catalog.T32Port;
import com.sudamericano.bank.infrastructure.mapper.catalog.T32Mapper;
import com.sudamericano.bank.infrastructure.persistence.jpa.catalog.T32Repository;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class T32RepositoryAdapter implements T32Port {

    private final T32Repository repository;
    private final T32Mapper mapper;

    public T32RepositoryAdapter(T32Repository repository, T32Mapper mapper) {
        this.repository = repository;
        this.mapper = mapper;
    }

    @Override
    public List<T32Dto> findAll() {
        return repository.findAll()
                .stream()
                .map(mapper::toDto)
                .toList();
    }

    @Override
    public T32Dto findById(Integer id) {
        return repository.findById(id)
                .map(mapper::toDto)
                .orElse(null);
    }
}
