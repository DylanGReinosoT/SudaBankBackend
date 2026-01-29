package com.sudamericano.bank.infrastructure.adapter.catalog;

import com.sudamericano.bank.domain.model.catalog.T79Dto;
import com.sudamericano.bank.domain.ports.outputs.catalog.T79Port;
import com.sudamericano.bank.infrastructure.mapper.catalog.T79Mapper;
import com.sudamericano.bank.infrastructure.persistence.entity.catalog.T79Entity;
import com.sudamericano.bank.infrastructure.persistence.jpa.catalog.T79Repository;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class T79RepositoryAdapter implements T79Port {

    private final T79Repository repository;
    private final T79Mapper mapper;

    public T79RepositoryAdapter(T79Repository repository, T79Mapper mapper) {
        this.repository = repository;
        this.mapper = mapper;
    }

    @Override
    public List<T79Dto> findAll() {
        return mapper.toDtoList(repository.findAll());
    }

    @Override
    public T79Dto findById(Integer id) {
        Optional<T79Entity> entity = repository.findById(id);
        return entity.map(mapper::toDto).orElse(null);
    }
}
