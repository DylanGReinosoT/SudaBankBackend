package com.sudamericano.bank.infrastructure.adapter.catalog;

import com.sudamericano.bank.domain.model.catalog.T28Dto;
import com.sudamericano.bank.domain.ports.outputs.catalog.T28Port;
import com.sudamericano.bank.infrastructure.mapper.catalog.T28Mapper;
import com.sudamericano.bank.infrastructure.persistence.jpa.catalog.T28Repository;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class T28RepositoryAdapter implements T28Port {

    private final T28Repository repository;
    private final T28Mapper mapper;

    public T28RepositoryAdapter(T28Repository repository, T28Mapper mapper) {
        this.repository = repository;
        this.mapper = mapper;
    }

    @Override
    public List<T28Dto> findAll() {
        return repository.findAll()
                .stream()
                .map(mapper::toDto)
                .toList();
    }

    @Override
    public T28Dto findById(Integer id) {
        return repository.findById(id)
                .map(mapper::toDto)
                .orElse(null);
    }
}
