package com.sudamericano.bank.infrastructure.adapter.structure.L;

import com.sudamericano.bank.domain.model.structure.L.L02Dto;
import com.sudamericano.bank.domain.ports.outputs.structure.L.L02Port;
import com.sudamericano.bank.infrastructure.mapper.structure.L.L02Mapper;
import com.sudamericano.bank.infrastructure.persistence.entity.structure.L.L02Entity;
import com.sudamericano.bank.infrastructure.persistence.jpa.structure.L.L02Repository;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class L02RepositoryAdapter implements L02Port {

    private final L02Repository repository;
    private final L02Mapper mapper;

    public L02RepositoryAdapter(L02Repository repository, L02Mapper mapper) {
        this.repository = repository;
        this.mapper = mapper;
    }

    @Override
    public List<L02Dto> findAll() {
        return mapper.toDtoList(repository.findAll());
    }

    @Override
    public L02Dto findById(Long id) {
        Optional<L02Entity> entity = repository.findById(id);
        return entity.map(mapper::toDto).orElse(null);
    }

    @Override
    public L02Dto create(L02Dto dto) {
        L02Entity saved = repository.save(mapper.toEntity(dto));
        return mapper.toDto(saved);
    }

    @Override
    public L02Dto update(Long id, L02Dto dto) {
        if (!repository.existsById(id)) {
            return null;
        }
        L02Entity entity = mapper.toEntity(dto);
        entity.setId(id);
        return mapper.toDto(repository.save(entity));
    }

    @Override
    public void delete(Long id) {
        repository.deleteById(id);
    }
}
