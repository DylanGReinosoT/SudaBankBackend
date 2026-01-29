package com.sudamericano.bank.infrastructure.adapter.catalog;

import com.sudamericano.bank.domain.model.catalog.T48Dto;
import com.sudamericano.bank.domain.ports.outputs.catalog.T48Port;
import com.sudamericano.bank.infrastructure.mapper.catalog.T48Mapper;
import com.sudamericano.bank.infrastructure.persistence.jpa.catalog.T48Repository;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class T48RepositoryAdapter implements T48Port {

    private final T48Repository repository;
    private final T48Mapper mapper;

    public T48RepositoryAdapter(T48Repository repository, T48Mapper mapper) {
        this.repository = repository;
        this.mapper = mapper;
    }

    @Override
    public List<T48Dto> findAll(){
        return repository.findAll()
                .stream()
                .map(mapper::toDto)
                .toList();
    }

    @Override
    public T48Dto findById(Integer id){
        return repository.findById(id)
                .map(mapper::toDto)
                .orElse(null);
    }
}
