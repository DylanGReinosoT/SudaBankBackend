package com.sudamericano.bank.infrastructure.adapter.catalog;

import com.sudamericano.bank.domain.model.catalog.T75Dto;
import com.sudamericano.bank.domain.ports.outputs.catalog.T75Port;
import com.sudamericano.bank.infrastructure.mapper.catalog.T75Mapper;
import com.sudamericano.bank.infrastructure.persistence.jpa.catalog.T75Repository;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class T75RepositoryAdapter implements T75Port {

    private final T75Repository repository;
    private final T75Mapper mapper;

    public T75RepositoryAdapter(T75Repository repository, T75Mapper mapper) {
        this.repository = repository;
        this.mapper = mapper;
    }

    @Override
    public List<T75Dto> findAll() {
        return repository.findAll()
                .stream()
                .map(mapper::toDto)
                .toList();
    }

    @Override
    public T75Dto findById(Integer id) {
        return repository.findById(id)
                .map(mapper::toDto)
                .orElse(null);
    }

}
