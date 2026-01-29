package com.sudamericano.bank.infrastructure.adapter.catalog;

import com.sudamericano.bank.domain.model.catalog.T44Dto;
import com.sudamericano.bank.domain.ports.outputs.catalog.T44Port;
import com.sudamericano.bank.infrastructure.mapper.catalog.T44Mapper;
import com.sudamericano.bank.infrastructure.persistence.jpa.catalog.T44Repository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class T44RepositoryAdapter implements T44Port {

    private final T44Repository repository;
    private final T44Mapper mapper;

    public T44RepositoryAdapter(T44Repository repository, T44Mapper mapper) {
        this.repository = repository;
        this.mapper = mapper;
    }

    @Override
    public List<T44Dto> findAll() {
        return repository.findAll()
                .stream()
                .map(mapper::toDomain)
                .toList();
    }

    @Override
    public T44Dto findById(Integer id) {
        return repository.findById(id)
                .map(mapper::toDomain)
                .orElse(null);
    }
}
