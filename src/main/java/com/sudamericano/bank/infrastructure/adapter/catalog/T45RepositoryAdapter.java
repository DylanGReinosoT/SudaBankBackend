package com.sudamericano.bank.infrastructure.adapter.catalog;

import com.sudamericano.bank.domain.model.catalog.T45Dto;
import com.sudamericano.bank.domain.ports.outputs.catalog.T45Port;
import com.sudamericano.bank.infrastructure.mapper.catalog.T45Mapper;
import com.sudamericano.bank.infrastructure.persistence.jpa.catalog.T45Repository;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
public class T45RepositoryAdapter implements T45Port {
    private final T45Repository repository;
    private final T45Mapper mapper;

    public T45RepositoryAdapter(T45Repository repository, T45Mapper mapper) {
        this.repository = repository;
        this.mapper = mapper;
    }

    @Override
    public List<T45Dto> findAll() {
        return repository.findAll()
                .stream()
                .map(mapper::toDto)
                .toList();
    }

    @Override
    public T45Dto findById(Integer id) {
        return repository.findById(id)
                .map(mapper::toDto)
                .orElse(null);
    }
}
