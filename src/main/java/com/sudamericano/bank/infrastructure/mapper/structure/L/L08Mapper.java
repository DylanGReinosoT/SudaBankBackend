package com.sudamericano.bank.infrastructure.mapper.structure.L;

import com.sudamericano.bank.domain.model.structure.L.L08Dto;
import com.sudamericano.bank.infrastructure.persistence.entity.structure.L.L08Entity;
import org.mapstruct.Mapper;

import java.util.List;
@Mapper(componentModel = "spring")
public interface L08Mapper {
    L08Dto toDto(L08Entity entity);
    L08Entity toEntity(L08Dto dto);
    List<L08Dto> toDtoList(List<L08Entity> entities);
}
