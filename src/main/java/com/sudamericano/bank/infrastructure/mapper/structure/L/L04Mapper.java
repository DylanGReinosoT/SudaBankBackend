package com.sudamericano.bank.infrastructure.mapper.structure.L;

import com.sudamericano.bank.domain.model.structure.L.L04Dto;
import com.sudamericano.bank.infrastructure.persistence.entity.structure.L.L04Entity;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface L04Mapper {
    L04Dto toDto(L04Entity entity);
    L04Entity toEntity(L04Dto dto);
    List<L04Dto> toDtoList(List<L04Entity> entities);
}
