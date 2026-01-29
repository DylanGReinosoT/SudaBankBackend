package com.sudamericano.bank.infrastructure.adapter.structure.R;

import com.sudamericano.bank.domain.model.structure.R.R07Dto;
import com.sudamericano.bank.domain.ports.outputs.structure.R.R07Port;
import com.sudamericano.bank.infrastructure.mapper.structure.R.R07Mapper;
import com.sudamericano.bank.infrastructure.persistence.entity.structure.R.R07Entity;
import com.sudamericano.bank.infrastructure.persistence.jpa.structure.R.R07Repository;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class R07RepositoryAdapter implements R07Port {

    private final R07Repository repository;
    private final R07Mapper mapper;

    public R07RepositoryAdapter(R07Repository repository, R07Mapper mapper) {
        this.repository = repository;
        this.mapper = mapper;
    }

    @Override
    public List<R07Dto> findAll() {
        return mapper.toDtoList(repository.findAll());
    }

    @Override
    public R07Dto findById(Long id) {
        Optional<R07Entity> entity = repository.findById(id);
        return entity.map(mapper::toDto).orElse(null);
    }

    @Override
    public R07Dto create(R07Dto dto) {
        R07Entity saved = repository.save(mapper.toEntity(dto));
        return mapper.toDto(saved);
    }

    @Override
    public R07Dto update(Long id, R07Dto dto) {
        if (!repository.existsById(id)) {
            return null;
        }
        R07Entity entity = mapper.toEntity(dto);
        entity.setId(id);
        return mapper.toDto(repository.save(entity));
    }

    @Override
    public void delete(Long id) {
        repository.deleteById(id);
    }
}