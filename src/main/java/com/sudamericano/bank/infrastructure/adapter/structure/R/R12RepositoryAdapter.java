package com.sudamericano.bank.infrastructure.adapter.structure.R;

import com.sudamericano.bank.domain.model.structure.R.R12Dto;
import com.sudamericano.bank.domain.ports.outputs.structure.R.R12Port;
import com.sudamericano.bank.infrastructure.mapper.structure.R.R12Mapper;
import com.sudamericano.bank.infrastructure.persistence.entity.structure.R.R12Entity;
import com.sudamericano.bank.infrastructure.persistence.jpa.structure.R.R12Repository;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class R12RepositoryAdapter implements R12Port {
    private final R12Repository repository;
    private final R12Mapper mapper;

    public R12RepositoryAdapter(R12Repository repository, R12Mapper mapper){
        this.repository = repository;
        this.mapper = mapper;
    }

    @Override
    public List<R12Dto> findAll(){
        return mapper.toDtoList(repository.findAll());
    }

    @Override
    public R12Dto findById(Long id){
        Optional<R12Entity> entity = repository.findById(id);
        return entity.map(mapper::toDto).orElse(null);
    }

    @Override
    public R12Dto create(R12Dto dto){
        R12Entity saved = repository.save(mapper.toEntity(dto));
        return mapper.toDto(saved);
    }

    @Override
    public R12Dto update(Long id, R12Dto dto){
        if(!repository.existsById(id)){
            return null;
        }
        R12Entity entity = mapper.toEntity(dto);
        entity.setId(id);
        return mapper.toDto(repository.save(entity));
    }

    @Override
    public void delete(Long id){
        repository.deleteById(id);
    }
}

