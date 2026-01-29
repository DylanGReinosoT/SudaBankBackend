package com.sudamericano.bank.infrastructure.adapter.catalog;

import com.sudamericano.bank.domain.model.catalog.T59Dto;
import com.sudamericano.bank.domain.ports.outputs.catalog.T59Port;
import com.sudamericano.bank.infrastructure.mapper.catalog.T59Mapper;
import com.sudamericano.bank.infrastructure.persistence.entity.catalog.T59Entity;
import com.sudamericano.bank.infrastructure.persistence.jpa.catalog.T59Repository;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class T59RepositoryAdapter implements T59Port {

    private final T59Repository repository;
    private final T59Mapper mapper;

    public T59RepositoryAdapter(T59Repository repository, T59Mapper mapper) {
        this.repository = repository;
        this.mapper = mapper;
    }

    @Override
    public List<T59Dto> findAll() {return mapper.toDtoList(repository.findAll());}

    @Override
    public T59Dto findById(Integer id) {
        Optional<T59Entity> entity = repository.findById(id);
        return entity.map(mapper::toDto).orElse(null);
    }
}
