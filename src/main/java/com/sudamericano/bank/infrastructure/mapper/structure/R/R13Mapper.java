package com.sudamericano.bank.infrastructure.mapper.structure.R;

import com.sudamericano.bank.domain.model.structure.R.R13Dto;
import com.sudamericano.bank.infrastructure.persistence.entity.structure.R.R13Entity;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface R13Mapper {
    R13Dto toDto(R13Entity entity);
    R13Entity toEntity(R13Dto dto);
    List<R13Dto> toDtoList(List<R13Entity> entities);
}
