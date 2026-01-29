package com.sudamericano.bank.infrastructure.adapter.catalog;

import com.sudamericano.bank.domain.model.catalog.T62ADto;
import com.sudamericano.bank.domain.ports.outputs.catalog.T62APort;
import com.sudamericano.bank.infrastructure.mapper.catalog.T62AMapper;
import com.sudamericano.bank.infrastructure.persistence.entity.catalog.T62AEntity;
import com.sudamericano.bank.infrastructure.persistence.jpa.catalog.T62ARepository;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class T62ARepositoryAdapter implements T62APort {

    private final T62ARepository repository;
    private final T62AMapper mapper;

    public T62ARepositoryAdapter(T62ARepository repository, T62AMapper mapper) {
        this.repository = repository;
        this.mapper = mapper;
    }

    @Override
    public List<T62ADto> findAll() {
        return mapper.toDtoList(repository.findAll());
    }

    @Override
    public T62ADto findById(Integer id) {
        Optional<T62AEntity> entity = repository.findById(id);
        return entity.map(mapper::toDto).orElse(null);
    }
}
