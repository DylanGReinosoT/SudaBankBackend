package com.sudamericano.bank.infrastructure.adapter.catalog;

import com.sudamericano.bank.domain.model.catalog.T69Dto;
import com.sudamericano.bank.domain.ports.outputs.catalog.T69Port;
import com.sudamericano.bank.infrastructure.mapper.catalog.T69Mapper;
import com.sudamericano.bank.infrastructure.persistence.entity.catalog.T69Entity;
import com.sudamericano.bank.infrastructure.persistence.jpa.catalog.T69Repository;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class T69RepositoryAdapter implements T69Port {

    private final T69Repository repository;
    private final T69Mapper mapper;

    public T69RepositoryAdapter(T69Repository repository, T69Mapper mapper) {
        this.repository = repository;
        this.mapper = mapper;
    }

    @Override
    public List<T69Dto> findAll() {
        return mapper.toDtoList(repository.findAll());
    }

    @Override
    public T69Dto findById(Integer id) {
        Optional<T69Entity> entity = repository.findById(id);
        return entity.map(mapper::toDto).orElse(null);
    }
}
