package com.sudamericano.bank.infrastructure.mapper.structure.L;

import com.sudamericano.bank.domain.model.structure.L.L02Dto;
import com.sudamericano.bank.infrastructure.persistence.entity.structure.L.L02Entity;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface L02Mapper {
    L02Dto toDto(L02Entity entity);
    L02Entity toEntity(L02Dto dto);
    List<L02Dto> toDtoList(List<L02Entity> entities);
}
