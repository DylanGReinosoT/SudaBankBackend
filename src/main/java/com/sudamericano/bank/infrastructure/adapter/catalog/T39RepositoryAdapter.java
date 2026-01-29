package com.sudamericano.bank.infrastructure.adapter.catalog;

import com.sudamericano.bank.domain.model.catalog.T39Dto;
import com.sudamericano.bank.domain.ports.outputs.catalog.T39Port;
import com.sudamericano.bank.infrastructure.mapper.catalog.T39Mapper;
import com.sudamericano.bank.infrastructure.persistence.jpa.catalog.T39Repository;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class T39RepositoryAdapter implements T39Port {

    private final T39Repository repository;
    private final T39Mapper mapper;

    public T39RepositoryAdapter(T39Repository repository, T39Mapper mapper) {
        this.repository = repository;
        this.mapper = mapper;
    }

    @Override
    public List<T39Dto> findAll(){
        return repository.findAll()
                .stream()
                .map(mapper::toDto)
                .toList();
    }

    @Override
    public T39Dto findById(Integer id){
        return repository.findById(id)
                .map(mapper::toDto)
                .orElse(null);
    }
}
