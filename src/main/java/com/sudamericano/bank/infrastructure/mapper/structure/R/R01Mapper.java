package com.sudamericano.bank.infrastructure.mapper.structure.R;

import com.sudamericano.bank.domain.model.structure.R.R01Dto;
import com.sudamericano.bank.infrastructure.persistence.entity.structure.R.R01Entity;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface R01Mapper {
    R01Dto toDto(R01Entity entity);
    R01Entity toEntity(R01Dto dto);
    List<R01Dto> toDtoList(List<R01Entity> entities);
}
