package com.sudamericano.bank.infrastructure.adapter.structure.R;

import com.sudamericano.bank.domain.model.structure.R.R05Dto;
import com.sudamericano.bank.domain.ports.outputs.structure.R.R05Port;
import com.sudamericano.bank.infrastructure.mapper.structure.R.R05Mapper;
import com.sudamericano.bank.infrastructure.persistence.entity.structure.R.R05Entity;
import com.sudamericano.bank.infrastructure.persistence.jpa.structure.R.R05Repository;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class R05RepositoryAdapter implements R05Port {
    private final R05Repository repository;
    private final R05Mapper mapper;

    public R05RepositoryAdapter(R05Repository repository, R05Mapper mapper) {
        this.repository = repository;
        this.mapper = mapper;
    }

    @Override
    public List<R05Dto> findAll() {
        return mapper.toDtoList(repository.findAll());
    }

    @Override
    public R05Dto findById(Long id) {
        Optional<R05Entity> entity = repository.findById(id);
        return entity.map(mapper::toDto).orElse(null);
    }

    @Override
    public R05Dto create(R05Dto dto) {
        R05Entity saved = repository.save(mapper.toEntity(dto));
        return mapper.toDto(saved);
    }

    @Override
    public R05Dto update(Long id, R05Dto dto) {
        if (!repository.existsById(id)) {
            return null;
        }
        R05Entity entity = mapper.toEntity(dto);
        entity.setId(id);
        return mapper.toDto(repository.save(entity));
    }

    @Override
    public void delete(Long id) {
        repository.deleteById(id);
    }
}
