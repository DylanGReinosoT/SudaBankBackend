package com.sudamericano.bank.infrastructure.adapter.catalog;

import com.sudamericano.bank.domain.model.catalog.T38Dto;
import com.sudamericano.bank.domain.ports.outputs.catalog.T38Port;
import com.sudamericano.bank.infrastructure.mapper.catalog.T38Mapper;
import com.sudamericano.bank.infrastructure.persistence.jpa.catalog.T38Repository;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class T38RepositoryAdapter implements T38Port {
    private final T38Repository repository;
    private final T38Mapper mapper;

    public T38RepositoryAdapter(T38Repository repository, T38Mapper mapper) {
        this.repository = repository;
        this.mapper = mapper;
    }

    @Override
    public List<T38Dto> findAll() {
        return repository.findAll()
                .stream()
                .map(mapper::toDto)
                .toList();
    }

    @Override
    public T38Dto findById(Integer id) {
        return repository.findById(id)
                .map(mapper::toDto)
                .orElse(null);
    }

}
