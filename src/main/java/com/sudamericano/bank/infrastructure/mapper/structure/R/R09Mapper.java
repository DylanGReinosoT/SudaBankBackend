package com.sudamericano.bank.infrastructure.mapper.structure.R;

import com.sudamericano.bank.domain.model.structure.R.R09Dto;
import com.sudamericano.bank.infrastructure.persistence.entity.structure.R.R09Entity;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface R09Mapper {
    R09Dto toDto(R09Entity entity);
    R09Entity toEntity(R09Dto dto);
    List<R09Dto> toDtoList(List<R09Entity> entities);
}
