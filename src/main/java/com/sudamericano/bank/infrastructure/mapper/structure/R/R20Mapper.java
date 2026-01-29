package com.sudamericano.bank.infrastructure.mapper.structure.R;

import com.sudamericano.bank.domain.model.structure.R.R20Dto;
import com.sudamericano.bank.infrastructure.persistence.entity.structure.R.R20Entity;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface R20Mapper {
    R20Dto toDto(R20Entity entity);
    R20Entity toEntity(R20Dto dto);
    List<R20Dto> toDtoList(List<R20Entity> entities);
}
