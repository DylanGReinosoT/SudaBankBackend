package com.sudamericano.bank.infrastructure.adapter.catalog;

import com.sudamericano.bank.domain.model.catalog.T37Dto;
import com.sudamericano.bank.domain.ports.outputs.catalog.T37Port;
import com.sudamericano.bank.infrastructure.mapper.catalog.T37Mapper;
import com.sudamericano.bank.infrastructure.persistence.jpa.catalog.T37Repository;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class T37RepositoryAdapter implements T37Port {

    private final T37Repository t37Repository;
    private final T37Mapper t37Mapper;

    public T37RepositoryAdapter(T37Repository t37Repository, T37Mapper t37Mapper) {
        this.t37Repository = t37Repository;
        this.t37Mapper = t37Mapper;
    }

    @Override
    public List<T37Dto> findAll() {
        return t37Repository.findAll()
                .stream()
                .map(t37Mapper::toDto)
                .toList();
    }

    @Override
    public T37Dto findById(Integer id) {
        return t37Repository.findById(id)
                .map(t37Mapper::toDto)
                .orElse(null);
    }
}
