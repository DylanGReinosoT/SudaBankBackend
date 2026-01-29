package com.sudamericano.bank.infrastructure.adapter.structure.R;

import com.sudamericano.bank.domain.model.structure.R.R20Dto;
import com.sudamericano.bank.domain.ports.outputs.structure.R.R20Port;
import com.sudamericano.bank.infrastructure.mapper.structure.R.R20Mapper;
import com.sudamericano.bank.infrastructure.persistence.entity.structure.R.R20Entity;
import com.sudamericano.bank.infrastructure.persistence.jpa.structure.R.R20Repository;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class R20RepositoryAdapter implements R20Port {
    private final R20Repository repository;
    private final R20Mapper mapper;

    public R20RepositoryAdapter(R20Repository repository, R20Mapper mapper) {
        this.repository = repository;
        this.mapper = mapper;
    }

    @Override
    public List<R20Dto> findAll() {
        return mapper.toDtoList(repository.findAll());
    }

    @Override
    public R20Dto findById(Long id) {
        Optional<R20Entity> entity = repository.findById(id);
        return entity.map(mapper::toDto).orElse(null);
    }

    @Override
    public R20Dto create(R20Dto dto) {
        R20Entity saved = repository.save(mapper.toEntity(dto));
        return mapper.toDto(saved);
    }

    @Override
    public R20Dto update(Long id, R20Dto dto) {
        if (!repository.existsById(id)) {
            return null;
        }
        R20Entity entity = mapper.toEntity(dto);
        entity.setId(id);
        return mapper.toDto(repository.save(entity));
    }

    @Override
    public void delete(Long id) {
        repository.deleteById(id);
    }
}
