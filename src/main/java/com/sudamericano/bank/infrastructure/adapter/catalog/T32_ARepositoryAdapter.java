package com.sudamericano.bank.infrastructure.adapter.catalog;

import com.sudamericano.bank.domain.model.catalog.T32_ADto;
import com.sudamericano.bank.domain.ports.outputs.catalog.T32_APort;
import com.sudamericano.bank.infrastructure.mapper.catalog.T32_AMapper;
import com.sudamericano.bank.infrastructure.persistence.jpa.catalog.T32_ARepository;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class T32_ARepositoryAdapter implements T32_APort {

    private final T32_ARepository repository;
    private final T32_AMapper mapper;

    public T32_ARepositoryAdapter(T32_ARepository repository, T32_AMapper mapper) {
        this.repository = repository;
        this.mapper = mapper;
    }

    @Override
    public List<T32_ADto> findAll() {
        return repository.findAll()
                .stream()
                .map(mapper::toDto)
                .toList();
    }

    @Override
    public T32_ADto findById(Integer id) {
        return repository.findById(id)
                .map(mapper::toDto)
                .orElse(null);
    }
}
