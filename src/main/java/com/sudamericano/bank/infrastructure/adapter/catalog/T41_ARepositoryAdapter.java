package com.sudamericano.bank.infrastructure.adapter.catalog;

import com.sudamericano.bank.domain.model.catalog.T41_ADto;
import com.sudamericano.bank.domain.ports.outputs.catalog.T41_APort;
import com.sudamericano.bank.infrastructure.mapper.catalog.T41_AMapper;
import com.sudamericano.bank.infrastructure.persistence.jpa.catalog.T41_ARepository;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class T41_ARepositoryAdapter implements T41_APort {
    private final T41_ARepository repository;
    private final T41_AMapper mapper;

    public T41_ARepositoryAdapter(T41_ARepository repository, T41_AMapper mapper) {
        this.repository = repository;
        this.mapper = mapper;
    }

    @Override
    public List<T41_ADto> findAll() {
        return repository.findAll()
                .stream()
                .map(mapper::toDto)
                .toList();
    }

    @Override
    public T41_ADto findById(Integer id) {
        return repository.findById(id)
                .map(mapper::toDto)
                .orElse(null);
    }
}
