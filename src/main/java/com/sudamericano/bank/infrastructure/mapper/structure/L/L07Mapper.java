package com.sudamericano.bank.infrastructure.mapper.structure.L;

import com.sudamericano.bank.domain.model.structure.L.L07Dto;
import com.sudamericano.bank.infrastructure.persistence.entity.structure.L.L07Entity;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface L07Mapper {
    L07Dto toDto(L07Entity entity);
    L07Entity toEntity(L07Dto dto);
    List<L07Dto> toDtoList(List<L07Entity> entities);
}
