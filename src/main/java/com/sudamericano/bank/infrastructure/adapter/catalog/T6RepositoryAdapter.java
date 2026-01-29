package com.sudamericano.bank.infrastructure.adapter.catalog;

import com.sudamericano.bank.domain.model.catalog.T6Dto;
import com.sudamericano.bank.domain.ports.outputs.catalog.T6Port;
import com.sudamericano.bank.infrastructure.mapper.catalog.T6Mapper;
import com.sudamericano.bank.infrastructure.persistence.jpa.catalog.T6Repository;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class T6RepositoryAdapter implements T6Port {
    private final T6Repository repository;
    private final T6Mapper mapper;

    public T6RepositoryAdapter(T6Repository repository, T6Mapper mapper) {
        this.repository = repository;
        this.mapper = mapper;
    }

    @Override
    public List<T6Dto> findAll() {
        return repository.findAll()
                .stream()
                .map(mapper::toDto)
                .toList();
    }

    @Override
    public T6Dto findById(Integer id) {
        return repository.findById(id)
                .map(mapper::toDto)
                .orElse(null);
    }
}
