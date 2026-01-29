package com.sudamericano.bank.infrastructure.mapper.structure.R;

import com.sudamericano.bank.domain.model.structure.R.R21Dto;
import com.sudamericano.bank.infrastructure.persistence.entity.structure.R.R21Entity;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface R21Mapper {
    R21Dto toDto(R21Entity entity);
    R21Entity toEntity(R21Dto dto);
    List<R21Dto> toDtoList(List<R21Entity> entities);
}
