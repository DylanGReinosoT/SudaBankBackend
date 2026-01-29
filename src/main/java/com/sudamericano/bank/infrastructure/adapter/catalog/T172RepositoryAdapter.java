package com.sudamericano.bank.infrastructure.adapter.catalog;

import com.sudamericano.bank.domain.model.catalog.T172Dto;
import com.sudamericano.bank.domain.ports.outputs.catalog.T172RepositoryPort;
import com.sudamericano.bank.infrastructure.mapper.catalog.T172Mapper;
import com.sudamericano.bank.infrastructure.persistence.jpa.catalog.T172Repository;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class T172RepositoryAdapter implements T172RepositoryPort {

    private final T172Repository repository;
    private final T172Mapper mapper;

    public T172RepositoryAdapter(T172Repository repository, T172Mapper mapper) {
        this.repository = repository;
        this.mapper = mapper;
    }

    @Override
    public List<T172Dto> findAll() {
        return repository.findAll()
                .stream()
                .map(mapper::toDto)
                .toList();
    }

    @Override
    public T172Dto findById(Integer id) {
        return repository.findById(id)
                .map(mapper::toDto)
                .orElse(null);
    }
}
