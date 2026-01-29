package com.sudamericano.bank.infrastructure.mapper.structure.L;

import com.sudamericano.bank.domain.model.structure.L.L06Dto;
import com.sudamericano.bank.infrastructure.persistence.entity.structure.L.L06Entity;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface L06Mapper {
    L06Dto toDto(L06Entity entity);

    L06Entity toEntity(L06Dto dto);

    List<L06Dto> toDtoList(List<L06Entity> entities);
}

