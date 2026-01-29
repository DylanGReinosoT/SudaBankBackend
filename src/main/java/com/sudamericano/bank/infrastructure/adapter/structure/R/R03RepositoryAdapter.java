package com.sudamericano.bank.infrastructure.adapter.structure.R;

import com.sudamericano.bank.domain.model.structure.R.R03Dto;
import com.sudamericano.bank.domain.ports.outputs.structure.R.R03Port;
import com.sudamericano.bank.infrastructure.mapper.structure.R.R03Mapper;
import com.sudamericano.bank.infrastructure.persistence.entity.structure.R.R03Entity;
import com.sudamericano.bank.infrastructure.persistence.jpa.structure.R.R03Repository;
import org.hibernate.annotations.Comment;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class R03RepositoryAdapter implements R03Port
{
    private final R03Repository repository;
    private final R03Mapper mapper;

    public R03RepositoryAdapter(R03Repository repository, R03Mapper mapper) {
        this.repository = repository;
        this.mapper = mapper;
    }

    @Override
    public List<R03Dto> findAll() {
        return mapper.toDtoList(repository.findAll());
    }

    @Override
    public R03Dto findById(Long id) {
        Optional<R03Entity> entity = repository.findById(id);
        return entity.map(mapper::toDto).orElse(null);
    }

    @Override
    public R03Dto create(R03Dto dto) {
        R03Entity saved = repository.save(mapper.toEntity(dto));
        return mapper.toDto(saved);
    }

    @Override
    public R03Dto update(Long id, R03Dto dto) {
        if (!repository.existsById(id)) {
            return null;
        }
        R03Entity entity = mapper.toEntity(dto);
        entity.setId(id);
        return mapper.toDto(repository.save(entity));
    }

    @Override
    public void delete(Long id) {
        repository.deleteById(id);
    }
}
