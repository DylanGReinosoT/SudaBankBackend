package com.sudamericano.bank.infrastructure.mapper.structure.R;

import com.sudamericano.bank.domain.model.structure.R.R04Dto;
import com.sudamericano.bank.infrastructure.persistence.entity.structure.R.R04Entity;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface R04Mapper {
    R04Dto toDto(R04Entity entity);
    R04Entity toEntity(R04Dto dto);
    List<R04Dto> toDtoList(List<R04Entity> entities);
}
