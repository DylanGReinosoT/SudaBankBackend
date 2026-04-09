package com.sudamericano.bank.infrastructure.mapper.structure.L;

import com.sudamericano.bank.domain.model.structure.L.L10Dto;
import com.sudamericano.bank.infrastructure.persistence.entity.structure.L.L10Entity;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface L10Mapper {
    L10Dto toDto(L10Entity entity);
    L10Entity toEntity(L10Dto dto);
    List<L10Dto> toDtoList(List<L10Entity> entities);
}
