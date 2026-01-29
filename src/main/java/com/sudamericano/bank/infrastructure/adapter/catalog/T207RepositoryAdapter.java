package com.sudamericano.bank.infrastructure.adapter.catalog;

import com.sudamericano.bank.domain.model.catalog.T207Dto;
import com.sudamericano.bank.domain.ports.outputs.catalog.T207Port;
import com.sudamericano.bank.infrastructure.mapper.catalog.T207Mapper;
import com.sudamericano.bank.infrastructure.persistence.jpa.catalog.T207Repository;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
public class T207RepositoryAdapter implements T207Port {

    private final T207Repository repository;
    private final T207Mapper mapper;

    public T207RepositoryAdapter(T207Repository repository, T207Mapper mapper) {
        this.repository = repository;
        this.mapper = mapper;
    }

    @Override
    public List<T207Dto> findAll() {
        return repository.findAll()
                .stream()
                .map(mapper::toDto)
                .toList();
    }

    @Override
    public T207Dto findById(Integer id) {
        return repository.findById(id)
                .map(mapper::toDto)
                .orElse(null);
    }
}
