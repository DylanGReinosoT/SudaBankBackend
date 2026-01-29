package com.sudamericano.bank.infrastructure.adapter.structure.R;

import com.sudamericano.bank.domain.model.structure.R.R04Dto;
import com.sudamericano.bank.domain.ports.outputs.structure.R.R04Port;
import com.sudamericano.bank.infrastructure.mapper.structure.R.R04Mapper;
import com.sudamericano.bank.infrastructure.persistence.entity.structure.R.R04Entity;
import com.sudamericano.bank.infrastructure.persistence.jpa.structure.R.R04Repository;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class R04RepositoryAdapter implements R04Port {
    private final R04Repository repository;
    private final R04Mapper mapper;

    public R04RepositoryAdapter(R04Repository repository, R04Mapper mapper) {
        this.repository = repository;
        this.mapper = mapper;
    }

    @Override
    public List<R04Dto> findAll() {
        return mapper.toDtoList(repository.findAll());
    }

    @Override
    public R04Dto findById(Long id) {
        Optional<R04Entity> entity = repository.findById(id);
        return entity.map(mapper::toDto).orElse(null);
    }

    @Override
    public R04Dto create(R04Dto dto) {
        R04Entity saved = repository.save(mapper.toEntity(dto));
        return mapper.toDto(saved);
    }

    @Override
    public R04Dto update(Long id, R04Dto dto) {
        if (!repository.existsById(id)) {
            return null;
        }
        R04Entity entity = mapper.toEntity(dto);
        entity.setId(id);
        return mapper.toDto(repository.save(entity));
    }

    @Override
    public void delete(Long id) {
        repository.deleteById(id);
    }
}