package com.sudamericano.bank.infrastructure.adapter.catalog;

import com.sudamericano.bank.domain.model.catalog.T33Dto;
import com.sudamericano.bank.domain.ports.outputs.catalog.T33RepositoryPort;
import com.sudamericano.bank.infrastructure.mapper.catalog.T33Mapper;
import com.sudamericano.bank.infrastructure.persistence.jpa.catalog.T33Repository;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class T33RepositoryAdapter implements T33RepositoryPort {

    private final T33Repository repository;
    private final T33Mapper mapper;

    public T33RepositoryAdapter(T33Repository repository, T33Mapper mapper) {
        this.repository = repository;
        this.mapper = mapper;
    }

    @Override
    public List<T33Dto> findAll() {
        return repository.findAll()
                .stream()
                .map(mapper::toDto)
                .toList();
    }

    @Override
    public T33Dto findById(Integer id) {
        return repository.findById(id)
                .map(mapper::toDto)
                .orElse(null);
    }
}
