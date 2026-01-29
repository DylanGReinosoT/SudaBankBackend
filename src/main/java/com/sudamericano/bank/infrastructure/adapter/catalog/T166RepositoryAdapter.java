package com.sudamericano.bank.infrastructure.adapter.catalog;

import com.sudamericano.bank.domain.model.catalog.T166Dto;
import com.sudamericano.bank.domain.ports.outputs.catalog.T166Port;
import com.sudamericano.bank.infrastructure.mapper.catalog.T166Mapper;
import com.sudamericano.bank.infrastructure.persistence.entity.catalog.T166Entity;
import com.sudamericano.bank.infrastructure.persistence.jpa.catalog.T166Repository;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class T166RepositoryAdapter implements T166Port {

    private final T166Repository repository;
    private final T166Mapper mapper;

    public T166RepositoryAdapter(T166Repository repository, T166Mapper mapper) {
        this.repository = repository;
        this.mapper = mapper;
    }

    @Override
    public List<T166Dto> findAll() {
        return mapper.toDtoList(repository.findAll());
    }

    @Override
    public T166Dto findById(Integer id) {
        Optional<T166Entity> entity = repository.findById(id);
        return entity.map(mapper::toDto).orElse(null);
    }
}
