package com.sudamericano.bank.infrastructure.mapper.structure.L;

import com.sudamericano.bank.domain.model.structure.L.L09Dto;
import com.sudamericano.bank.infrastructure.persistence.entity.structure.L.L09Entity;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface L09Mapper {
    L09Dto toDto(L09Entity entity);
    L09Entity toEntity(L09Dto dto);
    List<L09Dto> toDtoList(List<L09Entity> entities);
}
