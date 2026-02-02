package com.sudamericano.bank.infrastructure.adapter.structure.R21;

import com.sudamericano.bank.domain.model.structure.R21.R21Cabecera;
import com.sudamericano.bank.domain.port.structure.R21.R21RepositoryPort;
import com.sudamericano.bank.infrastructure.mapper.structure.R21.R21CabeceraMapper;
import com.sudamericano.bank.infrastructure.persistence.entity.structure.R21.R21CabeceraEntity;
import com.sudamericano.bank.infrastructure.persistence.jpa.structure.R21.R21CabeceraJpaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Component
@RequiredArgsConstructor
public class R21CabeceraRepositoryAdapter implements R21RepositoryPort {

    private final R21CabeceraJpaRepository jpaRepository;
    private final R21CabeceraMapper mapper;

    @Override
    public R21Cabecera save(R21Cabecera r21Cabecera) {
        R21CabeceraEntity entity = mapper.toEntity(r21Cabecera);
        if (entity.getDetalles() != null) {
            entity.getDetalles().forEach(detalle -> detalle.setCabecera(entity));
        }
        return mapper.toDomain(jpaRepository.save(entity));
    }

    @Override
    public Optional<R21Cabecera> findById(Long id) {
        return jpaRepository.findById(id).map(mapper::toDomain);
    }

    @Override
    public List<R21Cabecera> findAll() {
        return jpaRepository.findAll().stream()
                .map(mapper::toDomain)
                .collect(Collectors.toList());
    }

    @Override
    public void deleteById(Long id) {
        jpaRepository.deleteById(id);
    }
}
