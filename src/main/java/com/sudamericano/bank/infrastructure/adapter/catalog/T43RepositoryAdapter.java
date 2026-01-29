package com.sudamericano.bank.infrastructure.adapter.catalog;

import com.sudamericano.bank.domain.model.catalog.T43Dto;
import com.sudamericano.bank.domain.ports.outputs.catalog.T43Port;
import com.sudamericano.bank.infrastructure.mapper.catalog.T43Mapper;
import com.sudamericano.bank.infrastructure.persistence.jpa.catalog.T43Repository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class T43RepositoryAdapter implements T43Port {

    private final T43Repository repository;
    private final T43Mapper mapper;

    public T43RepositoryAdapter(T43Repository repository, T43Mapper mapper) {
        this.repository = repository;
        this.mapper = mapper;
    }

    @Override
    public List<T43Dto> findAll() {
        return repository.findAll()
                .stream()
                .map(mapper::toDomain)
                .toList();
    }

    @Override
    public T43Dto findById(Integer id) {
        return repository.findById(id)
                .map(mapper::toDomain)
                .orElse(null);
    }
}
