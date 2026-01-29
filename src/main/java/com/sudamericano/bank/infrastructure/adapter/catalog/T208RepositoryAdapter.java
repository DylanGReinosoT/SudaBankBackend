package com.sudamericano.bank.infrastructure.adapter.catalog;

import com.sudamericano.bank.domain.model.catalog.T208Dto;
import com.sudamericano.bank.domain.ports.outputs.catalog.T208Port;
import com.sudamericano.bank.infrastructure.mapper.catalog.T208Mapper;
import com.sudamericano.bank.infrastructure.persistence.jpa.catalog.T208Repository;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class T208RepositoryAdapter implements T208Port {

    private final T208Repository repository;
    private final T208Mapper mapper;

    public T208RepositoryAdapter(T208Repository repository, T208Mapper mapper) {
        this.repository = repository;
        this.mapper = mapper;
    }

    @Override
    public List<T208Dto> findAll(){
        return repository.findAll()
                .stream()
                .map(mapper::toDto)
                .toList();
    }

    @Override
    public T208Dto findById(Integer id){
        return repository.findById(id)
                .map(mapper::toDto)
                .orElse(null);
    }
}
