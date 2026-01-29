package com.sudamericano.bank.infrastructure.adapter.catalog;

import com.sudamericano.bank.domain.model.catalog.T5Dto;
import com.sudamericano.bank.domain.ports.outputs.catalog.T5RepositoryPort;
import com.sudamericano.bank.infrastructure.mapper.catalog.T5Mapper;
import com.sudamericano.bank.infrastructure.persistence.jpa.catalog.T5Repository;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class T5RepositoryAdapter implements T5RepositoryPort {

    private final T5Repository repository;
    private final T5Mapper mapper;

    public T5RepositoryAdapter(T5Repository repository, T5Mapper mapper) {
        this.repository = repository;
        this.mapper = mapper;
    }

    @Override
    public List<T5Dto> findAll() {
        return repository.findAll()
                .stream()
                .map(mapper::toDto)
                .toList();
    }

    @Override
    public T5Dto findById(Integer id) {
        return repository.findById(id)
                .map(mapper::toDto)
                .orElse(null);
    }
}
