package com.sudamericano.bank.infrastructure.adapter.catalog;

import com.sudamericano.bank.domain.model.catalog.T169Dto;
import com.sudamericano.bank.domain.ports.outputs.catalog.T169Port;
import com.sudamericano.bank.infrastructure.mapper.catalog.T169Mapper;
import com.sudamericano.bank.infrastructure.persistence.entity.catalog.T169Entity;
import com.sudamericano.bank.infrastructure.persistence.jpa.catalog.T169Repository;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class T169RepositoryAdapter implements T169Port {

    private final T169Repository repository;
    private final T169Mapper mapper;

    public T169RepositoryAdapter(T169Repository repository, T169Mapper mapper) {
        this.repository = repository;
        this.mapper = mapper;
    }

    @Override
    public List<T169Dto> findAll() {
        return mapper.toDtoList(repository.findAll());
    }

    @Override
    public T169Dto findById(Integer id) {
        Optional<T169Entity> entity = repository.findById(id);
        return entity.map(mapper::toDto).orElse(null);
    }
}
