package com.sudamericano.bank.infrastructure.adapter.structure.R;

import com.sudamericano.bank.domain.model.structure.R.R02Dto;
import com.sudamericano.bank.domain.ports.outputs.structure.R.R02Port;
import com.sudamericano.bank.infrastructure.mapper.structure.R.R02Mapper;
import com.sudamericano.bank.infrastructure.persistence.entity.structure.R.R02Entity;
import com.sudamericano.bank.infrastructure.persistence.jpa.structure.R.R02Repository;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class R02RepositoryAdapter implements R02Port {

    private final R02Repository repository;
    private final R02Mapper mapper;

    public R02RepositoryAdapter(R02Repository repository, R02Mapper mapper) {
        this.repository = repository;
        this.mapper = mapper;
    }

    @Override
    public List<R02Dto> findAll() {
        return mapper.toDtoList(repository.findAll());
    }

    @Override
    public R02Dto findById(Long id) {
        Optional<R02Entity> entity = repository.findById(id);
        return entity.map(mapper::toDto).orElse(null);
    }

    @Override
    public R02Dto create(R02Dto dto) {
        R02Entity saved = repository.save(mapper.toEntity(dto));
        return mapper.toDto(saved);
    }

    @Override
    public R02Dto update(Long id, R02Dto dto) {
        if (!repository.existsById(id)) {
            return null;
        }
        R02Entity entity = mapper.toEntity(dto);
        entity.setId(id);
        return mapper.toDto(repository.save(entity));
    }

    @Override
    public void delete(Long id) {
        repository.deleteById(id);
    }

}

