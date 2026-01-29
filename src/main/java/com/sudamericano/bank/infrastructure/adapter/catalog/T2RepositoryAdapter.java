package com.sudamericano.bank.infrastructure.adapter.catalog;

import com.sudamericano.bank.domain.model.catalog.T2Dto;
import com.sudamericano.bank.domain.ports.outputs.catalog.T2Port;
import com.sudamericano.bank.infrastructure.mapper.catalog.T2Mapper;
import com.sudamericano.bank.infrastructure.persistence.jpa.catalog.T2Repository;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class T2RepositoryAdapter implements T2Port {
    private final T2Repository repository;
    private final T2Mapper mapper;

    public T2RepositoryAdapter(T2Repository repository, T2Mapper mapper) {
        this.repository = repository;
        this.mapper = mapper;
    }

    @Override
    public List<T2Dto> findAll(){
        return repository.findAll()
                .stream()
                .map(mapper::toDto)
                .toList();
    }

    @Override
    public T2Dto findById(Integer id){
        return repository.findById(id)
                .map(mapper::toDto)
                .orElse(null);
    }


}
