package com.sudamericano.bank.infrastructure.mapper.structure.R;

import com.sudamericano.bank.domain.model.structure.R.R03Dto;
import com.sudamericano.bank.infrastructure.persistence.entity.structure.R.R03Entity;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface R03Mapper 
{
    R03Dto toDto(R03Entity entity);
    R03Entity toEntity(R03Dto dto);
    List<R03Dto> toDtoList(List<R03Entity> entities);
}
