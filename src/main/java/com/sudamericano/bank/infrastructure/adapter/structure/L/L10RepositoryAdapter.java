package com.sudamericano.bank.infrastructure.adapter.structure.L;

import com.sudamericano.bank.domain.model.structure.L.L10Dto;
import com.sudamericano.bank.domain.ports.outputs.structure.L.L10Port;
import com.sudamericano.bank.infrastructure.mapper.structure.L.L10Mapper;
import com.sudamericano.bank.infrastructure.persistence.entity.structure.L.L10Entity;
import com.sudamericano.bank.infrastructure.persistence.jpa.structure.L.L10Repository;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class L10RepositoryAdapter implements L10Port {

    private final L10Repository repository;
    private final L10Mapper mapper;

    public L10RepositoryAdapter(L10Repository repository, L10Mapper mapper) {
        this.repository = repository;
        this.mapper = mapper;
    }

    @Override
    public List<L10Dto> findAll() {
        return mapper.toDtoList(repository.findAll());
    }

    @Override
    public L10Dto findById(Long id) {
        return repository.findById(id).map(mapper::toDto).orElse(null);
    }

    @Override
    public L10Dto create(L10Dto dto) {
        return mapper.toDto(repository.save(mapper.toEntity(dto)));
    }

    @Override
    public L10Dto update(Long id, L10Dto dto) {
        if (!repository.existsById(id)) {
            return null;
        }
        L10Entity entity = mapper.toEntity(dto);
        entity.setId(id);
        return mapper.toDto(repository.save(entity));
    }

    @Override
    public void delete(Long id) {
        repository.deleteById(id);
    }

}
