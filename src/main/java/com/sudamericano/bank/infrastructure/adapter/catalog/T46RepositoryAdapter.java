package com.sudamericano.bank.infrastructure.adapter.catalog;

import com.sudamericano.bank.domain.model.catalog.T46Dto;
import com.sudamericano.bank.domain.ports.outputs.catalog.T46Port;
import com.sudamericano.bank.infrastructure.mapper.catalog.T46Mapper;
import com.sudamericano.bank.infrastructure.persistence.jpa.catalog.T46Repository;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
public class T46RepositoryAdapter implements T46Port {
    private final T46Repository repository;
    private final T46Mapper mapper;

    public T46RepositoryAdapter(T46Repository repository, T46Mapper mapper) {
        this.repository = repository;
        this.mapper = mapper;
    }

    @Override
    public List<T46Dto> findAll() {
        return repository.findAll()
                .stream()
                .map(mapper::toDto)
                .toList();
    }

    @Override
    public T46Dto findById(Integer id) {
        return repository.findById(id)
                .map(mapper::toDto)
                .orElse(null);
    }
}
