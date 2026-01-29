package com.sudamericano.bank.infrastructure.adapter.catalog;

import com.sudamericano.bank.domain.model.catalog.T170Dto;
import com.sudamericano.bank.domain.ports.outputs.catalog.T170Port;
import com.sudamericano.bank.infrastructure.mapper.catalog.T170Mapper;
import com.sudamericano.bank.infrastructure.persistence.entity.catalog.T170Entity;
import com.sudamericano.bank.infrastructure.persistence.jpa.catalog.T170Repository;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class T170RepositoryAdapter implements T170Port {

    private final T170Repository repository;
    private final T170Mapper mapper;

    public T170RepositoryAdapter(T170Repository repository, T170Mapper mapper) {
        this.repository = repository;
        this.mapper = mapper;
    }

    @Override
    public List<T170Dto> findAll() {
        return mapper.toDtoList(repository.findAll());
    }

    @Override
    public T170Dto findById(Integer id) {
        Optional<T170Entity> entity = repository.findById(id);
        return entity.map(mapper::toDto).orElse(null);
    }
}
