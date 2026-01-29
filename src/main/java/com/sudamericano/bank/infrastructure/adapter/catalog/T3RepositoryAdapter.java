package com.sudamericano.bank.infrastructure.adapter.catalog;


import com.sudamericano.bank.domain.model.catalog.T3Dto;
import com.sudamericano.bank.domain.ports.outputs.catalog.T3Port;
import com.sudamericano.bank.infrastructure.mapper.catalog.T3Mapper;
import com.sudamericano.bank.infrastructure.persistence.jpa.catalog.T3Repository;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class T3RepositoryAdapter implements T3Port {
    private final T3Repository repository;
    private final T3Mapper mapper;

    public T3RepositoryAdapter(T3Repository repository, T3Mapper mapper) {
        this.repository = repository;
        this.mapper = mapper;
    }

    @Override
    public List<T3Dto> findAll() {
        return repository.findAll()
                .stream()
                .map(mapper::toDto)
                .toList();
    }

    @Override
    public T3Dto findById(Integer id) {
        return repository.findById(id)
                .map(mapper::toDto)
                .orElse(null);
    }

}
