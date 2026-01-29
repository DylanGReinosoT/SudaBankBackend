package com.sudamericano.bank.infrastructure.adapter.catalog;

import com.sudamericano.bank.domain.model.catalog.T214Dto;
import com.sudamericano.bank.domain.ports.outputs.catalog.T214Port;
import com.sudamericano.bank.infrastructure.mapper.catalog.T214Mapper;
import com.sudamericano.bank.infrastructure.persistence.jpa.catalog.T214Repository;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class T214RepositoryAdapter implements T214Port {
    private final T214Repository repository;
    private final T214Mapper mapper;

    public T214RepositoryAdapter(T214Repository repository, T214Mapper mapper) {
        this.repository = repository;
        this.mapper = mapper;
    }

    @Override
    public List<T214Dto> findAll() {
        return repository.findAll()
                .stream()
                .map(mapper::toDto)
                .toList();
    }

    @Override
    public T214Dto findById(Integer id) {
        return repository.findById(id)
                .map(mapper::toDto)
                .orElse(null);
    }
}
