package com.sudamericano.bank.infrastructure.mapper.structure.R;

import com.sudamericano.bank.domain.model.structure.R.R12Dto;
import com.sudamericano.bank.infrastructure.persistence.entity.structure.R.R12Entity;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface R12Mapper{
    R12Dto toDto(R12Entity entity);
    R12Entity toEntity(R12Dto dto);
    List<R12Dto> toDtoList(List<R12Entity> entities);
}
