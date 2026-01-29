package com.sudamericano.bank.infrastructure.adapter.catalog;

import com.sudamericano.bank.domain.model.catalog.T64Dto;
import com.sudamericano.bank.domain.ports.outputs.catalog.T64Port;
import com.sudamericano.bank.infrastructure.mapper.catalog.T64Mapper;
import com.sudamericano.bank.infrastructure.persistence.entity.catalog.T64Entity;
import com.sudamericano.bank.infrastructure.persistence.jpa.catalog.T64Repository;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class T64RepositoryAdapter implements T64Port {

    private final T64Repository repository;
    private final T64Mapper mapper;

    public T64RepositoryAdapter(T64Repository repository, T64Mapper mapper) {
        this.repository = repository;
        this.mapper = mapper;
    }

    @Override
    public List<T64Dto> findAll() {
        return mapper.toDtoList(repository.findAll());
    }

    @Override
    public T64Dto findById(Integer id) {
        Optional<T64Entity> entity = repository.findById(id);
        return entity.map(mapper::toDto).orElse(null);
    }

    @Override
    public T64Dto create(T64Dto dto) {
        T64Entity saved = repository.save(mapper.toEntity(dto));
        return mapper.toDto(saved);
    }

    @Override
    public T64Dto update(Integer id, T64Dto dto) {
        if (!repository.existsById(id)) {
            return null;
        }
        T64Entity entity = mapper.toEntity(dto);
        entity.setId(id);
        return mapper.toDto(repository.save(entity));
    }

    @Override
    public void delete(Integer id) {
        repository.deleteById(id);
    }
}
