package com.sudamericano.bank.infrastructure.adapter.catalog;

import com.sudamericano.bank.domain.model.catalog.T62Dto;
import com.sudamericano.bank.domain.ports.outputs.catalog.T62Port;
import com.sudamericano.bank.infrastructure.mapper.catalog.T62Mapper;
import com.sudamericano.bank.infrastructure.persistence.jpa.catalog.T62Repository;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class T62RepositoryAdapter implements T62Port {
    private final T62Repository repository;
    private final T62Mapper mapper;

    public T62RepositoryAdapter(T62Repository repository, T62Mapper mapper) {
        this.repository = repository;
        this.mapper = mapper;
    }

    @Override
    public List<T62Dto> findAll() {
        return repository.findAll()
                .stream()
                .map(mapper::toDto)
                .toList();
    }

    @Override
    public T62Dto findById(Integer id) {
        return repository.findById(id)
                .map(mapper::toDto)
                .orElse(null);
    }
}
