package com.sudamericano.bank.infrastructure.adapter.catalog;

import com.sudamericano.bank.domain.model.catalog.T167Dto;
import com.sudamericano.bank.domain.ports.outputs.catalog.T167Port;
import com.sudamericano.bank.infrastructure.mapper.catalog.T167Mapper;
import com.sudamericano.bank.infrastructure.persistence.entity.catalog.T167Entity;
import com.sudamericano.bank.infrastructure.persistence.jpa.catalog.T167Repository;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class T167RepositoryAdapter implements T167Port {

    private final T167Repository repository;
    private final T167Mapper mapper;

    public T167RepositoryAdapter(T167Repository repository, T167Mapper mapper) {
        this.repository = repository;
        this.mapper = mapper;
    }

    @Override
    public List<T167Dto> findAll() {
        return mapper.toDtoList(repository.findAll());
    }

    @Override
    public T167Dto findById(Integer id) {
        Optional<T167Entity> entity = repository.findById(id);
        return entity.map(mapper::toDto).orElse(null);
    }
}
