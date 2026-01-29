package com.sudamericano.bank.infrastructure.mapper.structure.R;

import com.sudamericano.bank.domain.model.structure.R.R08Dto;
import com.sudamericano.bank.infrastructure.persistence.entity.structure.R.R08Entity;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface R08Mapper {
    R08Dto toDto(R08Entity entity);
    R08Entity toEntity(R08Dto dto);
    List<R08Dto> toDtoList(List<R08Entity> entities);
}
