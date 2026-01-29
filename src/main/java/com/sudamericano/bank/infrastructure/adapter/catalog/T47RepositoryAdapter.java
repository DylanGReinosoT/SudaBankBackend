package com.sudamericano.bank.infrastructure.adapter.catalog;

import com.sudamericano.bank.domain.model.catalog.T47Dto;
import com.sudamericano.bank.domain.ports.outputs.catalog.T47Port;
import com.sudamericano.bank.infrastructure.mapper.catalog.T47Mapper;
import com.sudamericano.bank.infrastructure.persistence.jpa.catalog.T47Repository;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class T47RepositoryAdapter implements T47Port {

    private final T47Repository repository;
    private final T47Mapper mapper;

    public T47RepositoryAdapter(T47Repository repository, T47Mapper mapper) {
        this.repository = repository;
        this.mapper = mapper;
    }

    @Override
    public List<T47Dto> findAll(){
        return repository.findAll()
                .stream()
                .map(mapper::toDto)
                .toList();
    }

    @Override
    public T47Dto findById(Integer id){
        return repository.findById(id)
                .map(mapper::toDto)
                .orElse(null);
    }
}
