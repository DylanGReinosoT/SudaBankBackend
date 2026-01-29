package com.sudamericano.bank.infrastructure.mapper.structure.L;

import com.sudamericano.bank.domain.model.structure.L.L05Dto;
import com.sudamericano.bank.infrastructure.persistence.entity.structure.L.L05Entity;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface L05Mapper {
    L05Dto toDto(L05Entity entity);
    L05Entity toEntity(L05Dto dto);
    List<L05Dto> toDtoList(List<L05Entity> entities);
}
