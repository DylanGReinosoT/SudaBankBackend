package com.sudamericano.bank.infrastructure.adapter.structure.R;

import com.sudamericano.bank.domain.model.structure.R.R13Dto;
import com.sudamericano.bank.domain.ports.outputs.structure.R.R13Port;
import com.sudamericano.bank.infrastructure.mapper.structure.R.R13Mapper;
import com.sudamericano.bank.infrastructure.persistence.entity.structure.R.R13Entity;
import com.sudamericano.bank.infrastructure.persistence.jpa.structure.R.R13Repository;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class R13RepositoryAdapter implements R13Port {
    
    private final R13Repository repository;
    private final R13Mapper mapper;

    public R13RepositoryAdapter(R13Repository repository, R13Mapper mapper) {
        this.repository = repository;
        this.mapper = mapper;
    }

    @Override
    public List<R13Dto> findAll() {
        return mapper.toDtoList(repository.findAll());
    }

    @Override
    public R13Dto findById(Long id) {
        Optional<R13Entity> entity = repository.findById(id);
        return entity.map(mapper::toDto).orElse(null);
    }

    @Override
    public R13Dto create(R13Dto dto) {
        R13Entity saved = repository.save(mapper.toEntity(dto));
        return mapper.toDto(saved);
    }

    @Override
    public R13Dto update(Long id, R13Dto dto) {
        if (!repository.existsById(id)) {
            return null;
        }
        R13Entity entity = mapper.toEntity(dto);
        entity.setId(id);
        return mapper.toDto(repository.save(entity));
    }

    @Override
    public void delete(Long id) {
        repository.deleteById(id);
    }
    
}
