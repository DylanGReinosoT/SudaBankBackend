package com.sudamericano.bank.infrastructure.adapter.structure.R;

import com.sudamericano.bank.domain.model.structure.R.R08Dto;
import com.sudamericano.bank.domain.ports.outputs.structure.R.R08Port;
import com.sudamericano.bank.infrastructure.mapper.structure.R.R08Mapper;
import com.sudamericano.bank.infrastructure.persistence.entity.structure.R.R08Entity;
import com.sudamericano.bank.infrastructure.persistence.jpa.structure.R.R08Repository;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class R08RepositoryAdapter implements R08Port {
    private final R08Repository repository;
    private final R08Mapper mapper;

    public R08RepositoryAdapter(R08Repository repository, R08Mapper mapper) {
        this.repository = repository;
        this.mapper = mapper;
    }

    @Override
    public List<R08Dto> findAll() {
        return mapper.toDtoList(repository.findAll());
    }

    @Override
    public R08Dto findById(Long id) {
        Optional<R08Entity> entity = repository.findById(id);
        return entity.map(mapper::toDto).orElse(null);
    }

    @Override
    public R08Dto create(R08Dto dto) {
        R08Entity saved = repository.save(mapper.toEntity(dto));
        return mapper.toDto(saved);
    }

    @Override
    public R08Dto update(Long id, R08Dto dto) {
        if (!repository.existsById(id)) {
            return null;
        }
        R08Entity entity = mapper.toEntity(dto);
        entity.setId(id);
        return mapper.toDto(repository.save(entity));
    }

    @Override
    public void delete(Long id) {
        repository.deleteById(id);
    }
}
