package com.sudamericano.bank.infrastructure.adapter.structure.L;

import com.sudamericano.bank.domain.model.structure.L.L03Dto;
import com.sudamericano.bank.domain.model.structure.L.L03ViewDto;
import com.sudamericano.bank.domain.ports.outputs.structure.L.L03Port;
import com.sudamericano.bank.infrastructure.mapper.structure.L.L03Mapper;
import com.sudamericano.bank.infrastructure.persistence.entity.structure.L.L03Entity;
import com.sudamericano.bank.infrastructure.persistence.jpa.structure.L.L03Repository;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Component
public class L03RepositoryAdapter implements L03Port {

    private final L03Repository repository;
    private final L03Mapper mapper;

    public L03RepositoryAdapter(L03Repository repository, L03Mapper mapper) {
        this.repository = repository;
        this.mapper = mapper;
    }

    @Override
    public List<L03Dto> findAll() {
        return mapper.toDtoList(repository.findAll());
    }

    @Override
    public L03Dto findById(Long id) {
        Optional<L03Entity> entity = repository.findById(id);
        return entity.map(mapper::toDto).orElse(null);
    }

    @Override
    public L03Dto create(L03Dto dto) {
        L03Entity saved = repository.save(mapper.toEntity(dto));
        return mapper.toDto(saved);
    }

    @Override
    public L03Dto update(Long id, L03Dto dto) {
        if (!repository.existsById(id)) {
            return null;
        }
        L03Entity entity = mapper.toEntity(dto);
        entity.setId(id);
        return mapper.toDto(repository.save(entity));
    }

    @Override
    public void delete(Long id) {
        repository.deleteById(id);
    }

    @Override
    public List<L03ViewDto> findAllResumenDatosL03() {
        return repository.findAllResumenDatosL03().stream()
                .map(mapper::mapToDto)
                .collect(Collectors.toList());
    }
}
