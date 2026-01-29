package com.sudamericano.bank.infrastructure.mapper.structure.L;

import com.sudamericano.bank.domain.model.structure.L.StructureL01Dto;
import com.sudamericano.bank.infrastructure.persistence.entity.structure.L.L01Entity;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface L01Mapper
{
    StructureL01Dto toDto(L01Entity entity);
    L01Entity toEntity(StructureL01Dto dto);
    List<StructureL01Dto> toDtoList(List<L01Entity> entities);
}
