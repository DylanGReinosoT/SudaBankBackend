package com.sudamericano.bank.infrastructure.adapter.structure.L;

import com.sudamericano.bank.domain.model.structure.L.L06Dto;
import com.sudamericano.bank.domain.ports.outputs.structure.L.L06Port;
import com.sudamericano.bank.infrastructure.mapper.structure.L.L06Mapper;
import com.sudamericano.bank.infrastructure.persistence.entity.structure.L.L06Entity;
import com.sudamericano.bank.infrastructure.persistence.jpa.structure.L.L06Repository;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class L06RepositoryAdapter implements L06Port {

    private final L06Repository repository;
    private final L06Mapper mapper;

    public L06RepositoryAdapter(L06Repository repository, L06Mapper mapper) {
        this.repository = repository;
        this.mapper = mapper;
    }

    @Override
    public List<L06Dto> findAll() {
        return mapper.toDtoList(repository.findAll());
    }

    @Override
    public L06Dto findById(Integer id) {
      Optional<L06Entity> entity = repository.findById(id);
      return entity.map(mapper::toDto).orElse(null);
    }

    @Override
    public L06Dto create(L06Dto dto){
        L06Entity saved = repository.save(mapper.toEntity(dto));
        return mapper.toDto(saved);
    }

    @Override
    public L06Dto update(Integer id, L06Dto dto) {
        if (!repository.existsById(id)) {
            return null;
        }
        L06Entity entity = mapper.toEntity(dto);
        entity.setId(id);
        return mapper.toDto(repository.save(entity));
    }
    @Override
    public void delete(Integer id) {
        repository.deleteById(id);
    }
}
