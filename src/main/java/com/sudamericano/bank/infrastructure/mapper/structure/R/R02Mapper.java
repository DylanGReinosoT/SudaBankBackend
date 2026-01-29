package com.sudamericano.bank.infrastructure.mapper.structure.R;

import com.sudamericano.bank.domain.model.structure.R.R02Dto;
import com.sudamericano.bank.infrastructure.persistence.entity.structure.R.R02Entity;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface R02Mapper {
    R02Dto toDto(R02Entity entity);
    R02Entity toEntity(R02Dto dto);
    List<R02Dto> toDtoList(List<R02Entity> entities);
}
