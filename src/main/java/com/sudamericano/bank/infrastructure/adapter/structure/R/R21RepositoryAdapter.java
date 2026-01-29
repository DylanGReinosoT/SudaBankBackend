package com.sudamericano.bank.infrastructure.adapter.structure.R;

import com.sudamericano.bank.domain.model.structure.R.R21Dto;
import com.sudamericano.bank.domain.ports.outputs.structure.R.R21Port;
import com.sudamericano.bank.infrastructure.mapper.structure.R.R21Mapper;
import com.sudamericano.bank.infrastructure.persistence.entity.structure.R.R21Entity;
import com.sudamericano.bank.infrastructure.persistence.jpa.structure.R.R21Repository;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class R21RepositoryAdapter implements R21Port {

    private final R21Repository repository;
    private final R21Mapper mapper;

    public R21RepositoryAdapter(R21Repository repository, R21Mapper mapper) {
        this.repository = repository;
        this.mapper = mapper;
    }

    @Override
    public List<R21Dto> findAll() {
        return mapper.toDtoList(repository.findAll());
    }

    @Override
    public R21Dto findById(Long id) {
        Optional<R21Entity> entity = repository.findById(id);
        return entity.map(mapper::toDto).orElse(null);
    }

    @Override
    public R21Dto create(R21Dto dto) {
        R21Entity saved = repository.save(mapper.toEntity(dto));
        return mapper.toDto(saved);
    }

    @Override
    public R21Dto update(Long id, R21Dto dto) {
        if (!repository.existsById(id)) {
            return null;
        }
        R21Entity entity = mapper.toEntity(dto);
        entity.setId(id);
        return mapper.toDto(repository.save(entity));
    }

    @Override
    public void delete(Long id) {
        repository.deleteById(id);
    }
}
