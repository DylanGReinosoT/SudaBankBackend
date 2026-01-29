package com.sudamericano.bank.infrastructure.adapter.structure.L;

import com.sudamericano.bank.domain.model.structure.L.L05Dto;
import com.sudamericano.bank.domain.ports.outputs.structure.L.L05Port;
import com.sudamericano.bank.infrastructure.mapper.structure.L.L05Mapper;
import com.sudamericano.bank.infrastructure.persistence.entity.structure.L.L05Entity;
import com.sudamericano.bank.infrastructure.persistence.jpa.structure.L.L05Repository;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class L05RepositoryAdapter implements L05Port {

    private final L05Repository repository;
    private final L05Mapper mapper;

    public L05RepositoryAdapter(L05Repository repository, L05Mapper mapper) {
        this.repository = repository;
        this.mapper = mapper;
    }

    @Override
    public List<L05Dto> findAll() {
        return mapper.toDtoList(repository.findAll());
    }

    @Override
    public L05Dto findById(Integer id) {
        Optional<L05Entity> entity = repository.findById(id);
        return entity.map(mapper::toDto).orElse(null);
    }

    @Override
    public L05Dto create(L05Dto dto) {
        L05Entity saved = repository.save(mapper.toEntity(dto));
        return mapper.toDto(saved);
    }

    @Override
    public L05Dto update(Integer id, L05Dto dto) {
        if (!repository.existsById(id)) {
            return null;
        }
        L05Entity entity = mapper.toEntity(dto);
        entity.setId(id);
        return mapper.toDto(repository.save(entity));
    }

    @Override
    public void delete(Integer id) {
        repository.deleteById(id);
    }
}
