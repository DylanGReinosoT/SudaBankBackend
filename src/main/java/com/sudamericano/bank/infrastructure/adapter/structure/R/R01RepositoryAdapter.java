package com.sudamericano.bank.infrastructure.adapter.structure.R;

import com.sudamericano.bank.domain.model.structure.R.R01Dto;
import com.sudamericano.bank.domain.ports.outputs.structure.R.R01Port;
import com.sudamericano.bank.infrastructure.mapper.structure.R.R01Mapper;
import com.sudamericano.bank.infrastructure.persistence.entity.structure.R.R01Entity;
import com.sudamericano.bank.infrastructure.persistence.jpa.structure.R.R01Repository;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class R01RepositoryAdapter implements R01Port {
    private final R01Repository repository;
    private final R01Mapper mapper;

    public R01RepositoryAdapter(R01Repository repository, R01Mapper mapper) {
        this.repository = repository;
        this.mapper = mapper;
    }

    @Override
    public List<R01Dto> findAll() {
        return mapper.toDtoList(repository.findAll());
    }

    @Override
    public R01Dto findById(Long id) {
        Optional<R01Entity> entity = repository.findById(id);
        return entity.map(mapper::toDto).orElse(null);
    }

    @Override
    public R01Dto create(R01Dto dto) {
        R01Entity saved = repository.save(mapper.toEntity(dto));
        return mapper.toDto(saved);
    }

    @Override
    public R01Dto update(Long id, R01Dto dto) {
        if (!repository.existsById(id)) {
            return null;
        }
        R01Entity entity = mapper.toEntity(dto);
        entity.setId(id);
        return mapper.toDto(repository.save(entity));
    }

    @Override
    public void delete(Long id) {
        repository.deleteById(id);
    }
}
