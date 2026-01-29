package com.sudamericano.bank.infrastructure.adapter.catalog;

import com.sudamericano.bank.domain.model.catalog.T67Dto;
import com.sudamericano.bank.domain.ports.outputs.catalog.T67Port;
import com.sudamericano.bank.infrastructure.mapper.catalog.T67Mapper;
import com.sudamericano.bank.infrastructure.persistence.entity.catalog.T67Entity;
import com.sudamericano.bank.infrastructure.persistence.jpa.catalog.T67Repository;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class T67RepositoryAdapter implements T67Port {

    private final T67Repository repository;
    private final T67Mapper mapper;

    public T67RepositoryAdapter(T67Repository repository, T67Mapper mapper) {
        this.repository = repository;
        this.mapper = mapper;
    }

    @Override
    public List<T67Dto> findAll() {
        return mapper.toDtoList(repository.findAll());
    }

    @Override
    public T67Dto findById(Integer id) {
        Optional<T67Entity> entity = repository.findById(id);
        return entity.map(mapper::toDto).orElse(null);
    }
}
