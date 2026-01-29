package com.sudamericano.bank.infrastructure.adapter.structure.R;

import com.sudamericano.bank.domain.model.structure.R.R11Dto;
import com.sudamericano.bank.domain.ports.outputs.structure.R.R11Port;
import com.sudamericano.bank.infrastructure.mapper.structure.R.R11Mapper;
import com.sudamericano.bank.infrastructure.persistence.entity.structure.R.R11Entity;
import com.sudamericano.bank.infrastructure.persistence.jpa.structure.R.R11Repository;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class R11RepositoryAdapter implements R11Port {
    
    private final R11Repository repository;
    private final R11Mapper mapper;

    public R11RepositoryAdapter(R11Repository repository, R11Mapper mapper) {
        this.repository = repository;
        this.mapper = mapper;
    }

    @Override
    public List<R11Dto> findAll() {
        return mapper.toDtoList(repository.findAll());
    }

    @Override
    public R11Dto findById(Long id) {
        Optional<R11Entity> entity = repository.findById(id);
        return entity.map(mapper::toDto).orElse(null);
    }

    @Override
    public R11Dto create(R11Dto dto) {
        R11Entity saved = repository.save(mapper.toEntity(dto));
        return mapper.toDto(saved);
    }

    @Override
    public R11Dto update(Long id, R11Dto dto) {
        if (!repository.existsById(id)) {
            return null;
        }
        R11Entity entity = mapper.toEntity(dto);
        entity.setId(id);
        return mapper.toDto(repository.save(entity));
    }

    @Override
    public void delete(Long id) {
        repository.deleteById(id);
    }
    
}
