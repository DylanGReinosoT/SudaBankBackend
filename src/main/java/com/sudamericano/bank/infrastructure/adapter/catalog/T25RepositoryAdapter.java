package com.sudamericano.bank.infrastructure.adapter.catalog;

import com.sudamericano.bank.domain.model.catalog.T25Dto;
import com.sudamericano.bank.domain.ports.outputs.catalog.T25Port;
import com.sudamericano.bank.infrastructure.mapper.catalog.T25Mapper;
import com.sudamericano.bank.infrastructure.persistence.jpa.catalog.T25Repository;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class T25RepositoryAdapter implements T25Port {

    private final T25Repository repository;
    private final T25Mapper mapper;

    public T25RepositoryAdapter(T25Repository repository, T25Mapper mapper) {
        this.repository = repository;
        this.mapper = mapper;
    }

    @Override
    public List<T25Dto> findAll() {
        return repository.findAll()
                .stream()
                .map(mapper::toDto)
                .toList();
    }

    @Override
    public T25Dto findById(Integer id) {
        return repository.findById(id)
                .map(mapper::toDto)
                .orElse(null);
    }



}
