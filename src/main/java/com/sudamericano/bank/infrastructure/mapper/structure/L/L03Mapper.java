package com.sudamericano.bank.infrastructure.mapper.structure.L;

import com.sudamericano.bank.domain.model.structure.L.L03Dto;
import com.sudamericano.bank.domain.model.structure.L.L03ViewDto;
import com.sudamericano.bank.infrastructure.persistence.entity.structure.L.L03Entity;
import com.sudamericano.bank.infrastructure.persistence.jpa.structure.L.projection.L03ViewProjection;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface L03Mapper {
    L03Dto toDto(L03Entity entity);
    L03Entity toEntity(L03Dto dto);
    List<L03Dto> toDtoList(List<L03Entity> entities);
    L03ViewDto mapToDto(L03ViewProjection projections);
}
