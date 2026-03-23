package com.sudamericano.bank.infrastructure.adapter.catalog;

import com.sudamericano.bank.domain.model.catalog.T65Dto;
import com.sudamericano.bank.domain.ports.outputs.catalog.T65RepositoryPort;
import com.sudamericano.bank.infrastructure.mapper.catalog.T65Mapper;
import com.sudamericano.bank.infrastructure.persistence.jpa.catalog.T65Repository;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class T65RepositoryAdapter implements T65RepositoryPort {

    private final T65Repository repository;
    private final T65Mapper mapper;

    public T65RepositoryAdapter(T65Repository repository, T65Mapper mapper) {
        this.repository = repository;
        this.mapper = mapper;
    }

    @Override
    public List<T65Dto> findAll() {
        return repository.findAll()
                .stream()
                .map(mapper::toDto)
                .toList();
    }

    @Override
    public T65Dto findById(Integer id) {
        return repository.findById(id)
                .map(mapper::toDto)
                .orElse(null);
    }
}
