package com.sudamericano.bank.infrastructure.adapter.catalog;

import com.sudamericano.bank.domain.model.catalog.T168Dto;
import com.sudamericano.bank.domain.ports.outputs.catalog.T168Port;
import com.sudamericano.bank.infrastructure.mapper.catalog.T168Mapper;
import com.sudamericano.bank.infrastructure.persistence.entity.catalog.T168Entity;
import com.sudamericano.bank.infrastructure.persistence.jpa.catalog.T168Repository;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class T168RepositoryAdapter implements T168Port {

    private final T168Repository repository;
    private final T168Mapper mapper;

    public T168RepositoryAdapter(T168Repository repository, T168Mapper mapper) {
        this.repository = repository;
        this.mapper = mapper;
    }

    @Override
    public List<T168Dto> findAll() {
        return mapper.toDtoList(repository.findAll());
    }

    @Override
    public T168Dto findById(Integer id) {
        Optional<T168Entity> entity = repository.findById(id);
        return entity.map(mapper::toDto).orElse(null);
    }
}
