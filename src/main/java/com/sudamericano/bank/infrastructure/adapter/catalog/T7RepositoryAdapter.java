package com.sudamericano.bank.infrastructure.adapter.catalog;

import com.sudamericano.bank.domain.model.catalog.T7Dto;
import com.sudamericano.bank.domain.ports.outputs.catalog.T7Port;
import com.sudamericano.bank.infrastructure.mapper.catalog.T7Mapper;
import com.sudamericano.bank.infrastructure.persistence.jpa.catalog.T7Repository;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class T7RepositoryAdapter implements T7Port {
    private final T7Repository repository;
    private final T7Mapper mapper;

    public T7RepositoryAdapter(T7Repository repository, T7Mapper mapper) {
        this.repository = repository;
        this.mapper = mapper;
    }

    @Override
    public List<T7Dto> findAll() {
        return repository.findAll()
                .stream()
                .map(mapper::toDto)
                .toList();
    }

    @Override
    public T7Dto findById(Integer id) {
        return repository.findById(id)
                .map(mapper::toDto)
                .orElse(null);
    }
}
