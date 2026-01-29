package com.sudamericano.bank.infrastructure.adapter.catalog;

import com.sudamericano.bank.domain.model.catalog.T209Dto;
import com.sudamericano.bank.domain.ports.outputs.catalog.T209Port;
import com.sudamericano.bank.infrastructure.mapper.catalog.T209Mapper;
import com.sudamericano.bank.infrastructure.persistence.jpa.catalog.T209Repository;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class T209RepositoryAdapter implements T209Port {

    private final T209Repository repository;
    private final T209Mapper mapper;

    public T209RepositoryAdapter(T209Repository repository, T209Mapper mapper) {
        this.repository = repository;
        this.mapper = mapper;
    }

    @Override
    public List<T209Dto> findAll() {
        return repository.findAll()
                .stream()
                .map(mapper::toDto)
                .toList();
    }

    @Override
    public T209Dto findById(Integer id) {
        return repository.findById(id)
                .map(mapper::toDto)
                .orElse(null);
    }

}
