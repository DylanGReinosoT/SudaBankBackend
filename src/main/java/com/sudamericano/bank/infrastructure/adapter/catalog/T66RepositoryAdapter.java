package com.sudamericano.bank.infrastructure.adapter.catalog;

import com.sudamericano.bank.domain.model.catalog.T66Dto;
import com.sudamericano.bank.domain.ports.outputs.catalog.T66RepositoryPort;
import com.sudamericano.bank.infrastructure.mapper.catalog.T66Mapper;
import com.sudamericano.bank.infrastructure.persistence.jpa.catalog.T66Repository;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class T66RepositoryAdapter implements T66RepositoryPort {

    private final T66Repository repository;
    private final T66Mapper mapper;

    public T66RepositoryAdapter(T66Repository repository, T66Mapper mapper) {
        this.repository = repository;
        this.mapper = mapper;
    }

    @Override
    public List<T66Dto> findAll() {
        return repository.findAll()
                .stream()
                .map(mapper::toDto)
                .toList();
    }
}
