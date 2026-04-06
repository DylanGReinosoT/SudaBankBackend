package com.sudamericano.bank.infrastructure.adapter.structure.L;

import com.sudamericano.bank.domain.model.structure.L.L09Dto;
import com.sudamericano.bank.domain.ports.outputs.structure.L.L09Port;
import com.sudamericano.bank.infrastructure.mapper.structure.L.L09Mapper;
import com.sudamericano.bank.infrastructure.persistence.entity.structure.L.L09Entity;
import com.sudamericano.bank.infrastructure.persistence.jpa.structure.L.L09Repository;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class L09RepositoryAdapter implements L09Port{

    private final L09Repository repository;
    private final L09Mapper mapper;

    public L09RepositoryAdapter(L09Repository repository, L09Mapper mapper) {
        this.repository = repository;
        this.mapper = mapper;

    }

    @Override
    public List<L09Dto> findAll() {
        return mapper.toDtoList(repository.findAll());
    }

    @Override
    public L09Dto findById(Long id) {
        return repository.findById(id).map(mapper::toDto).orElse(null);
    }

    @Override
    public L09Dto create(L09Dto dto) {
        L09Entity saved = repository.save(mapper.toEntity(dto));
        return mapper.toDto(saved);

    }

    @Override
    public L09Dto update(Long id, L09Dto dto) {
        if (!repository.existsById(id)) {
            return null;
        }
        L09Entity entity = mapper. toEntity(dto);
        entity.setId(id);
        return mapper.toDto(repository.save(entity));
    }

    @Override
    public void delete(Long id) {
        repository.deleteById(id);
    }


}
