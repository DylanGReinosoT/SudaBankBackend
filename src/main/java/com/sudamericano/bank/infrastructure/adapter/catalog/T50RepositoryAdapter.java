package com.sudamericano.bank.infrastructure.adapter.catalog;

import com.sudamericano.bank.domain.model.catalog.T50Dto;
import com.sudamericano.bank.domain.ports.outputs.catalog.T50Port;
import com.sudamericano.bank.infrastructure.mapper.catalog.T50Mapper;
import com.sudamericano.bank.infrastructure.persistence.jpa.catalog.T50Repository;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class T50RepositoryAdapter implements T50Port {
    private final T50Repository repository;
    private final T50Mapper mapper;

    public T50RepositoryAdapter(T50Repository repository, T50Mapper mapper) {
        this.repository = repository;
        this.mapper = mapper;
    }

    @Override
    public List<T50Dto> findAll() {
        return repository.findAll()
                .stream()
                .map(mapper::toDto)
                .toList();
    }

    @Override
    public T50Dto findById(Integer id) {
        return repository.findById(id)
                .map(mapper::toDto)
                .orElse(null);
    }
}
