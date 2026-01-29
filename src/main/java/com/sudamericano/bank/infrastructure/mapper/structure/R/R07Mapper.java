package com.sudamericano.bank.infrastructure.mapper.structure.R;

import com.sudamericano.bank.domain.model.structure.R.R07Dto;
import com.sudamericano.bank.infrastructure.persistence.entity.structure.R.R07Entity;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface R07Mapper {
    R07Dto toDto(R07Entity entity);
    R07Entity toEntity(R07Dto dto);
    List<R07Dto> toDtoList(List<R07Entity> entities);
}
