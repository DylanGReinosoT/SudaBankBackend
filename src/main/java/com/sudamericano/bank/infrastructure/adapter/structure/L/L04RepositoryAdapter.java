package com.sudamericano.bank.infrastructure.adapter.structure.L;

import com.sudamericano.bank.domain.model.structure.L.L04Dto;
import com.sudamericano.bank.domain.ports.outputs.structure.L.L04Port;
import com.sudamericano.bank.infrastructure.mapper.structure.L.L04Mapper;
import com.sudamericano.bank.infrastructure.persistence.entity.structure.L.L04Entity;
import com.sudamericano.bank.infrastructure.persistence.jpa.structure.L.L04Repository;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class L04RepositoryAdapter implements L04Port {

    private final L04Repository repository;
    private final L04Mapper mapper;

    public L04RepositoryAdapter(L04Repository repository, L04Mapper mapper) {
        this.repository = repository;
        this.mapper = mapper;
    }

    @Override
    public List<L04Dto> findAll() {
        return mapper.toDtoList(repository.findAll());
    }

    @Override
    public L04Dto findById(Long id) {
        Optional<L04Entity> entity = repository.findById(id);
        return entity.map(mapper::toDto).orElse(null);
    }

    @Override
    public L04Dto create(L04Dto dto) {
        L04Entity saved = repository.save(mapper.toEntity(dto));
        return mapper.toDto(saved);
    }

    @Override
    public L04Dto update(Long id, L04Dto dto) {
        if (!repository.existsById(id)) {
            return null;
        }
        L04Entity entity = mapper.toEntity(dto);
        entity.setId(id);
        return mapper.toDto(repository.save(entity));
    }

    @Override
    public void delete(Long id) {
        repository.deleteById(id);
    }
}
