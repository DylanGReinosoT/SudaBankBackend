package com.sudamericano.bank.infrastructure.mapper.structure.R;

import com.sudamericano.bank.domain.model.structure.R.R11Dto;
import com.sudamericano.bank.infrastructure.persistence.entity.structure.R.R11Entity;
import org.mapstruct.Mapper;


import java.util.List;

@Mapper(componentModel = "spring")
public interface R11Mapper {
    R11Dto toDto(R11Entity entity);
    R11Entity toEntity(R11Dto dto);
    List<R11Dto> toDtoList(List<R11Entity> entities);

}
