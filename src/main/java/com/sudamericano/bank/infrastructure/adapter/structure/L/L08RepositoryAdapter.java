package com.sudamericano.bank.infrastructure.adapter.structure.L;

import com.sudamericano.bank.domain.model.structure.L.L08Dto;
import com.sudamericano.bank.domain.ports.outputs.structure.L.L08Port;
import com.sudamericano.bank.infrastructure.mapper.structure.L.L08Mapper;
import com.sudamericano.bank.infrastructure.persistence.entity.structure.L.L08Entity;
import com.sudamericano.bank.infrastructure.persistence.jpa.structure.L.L08Repository;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class L08RepositoryAdapter implements L08Port {
    private final L08Repository repository;
    private final L08Mapper mapper;

    public L08RepositoryAdapter(L08Repository repository, L08Mapper mapper) {
        this.repository = repository;
        this.mapper = mapper;
    }

    @Override
    public List<L08Dto> findAll() {
        return mapper.toDtoList(repository.findAll());
    }

    @Override
    public L08Dto findById(Long id) {
        Optional<L08Entity> entity = repository.findById(id);
        return entity.map(mapper::toDto).orElse(null);
    }

    @Override
    public L08Dto create(L08Dto dto) {
        L08Entity saved = repository.save(mapper.toEntity(dto));
        return mapper.toDto(saved);
    }

    @Override
    public L08Dto update(Long id, L08Dto dto) {
        if (!repository.existsById(id)) {
            return null;
        }
        L08Entity entity = mapper.toEntity(dto);
        entity.setId(id);
        return mapper.toDto(repository.save(entity));
    }

    @Override
    public void delete(Long id) {
        repository.deleteById(id);
    }
}
