package com.sudamericano.bank.infrastructure.adapter.structure.R;

import com.sudamericano.bank.domain.model.structure.R.R10Dto;
import com.sudamericano.bank.domain.ports.outputs.structure.R.R10Port;
import com.sudamericano.bank.infrastructure.mapper.structure.R.R10Mapper;
import com.sudamericano.bank.infrastructure.persistence.entity.structure.R.R10Entity;
import com.sudamericano.bank.infrastructure.persistence.jpa.structure.R.R10Repository;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class R10RepositoryAdapter implements R10Port {
    private final R10Repository repository;
    private final R10Mapper mapper;

    public R10RepositoryAdapter(R10Repository repository, R10Mapper mapper) {
        this.repository = repository;
        this.mapper = mapper;
    }

    @Override
    public List<R10Dto> findAll() {
        return mapper.toDtoList(repository.findAll());
    }

    @Override
    public R10Dto findById(Long id) {
        Optional<R10Entity> entity = repository.findById(id);
        return entity.map(mapper::toDto).orElse(null);
    }

    @Override
    public R10Dto create(R10Dto dto) {
        R10Entity saved = repository.save(mapper.toEntity(dto));
        return mapper.toDto(saved);
    }

    @Override
    public R10Dto update(Long id, R10Dto dto) {
        if (!repository.existsById(id)) {
            return null;
        }
        R10Entity entity = mapper.toEntity(dto);
        entity.setId(id);
        return mapper.toDto(repository.save(entity));
    }

    @Override
    public void delete(Long id) {
        repository.deleteById(id);
    }
}
