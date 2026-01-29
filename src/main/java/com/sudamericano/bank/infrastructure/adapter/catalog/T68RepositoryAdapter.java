package com.sudamericano.bank.infrastructure.adapter.catalog;

import com.sudamericano.bank.domain.model.catalog.T68Dto;
import com.sudamericano.bank.domain.ports.outputs.catalog.T68Port;
import com.sudamericano.bank.infrastructure.mapper.catalog.T68Mapper;
import com.sudamericano.bank.infrastructure.persistence.entity.catalog.T68Entity;
import com.sudamericano.bank.infrastructure.persistence.jpa.catalog.T68Repository;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class T68RepositoryAdapter implements T68Port {

    private final T68Repository repository;
    private final T68Mapper mapper;

    public T68RepositoryAdapter(T68Repository repository, T68Mapper mapper) {
        this.repository = repository;
        this.mapper = mapper;
    }

    @Override
    public List<T68Dto> findAll() {
        return mapper.toDtoList(repository.findAll());
    }

    @Override
    public T68Dto findById(Integer id) {
        Optional<T68Entity> entity = repository.findById(id);
        return entity.map(mapper::toDto).orElse(null);
    }
}
