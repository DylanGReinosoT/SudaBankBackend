package com.sudamericano.bank.infrastructure.adapter.structure.R;

import com.sudamericano.bank.domain.model.structure.R.R09Dto;
import com.sudamericano.bank.domain.ports.outputs.structure.R.R09Port;
import com.sudamericano.bank.infrastructure.mapper.structure.R.R09Mapper;
import com.sudamericano.bank.infrastructure.persistence.entity.structure.R.R09Entity;
import com.sudamericano.bank.infrastructure.persistence.jpa.structure.R.R09Repository;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class R09RepositoryAdapter implements R09Port {
    private final R09Repository repository;
    private final R09Mapper mapper;

    public R09RepositoryAdapter(R09Repository repository, R09Mapper mapper) {
        this.repository = repository;
        this.mapper = mapper;
    }

    @Override
    public List<R09Dto> findAll() {
        return mapper.toDtoList(repository.findAll());
    }

    @Override
    public R09Dto findById(Long id) {
        Optional<R09Entity> entity = repository.findById(id);
        return entity.map(mapper::toDto).orElse(null);
    }

    @Override
    public R09Dto create(R09Dto dto) {
        R09Entity saved = repository.save(mapper.toEntity(dto));
        return mapper.toDto(saved);
    }

    @Override
    public R09Dto update(Long id, R09Dto dto) {
        if (!repository.existsById(id)) {
            return null;
        }
        R09Entity entity = mapper.toEntity(dto);
        entity.setId(id);
        return mapper.toDto(repository.save(entity));
    }

    @Override
    public void delete(Long id) {
        repository.deleteById(id);
    }
}
