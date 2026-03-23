package com.sudamericano.bank.infrastructure.adapter.catalog;

import com.sudamericano.bank.domain.model.catalog.T180Dto;
import com.sudamericano.bank.domain.ports.outputs.catalog.T180Port;
import com.sudamericano.bank.infrastructure.mapper.catalog.T180Mapper;
import com.sudamericano.bank.infrastructure.persistence.jpa.catalog.T180Repository;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
public class T180RepositoryAdapter implements T180Port {

    private final T180Repository repository;
    private final T180Mapper mapper;

    public T180RepositoryAdapter(T180Repository repository, T180Mapper mapper) {
        this.repository = repository;
        this.mapper = mapper;

    }

    @Override
    public List<T180Dto> findAll() {
        return repository.findAll()
                .stream()
                .map(mapper::toDto)
                .toList();
    }

    @Override
    public T180Dto findById(Integer id) {
        return repository.findById(id)
                .map(mapper::toDto)
                .orElse(null);
    }
}
