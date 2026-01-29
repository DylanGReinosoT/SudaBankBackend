package com.sudamericano.bank.infrastructure.adapter.catalog;

import com.sudamericano.bank.domain.model.catalog.T70Dto;
import com.sudamericano.bank.domain.ports.outputs.catalog.T70Port;
import com.sudamericano.bank.infrastructure.mapper.catalog.T70Mapper;
import com.sudamericano.bank.infrastructure.persistence.entity.catalog.T70Entity;
import com.sudamericano.bank.infrastructure.persistence.jpa.catalog.T70Repository;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class T70RepositoryAdapter implements T70Port {

    private final T70Repository repository;
    private final T70Mapper mapper;

    public T70RepositoryAdapter(T70Repository repository, T70Mapper mapper) {
        this.repository = repository;
        this.mapper = mapper;
    }

    @Override
    public List<T70Dto> findAll() {
        return mapper.toDtoList(repository.findAll());
    }

    @Override
    public T70Dto findById(Integer id) {
        Optional<T70Entity> entity = repository.findById(id);
        return entity.map(mapper::toDto).orElse(null);
    }
}
