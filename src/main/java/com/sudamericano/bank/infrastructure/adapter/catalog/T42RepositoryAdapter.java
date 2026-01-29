package com.sudamericano.bank.infrastructure.adapter.catalog;

import com.sudamericano.bank.domain.model.catalog.T42Dto;
import com.sudamericano.bank.domain.ports.outputs.catalog.T42Port;
import com.sudamericano.bank.infrastructure.persistence.jpa.catalog.SpringDataT42Repository;
import com.sudamericano.bank.infrastructure.mapper.catalog.T42Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class T42RepositoryAdapter implements T42Port {

    private final SpringDataT42Repository repository;
    private final T42Mapper mapper;

    public T42RepositoryAdapter(SpringDataT42Repository repository, T42Mapper mapper) {
        this.repository = repository;
        this.mapper = mapper;
    }

    @Override
    public List<T42Dto> findAll() {
        return repository.findAll()
                .stream()
                .map(mapper::toDomain)
                .toList();
    }

    @Override
    public T42Dto findById(Integer id) {
        return repository.findById(id)
                .map(mapper::toDomain)
                .orElse(null);
    }
}
