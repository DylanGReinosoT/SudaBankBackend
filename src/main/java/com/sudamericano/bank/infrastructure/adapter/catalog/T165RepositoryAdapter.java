package com.sudamericano.bank.infrastructure.adapter.catalog;

import com.sudamericano.bank.domain.model.catalog.T165Dto;
import com.sudamericano.bank.domain.ports.outputs.catalog.T165Port;
import com.sudamericano.bank.infrastructure.mapper.catalog.T165Mapper;
import com.sudamericano.bank.infrastructure.persistence.entity.catalog.T165Entity;
import com.sudamericano.bank.infrastructure.persistence.jpa.catalog.T165Repository;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class T165RepositoryAdapter implements T165Port {

    private final T165Repository repository;
    private final T165Mapper mapper;

    public T165RepositoryAdapter(T165Repository repository, T165Mapper mapper) {
        this.repository = repository;
        this.mapper = mapper;
    }

    @Override
    public List<T165Dto> findAll() {
        return mapper.toDtoList(repository.findAll());
    }

    @Override
    public T165Dto findById(Integer id) {
        Optional<T165Entity> entity = repository.findById(id);
        return entity.map(mapper::toDto).orElse(null);
    }
}
