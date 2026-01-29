package com.sudamericano.bank.infrastructure.adapter.catalog;

import com.sudamericano.bank.domain.model.catalog.T164Dto;
import com.sudamericano.bank.domain.ports.outputs.catalog.T164Port;
import com.sudamericano.bank.infrastructure.mapper.catalog.T164Mapper;
import com.sudamericano.bank.infrastructure.persistence.entity.catalog.T164Entity;
import com.sudamericano.bank.infrastructure.persistence.jpa.catalog.T164Repository;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class T164RepositoryAdapter implements T164Port {

    private final T164Repository repository;
    private final T164Mapper mapper;

    public T164RepositoryAdapter(T164Repository repository, T164Mapper mapper) {
        this.repository = repository;
        this.mapper = mapper;
    }

    @Override
    public List<T164Dto> findAll() {
        return mapper.toDtoList(repository.findAll());
    }

    @Override
    public T164Dto findById(Integer id) {
        Optional<T164Entity> entity = repository.findById(id);
        return entity.map(mapper::toDto).orElse(null);
    }

    @Override
    public T164Dto create(T164Dto dto) {
        T164Entity saved = repository.save(mapper.toEntity(dto));
        return mapper.toDto(saved);
    }

    @Override
    public T164Dto update(Integer id, T164Dto dto) {
        if (!repository.existsById(id)) {
            return null;
        }
        T164Entity entity = mapper.toEntity(dto);
        entity.setId(id);
        return mapper.toDto(repository.save(entity));
    }

    @Override
    public void delete(Integer id) {
        repository.deleteById(id);
    }
}
