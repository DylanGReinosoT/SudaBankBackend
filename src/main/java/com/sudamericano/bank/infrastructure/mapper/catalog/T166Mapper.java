package com.sudamericano.bank.infrastructure.mapper.catalog;

import com.sudamericano.bank.domain.model.catalog.T166Dto;
import com.sudamericano.bank.infrastructure.persistence.entity.catalog.T166Entity;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface T166Mapper {
    T166Dto toDto(T166Entity entity);
    T166Entity toEntity(T166Dto dto);
    List<T166Dto> toDtoList(List<T166Entity> entities);
}
