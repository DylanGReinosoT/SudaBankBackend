package com.sudamericano.bank.infrastructure.mapper.structure.R;

import com.sudamericano.bank.domain.model.structure.R.R05Dto;
import com.sudamericano.bank.infrastructure.persistence.entity.structure.R.R05Entity;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface R05Mapper {
    R05Dto toDto(R05Entity entity);
    R05Entity toEntity(R05Dto dto);
    List<R05Dto> toDtoList(List<R05Entity> entities);

}
