package com.sudamericano.bank.infrastructure.mapper.structure.R;

import com.sudamericano.bank.domain.model.structure.R.R10Dto;
import com.sudamericano.bank.infrastructure.persistence.entity.structure.R.R10Entity;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface R10Mapper {
    R10Dto toDto(R10Entity entity);
    R10Entity toEntity(R10Dto dto);
    List<R10Dto> toDtoList(List<R10Entity> entities);
}
