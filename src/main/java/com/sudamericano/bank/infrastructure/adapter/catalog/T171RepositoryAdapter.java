package com.sudamericano.bank.infrastructure.adapter.catalog;

import com.sudamericano.bank.domain.model.catalog.T171Dto;
import com.sudamericano.bank.domain.ports.outputs.catalog.T171Port;
import com.sudamericano.bank.infrastructure.mapper.catalog.T171Mapper;
import com.sudamericano.bank.infrastructure.persistence.jpa.catalog.T171Repository;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class T171RepositoryAdapter implements T171Port {
    private final T171Repository repository;
    private final T171Mapper mapper;

    public T171RepositoryAdapter(T171Repository repository, T171Mapper mapper) {
        this.repository = repository;
        this.mapper = mapper;
    }

    @Override
    public List<T171Dto> findAll() {
        return repository.findAll()
                .stream()
                .map(mapper::toDto)
                .toList();
    }

    @Override
    public T171Dto findById(Integer id) {
        return repository.findById(id)
                .map(mapper::toDto)
                .orElse(null);
    }
}
