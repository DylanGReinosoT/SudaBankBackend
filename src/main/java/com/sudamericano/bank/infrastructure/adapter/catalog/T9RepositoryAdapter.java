package com.sudamericano.bank.infrastructure.adapter.catalog;

import com.sudamericano.bank.domain.model.catalog.T9Dto;
import com.sudamericano.bank.domain.ports.outputs.catalog.T9Port;
import com.sudamericano.bank.infrastructure.mapper.catalog.T9Mapper;
import com.sudamericano.bank.infrastructure.persistence.jpa.catalog.T9Repository;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class T9RepositoryAdapter implements T9Port{
    private final T9Repository repository;
    private final T9Mapper mapper;

    public T9RepositoryAdapter(T9Repository repository, T9Mapper mapper) {
        this.repository = repository;
        this.mapper = mapper;
    }

    @Override
    public List<T9Dto> findAll(){
        return repository.findAll()
                .stream()
                .map(mapper::toDto)
                .toList();
    }

    @Override
    public T9Dto findById(Integer id){
        return repository.findById(id)
                .map(mapper :: toDto)
                .orElse(null);
    }
}
