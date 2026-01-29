package com.sudamericano.bank.infrastructure.adapter.catalog;

import com.sudamericano.bank.domain.model.catalog.T41Dto;
import com.sudamericano.bank.domain.ports.outputs.catalog.T41Port;
import com.sudamericano.bank.infrastructure.mapper.catalog.T41Mapper;
import com.sudamericano.bank.infrastructure.persistence.jpa.catalog.T41Repository;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class T41RepositoryAdapter implements T41Port {

    private final T41Repository repository;
    private final T41Mapper mapper;

    public T41RepositoryAdapter(T41Repository repository, T41Mapper mapper) {
        this.repository = repository;
        this.mapper = mapper;
    }

    @Override
    public List<T41Dto> findAll(){
        return repository.findAll()
                .stream()
                .map(mapper::toDto)
                .toList();
    }

    @Override
    public T41Dto findById(Integer id){
        return repository.findById(id)
                .map(mapper::toDto)
                .orElse(null);
    }
}
